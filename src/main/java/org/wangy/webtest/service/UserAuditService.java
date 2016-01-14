package org.wangy.webtest.service;

import org.wangy.webtest.model.Audit.UserAudit;


/**
 * Created by Administrator on 2015/9/24.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  01/14/2016 17:59
 */
public interface UserAuditService {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * getter method for user audit.
   *
   * @param   userName  String
   *
   * @return  UserAudit
   */
  UserAudit getUserAudit(String userName);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * saveUserAudit.
   *
   * @param  userAudit  UserAudit
   */
  void saveUserAudit(UserAudit userAudit);
}
