package org.wangy.webtest.dao.impl;

import java.util.List;

import org.wangy.webtest.dao.AopDao;
import org.wangy.webtest.model.Aop;


/**
 * Created by Administrator on 2015/9/23.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  01/14/2016 17:57
 */
public class AopDaoImpl extends BaseDaoImpl implements AopDao {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.dao.AopDao#findProject(java.lang.String)
   */
  @Override public Aop findProject(String name) {
    return (Aop) getSession().createQuery("from Aop where name = ?").setParameter(0, name).setMaxResults(1)
      .uniqueResult();
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.dao.AopDao#findProjects(java.lang.String)
   */
  @Override public List<Aop> findProjects(String query) {
    return getSession().createQuery("from Aop where name like :q or operation like :q").setParameter("q",
        ("%" + query + "%")).list();
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.dao.AopDao#list()
   */
  @Override public List<Aop> list() {
    return getSession().createQuery("from Aop").list();
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.dao.AopDao#save(org.wangy.webtest.model.Aop)
   */
  @Override public void save(Aop aop) {
    getSession().save(aop);
  }
} // end class AopDaoImpl
