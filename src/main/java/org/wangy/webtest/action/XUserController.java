package org.wangy.webtest.action;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.*;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import org.wangy.webtest.command.JsonCommand;
import org.wangy.webtest.model.Role;
import org.wangy.webtest.model.User;
import org.wangy.webtest.service.RoleService;
import org.wangy.webtest.service.UserService;


/**
 * Created by Administrator on 2015/10/29.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  01/14/2016 17:56
 */
@Controller
@RequestMapping("/x/user")
public class XUserController {
  //~ Static fields/initializers ---------------------------------------------------------------------------------------

  private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Autowired private RoleService roleService;

  @Autowired private UserService userService;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * create.
   *
   * @param   user  User
   *
   * @return  JsonCommand
   */
  @RequestMapping(
    value  = "/create",
    method = RequestMethod.POST
  )
  @ResponseBody protected JsonCommand create(@RequestBody User user) {
    user.setId(null);

    Integer id = userService.save(user);
    user = userService.get(id);

    List<User> users = new ArrayList<User>(1);
    users.add(user);

    return new JsonCommand(users);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * delete.
   *
   * @param   user  User
   *
   * @return  JsonCommand
   */
  @RequestMapping(
    value  = "/delete",
    method = RequestMethod.POST
  )
  @ResponseBody protected JsonCommand delete(@RequestBody User user) {
    userService.delete(user.getId());

    List<User> users = userService.list();

    return new JsonCommand(users);
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
    int        a;
    List<User> users     = null;
    String     query     = request.getParameter("query");

    if (query != null) {
      users = userService.findUsers(query, startSize, limitSize);
      a     = userService.getCount(query);
    } else {
      users = userService.list(startSize, limitSize);
      a     = userService.getCount();
    }

    for (User user : users) {
      if (user.getBirthDate() != null) {
        user.setBirthDateString(DATE_FORMAT.format(user.getBirthDate()));
      }

      if (user.getRole() != null) {
        user.setRoleId(user.getRole().getId());
      }
    }

    return new JsonCommand(users, a);
  } // end method list

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * update.
   *
   * @param   user  User
   *
   * @return  JsonCommand
   */
  @RequestMapping(
    value  = "/update",
    method = RequestMethod.POST
  )
  @ResponseBody protected JsonCommand update(@RequestBody User user) {
    if (user.getBirthDateString() != null) {
      try {
        String  strDate = user.getBirthDateString();
        Integer roleId  = user.getRoleId();
        Role    role    = roleService.get(roleId);

        if ((strDate != null) && !"".equals(strDate)) {
          Date date = DATE_FORMAT.parse(strDate);
          user.setBirthDate(date);
        }

        user.setRole(role);
        userService.update(user);

        List<User> users = new ArrayList<User>();
        users.add(user);

        if (user.getBirthDate() != null) {
          user.setBirthDateString(DATE_FORMAT.format(user.getBirthDate()));
        }

        if (user.getRole() != null) {
          user.setRoleId(user.getRole().getId());
        }

        return new JsonCommand(users);
      } catch (ParseException e) {
        e.printStackTrace();
      } // end try-catch
    } // end if

    return null;
  } // end method update


} // end class XUserController
