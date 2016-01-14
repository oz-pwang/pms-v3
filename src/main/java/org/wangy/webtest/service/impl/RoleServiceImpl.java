package org.wangy.webtest.service.impl;

import java.util.List;

import org.wangy.webtest.dao.RoleDao;
import org.wangy.webtest.model.Role;
import org.wangy.webtest.service.RoleService;


/**
 * Created by Administrator on 2015/9/6.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  01/14/2016 17:58
 */
public class RoleServiceImpl implements RoleService {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  private RoleDao roleDao;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.service.RoleService#delete(java.lang.Integer)
   */
  @Override public void delete(Integer id) {
    roleDao.delete(id);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.service.RoleService#findRole(java.lang.String)
   */
  @Override public Role findRole(String name) {
    return roleDao.findRole(name);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.service.RoleService#findRoles(java.lang.String)
   */
  @Override public List<Role> findRoles(String query) {
    return roleDao.findRoles(query);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.service.RoleService#get(java.lang.Integer)
   */
  @Override public Role get(Integer id) {
    return roleDao.get(id);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.service.RoleService#getCount()
   */
  @Override public int getCount() {
    return roleDao.getCount();
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.service.RoleService#list()
   */
  @Override public List<Role> list() {
    return roleDao.list();
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.service.RoleService#list(int, int)
   */
  @Override public List<Role> list(int start, int pageSize) {
    return roleDao.list(start, pageSize);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.service.RoleService#save(org.wangy.webtest.model.Role)
   */
  @Override public Integer save(Role role) {
    return roleDao.save(role);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for role dao.
   *
   * @param  roleDao  RoleDao
   */
  public void setRoleDao(RoleDao roleDao) {
    this.roleDao = roleDao;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.service.RoleService#update(org.wangy.webtest.model.Role)
   */
  @Override public void update(Role role) {
    roleDao.update(role);
  }
} // end class RoleServiceImpl
