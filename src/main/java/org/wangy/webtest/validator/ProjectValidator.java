package org.wangy.webtest.validator;

import org.springframework.util.StringUtils;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import org.wangy.webtest.command.ProjectCommand;
import org.wangy.webtest.service.ProjectService;


/**
 * Created by Administrator on 2015/9/7.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  01/14/2016 17:59
 */
public class ProjectValidator implements Validator {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  /** TODO: DOCUMENT ME! */
  ProjectService projectService;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * setter method for project service.
   *
   * @param  projectService  ProjectService
   */
  public void setProjectService(ProjectService projectService) {
    this.projectService = projectService;
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
    ProjectCommand project = (ProjectCommand) object;

    if (!StringUtils.hasText(project.getProjectName())) {
      errors.rejectValue("name", null, "Name is empty.");
    } else if (project.getProjectName().length() > 20) {
      errors.rejectValue("name", null, "Name cannot be less than 20 characters.");
    } else if (projectService.findProject(project.getProjectName()) == null) {
      errors.rejectValue("name", null, "Name already exists");
    }


  }


} // end class ProjectValidator
