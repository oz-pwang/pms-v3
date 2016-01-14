package org.wangy.webtest.validator;

import org.springframework.util.StringUtils;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import org.wangy.webtest.command.TaskCommand;
import org.wangy.webtest.service.TaskService;


/**
 * Created by Administrator on 2015/9/7.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  01/14/2016 17:59
 */
public class TaskValidator implements Validator {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  /** TODO: DOCUMENT ME! */
  TaskService taskService;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * setter method for task service.
   *
   * @param  taskService  TaskService
   */
  public void setTaskService(TaskService taskService) {
    this.taskService = taskService;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.springframework.validation.Validator#supports(java.lang.Class)
   */
  @Override public boolean supports(Class<?> clazz) {
    return false;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.springframework.validation.Validator#validate(java.lang.Object, org.springframework.validation.Errors)
   */
  @Override public void validate(Object object, Errors errors) {
    TaskCommand task = (TaskCommand) object;

    if (!StringUtils.hasText(task.getTaskName())) {
      errors.rejectValue("taskName", null, "Name is empty.");
    } else if (task.getTaskName().length() > 20) {
      errors.rejectValue("taskName", null, "Name cannot be less than 20 characters.");
    } else if (taskService.findTask(task.getTaskName()) != null) {
      errors.rejectValue("taskName", null, "Name already exists");
    }

    if (!StringUtils.hasText(task.getTaskDescription())) {
      if (task.getTaskDescription().length() > 200) {
        errors.rejectValue("taskDescription", null, "Name cannot be less than 20 characters.");
      }
    }

  }


} // end class TaskValidator
