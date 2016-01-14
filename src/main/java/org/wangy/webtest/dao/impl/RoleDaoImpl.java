package org.wangy.webtest.dao.impl;

import java.util.List;

import org.wangy.webtest.dao.RoleDao;
import org.wangy.webtest.model.Role;


/**
 * Created by Administrator on 2015/9/6.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  01/14/2016 17:57
 */
public class RoleDaoImpl extends BaseDaoImpl implements RoleDao {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.dao.RoleDao#delete(java.lang.Integer)
   */
  @Override public void delete(Integer id) {
    getSession().delete(get(id));
  }

  //~ ------------------------------------------------------------------------------------------------------------------


  /**
   * @see  org.wangy.webtest.dao.RoleDao#findRole(java.lang.String)
   */
  @Override public Role findRole(String name) {
    return (Role) getSession().createQuery("from Role where name = ?").setParameter(0, name).setMaxResults(1)
      .uniqueResult();
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.dao.RoleDao#findRoles(java.lang.String)
   */
  @Override public List<Role> findRoles(String query) {
    return getSession().createQuery("from Role where name like :q or description like :q").setParameter("q",
        ("%" + query + "%")).list();
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.dao.RoleDao#get(java.lang.Integer)
   */
  @Override public Role get(Integer id) {
    return (Role) getSession().get(Role.class, id);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.dao.RoleDao#getCount()
   */
  @Override public int getCount() {
    Number number = (Number) getSession().createQuery("select count(id) from Role").uniqueResult();

    return number.intValue();
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.dao.RoleDao#list()
   */
  @Override public List<Role> list() {
    return getSession().createQuery("from Role").list();
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.dao.RoleDao#list(int, int)
   */
  @Override public List<Role> list(int start, int pageSize) {
    return getSession().createQuery("from Role").setFirstResult(start).setMaxResults(pageSize).list();
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.dao.RoleDao#save(org.wangy.webtest.model.Role)
   */
  @Override public Integer save(Role role) {
    return (Integer) getSession().save(role);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.dao.RoleDao#update(org.wangy.webtest.model.Role)
   */
  @Override public void update(Role role) {
    getSession().saveOrUpdate(role);
  }
} // end class RoleDaoImpl
