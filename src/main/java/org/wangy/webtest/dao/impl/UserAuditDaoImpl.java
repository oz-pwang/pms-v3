package org.wangy.webtest.dao.impl;

import org.wangy.webtest.dao.UserAuditDao;
import org.wangy.webtest.model.Audit.UserAudit;


/**
 * Created by Administrator on 2015/9/24.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  01/14/2016 17:57
 */
public class UserAuditDaoImpl extends BaseDaoImpl implements UserAuditDao {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.dao.UserAuditDao#getUserAudit(java.lang.String)
   */
  @Override public UserAudit getUserAudit(String userName) {
    return null;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.dao.UserAuditDao#saveUserAudit(org.wangy.webtest.model.Audit.UserAudit)
   */
  @Override public void saveUserAudit(UserAudit userAudit) {
    getSession().save(userAudit);
  }
}
