package org.wangy.webtest.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import org.wangy.webtest.command.JsonCommand;
import org.wangy.webtest.model.Project;
import org.wangy.webtest.model.Task;
import org.wangy.webtest.model.User;
import org.wangy.webtest.service.ProjectService;
import org.wangy.webtest.service.TaskService;
import org.wangy.webtest.service.UserService;


/**
 * Created by Administrator on 2015/10/29.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  01/14/2016 17:56
 */
@Controller
@RequestMapping("/x/task")
public class TaskController {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Autowired private ProjectService projectService;

  @Autowired private TaskService taskService;
  @Autowired private UserService userService;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * create.
   *
   * @param   task  Task
   *
   * @return  JsonCommand
   */
  @RequestMapping(
    value  = "/create",
    method = RequestMethod.POST
  )
  @ResponseBody protected JsonCommand create(@RequestBody Task task) {
    task.setId(null);

    Integer id = taskService.save(task);
    task = taskService.get(id);

    List<Task> tasks = new ArrayList<Task>(1);
    tasks.add(task);

    return new JsonCommand(tasks);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * delete.
   *
   * @param   task  Task
   *
   * @return  JsonCommand
   */
  @RequestMapping(
    value  = "/delete",
    method = RequestMethod.POST
  )
  @ResponseBody protected JsonCommand delete(@RequestBody Task task) {
    taskService.delete(task.getId());

    List<Task> tasks = taskService.list();

    return new JsonCommand(tasks);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * list.
   *
   * @param   request  HttpServletRequest
   *
   * @return  JsonCommand
   */
  @RequestMapping(
    value  = "/list",
    method = RequestMethod.GET
  )
  @ResponseBody protected JsonCommand list(HttpServletRequest request) {
    int        limitSize = Integer.valueOf(request.getParameter("limit"));
    int        startSize = Integer.valueOf(request.getParameter("start"));
    List<Task> tasks     = taskService.list(startSize, limitSize);

    for (Task task : tasks) {
      if (task.getUser() != null) {
        task.setUserId(task.getUser().getId());
      }

      if (task.getProject() != null) {
        task.setProjectId(task.getProject().getId());
      }
    }

    return new JsonCommand(tasks, taskService.getCount());
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * update.
   *
   * @param   task  Task
   *
   * @return  JsonCommand
   */
  @RequestMapping(
    value  = "/update",
    method = RequestMethod.POST
  )
  @ResponseBody protected JsonCommand update(@RequestBody Task task) {
    List<Task> tasks     = new ArrayList<Task>();
    int        userId    = task.getUserId();
    int        projectId = task.getProjectId();
    User       user      = userService.get(userId);
    Project    project   = projectService.get(projectId);
    task.setUser(user);
    task.setProject(project);
    taskService.update(task);
    tasks.add(task);

    return new JsonCommand(tasks);
  }


} // end class TaskController
