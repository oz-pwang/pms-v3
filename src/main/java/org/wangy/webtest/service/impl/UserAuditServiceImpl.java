package org.wangy.webtest.service.impl;

import org.wangy.webtest.dao.UserAuditDao;
import org.wangy.webtest.model.Audit.UserAudit;
import org.wangy.webtest.service.UserAuditService;


/**
 * Created by Administrator on 2015/9/24.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  01/14/2016 17:58
 */
public class UserAuditServiceImpl implements UserAuditService {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  /** TODO: DOCUMENT ME! */
  UserAuditDao userAuditDao;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.service.UserAuditService#getUserAudit(java.lang.String)
   */
  @Override public UserAudit getUserAudit(String userName) {
    return userAuditDao.getUserAudit(userName);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.service.UserAuditService#saveUserAudit(org.wangy.webtest.model.Audit.UserAudit)
   */
  @Override public void saveUserAudit(UserAudit userAudit) {
    userAuditDao.saveUserAudit(userAudit);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for user audit dao.
   *
   * @param  userAuditDao  UserAuditDao
   */
  public void setUserAuditDao(UserAuditDao userAuditDao) {
    this.userAuditDao = userAuditDao;
  }
} // end class UserAuditServiceImpl
