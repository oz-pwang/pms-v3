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
import org.wangy.webtest.model.User;
import org.wangy.webtest.service.ProjectService;
import org.wangy.webtest.service.UserService;


/**
 * Created by Administrator on 2015/10/29.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  01/14/2016 17:55
 */
@Controller
@RequestMapping("/x/project")
public class ProjectController {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Autowired private ProjectService projectService;
  @Autowired private UserService    userService;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * create.
   *
   * @param   project  Project
   *
   * @return  JsonCommand
   */
  @RequestMapping(
    value  = "/create",
    method = RequestMethod.POST
  )
  @ResponseBody protected JsonCommand create(@RequestBody Project project) {
    project.setId(null);

    Integer id = projectService.save(project);
    project = projectService.get(id);

    List<Project> projects = new ArrayList<Project>(1);
    projects.add(project);

    return new JsonCommand(projects);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * delete.
   *
   * @param   project  Project
   *
   * @return  JsonCommand
   */
  @RequestMapping(
    value  = "/delete",
    method = RequestMethod.POST
  )
  @ResponseBody protected JsonCommand delete(@RequestBody Project project) {
    projectService.delete(project.getId());

    List<Project> projects = projectService.list();

    return new JsonCommand(projects);
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
    int           limitSize = Integer.valueOf(request.getParameter("limit"));
    int           startSize = Integer.valueOf(request.getParameter("start"));
    List<Project> projects  = projectService.list(startSize, limitSize);

    for (Project project : projects) {
      if (project.getCreator() != null) {
        project.setUserId(project.getCreator().getId());
      }
    }

    return new JsonCommand(projects, projectService.getCount());
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * update.
   *
   * @param   project  Project
   *
   * @return  JsonCommand
   */
  @RequestMapping(
    value  = "/update",
    method = RequestMethod.POST
  )
  @ResponseBody protected JsonCommand update(@RequestBody Project project) {
    int  id   = project.getUserId();
    User user = userService.get(id);
    project.setCreator(user);
    projectService.update(project);

    List<Project> projects = new ArrayList<Project>();
    projects.add(project);

    return new JsonCommand(projects);

  }

} // end class ProjectController
