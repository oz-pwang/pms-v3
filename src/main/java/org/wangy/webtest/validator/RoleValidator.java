package org.wangy.webtest.validator;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.util.StringUtils;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import org.wangy.webtest.command.RoleCommand;
import org.wangy.webtest.service.RoleService;


/**
 * Created by Administrator on 2015/9/7.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  01/14/2016 17:59
 */
public class RoleValidator implements Validator {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  /** TODO: DOCUMENT ME! */
  RoleService roleService;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * setter method for role service.
   *
   * @param  roleService  RoleService
   */
  public void setRoleService(RoleService roleService) {
    this.roleService = roleService;
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
    RoleCommand role = (RoleCommand) object;

    if (!StringUtils.hasText(role.getName())) {
      errors.rejectValue("name", null, "Name is empty.");
    } else if (role.getName().length() > 20) {
      errors.rejectValue("name", null, "Name cannot be less than 20 characters.");
    } else if (roleService.findRole(role.getName()) == null) {
      errors.rejectValue("name", null, "Name already exists");
    }

    if (!StringUtils.hasText(role.getDescription())) {
      errors.rejectValue("description", null, "description is empty.");
    } else if (role.getDescription().length() > 255) {
      errors.rejectValue("description", null, "description must be less than 255 characters.");
    }

  }


} // end class RoleValidator
