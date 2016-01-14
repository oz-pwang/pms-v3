package org.wangy.webtest.aop;

import java.lang.annotation.Target;

import org.springframework.web.servlet.handler.UserRoleAuthorizationInterceptor;

import org.wangy.webtest.model.Audit.UserAudit;
import org.wangy.webtest.model.User;
import org.wangy.webtest.service.UserAuditService;


/**
 * Created by Administrator on 2015/9/24.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  01/14/2016 17:56
 */
public class UserAuditAdvice {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  /** TODO: DOCUMENT ME! */
  UserAuditService userAuditService;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * setter method for user audit service.
   *
   * @param  userAuditService  UserAuditService
   */
  public void setUserAuditService(UserAuditService userAuditService) {
    this.userAuditService = userAuditService;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * userAuditBefore.
   *
   * @param  user  User
   * @param  id    Integer
   */
  public void userAuditBefore(User user, Integer id) {
    UserAudit userAudit = new UserAudit();
    userAudit.setAge(user.getAge().toString());
    userAudit.setUsername(user.getUsername());
    userAudit.setBirthDate(user.getBirthDateString());
    userAudit.setEmail(user.getEmail());
    userAudit.setGender(user.getGender());
    userAudit.setPassword(user.getPassword());
    userAudit.setPhoneNumber(user.getPhoneNumber());
// userAudit.setRoleId(user.getRole().getId().toString());
    userAudit.setUserId(id.toString());
    userAuditService.saveUserAudit(userAudit);

  }

// public void userAuditAfter(User user) {
// UserAudit userAudit = new UserAudit();
// userAudit.setAge(user.getAge().toString());
// userAudit.setUsername(user.getUsername());
// userAudit.setBirthDate(user.getBirthDateString());
// userAudit.setEmail(user.getEmail());
// userAudit.setGender(user.getGender());
// userAudit.setPassword(user.getPassword());
// userAudit.setPhoneNumber(user.getPhoneNumber());
// userAudit.setRoleId(user.getRole().getId().toString());
// userAudit.setUserId(user.getId().toString());
// userAuditService.saveUserAudit(userAudit);
// }


} // end class UserAuditAdvice
