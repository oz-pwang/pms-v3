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
import org.wangy.webtest.model.Role;
import org.wangy.webtest.service.RoleService;


/**
 * Created by Administrator on 2015/10/29.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  01/14/2016 17:56
 */
@Controller
@RequestMapping("/x/role")
public class RoleController {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Autowired private RoleService roleService;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * create.
   *
   * @param   role  Role
   *
   * @return  JsonCommand
   */
  @RequestMapping(
    value  = "/create",
    method = RequestMethod.POST
  )
  @ResponseBody protected JsonCommand create(@RequestBody Role role) {
    role.setId(null);

    Integer id = roleService.save(role);
    role = roleService.get(id);

    List<Role> roles = new ArrayList<Role>(1);
    roles.add(role);

    return new JsonCommand(roles);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * delete.
   *
   * @param   role  Role
   *
   * @return  JsonCommand
   */
  @RequestMapping(
    value  = "/delete",
    method = RequestMethod.POST
  )
  @ResponseBody protected JsonCommand delete(@RequestBody Role role) {
    roleService.delete(role.getId());

    List<Role> roles = roleService.list();

    return new JsonCommand(roles);
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
    List<Role> roles     = roleService.list(startSize, limitSize);

    return new JsonCommand(roles, roleService.getCount());
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * update.
   *
   * @param   role  Role
   *
   * @return  JsonCommand
   */
  @RequestMapping(
    value  = "/update",
    method = RequestMethod.POST
  )
  @ResponseBody protected JsonCommand update(@RequestBody Role role) {
    roleService.update(role);

    List<Role> roles = roleService.list();

    return new JsonCommand(roles);
  }


} // end class RoleController
