package org.wangy.webtest.dao.impl;

import java.util.List;

import org.wangy.webtest.dao.ProjectDao;
import org.wangy.webtest.dao.RoleDao;
import org.wangy.webtest.model.Project;
import org.wangy.webtest.model.Role;


/**
 * Created by Administrator on 2015/9/6.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  01/14/2016 17:57
 */
public class ProjectDaoImpl extends BaseDaoImpl implements ProjectDao {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.dao.ProjectDao#delete(java.lang.Integer)
   */
  @Override public void delete(Integer id) {
    getSession().delete(get(id));
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.dao.ProjectDao#findProject(java.lang.String)
   */
  @Override public Project findProject(String name) {
    return (Project) getSession().createQuery("from Project where projectName = ?").setParameter(0, name).setMaxResults(
        1).uniqueResult();
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.dao.ProjectDao#findProjects(java.lang.String)
   */
  @Override public List<Project> findProjects(String query) {
    return getSession().createQuery("from Project where projectName like :q or creator like :q").setParameter("q",
        ("%" + query + "%")).list();
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.dao.ProjectDao#get(java.lang.Integer)
   */
  @Override public Project get(Integer id) {
    return (Project) getSession().get(Project.class, id);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.dao.ProjectDao#getCount()
   */
  @Override public int getCount() {
    Number number = (Number) getSession().createQuery("select count(id) from Project").uniqueResult();

    return number.intValue();
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.dao.ProjectDao#list()
   */
  @Override public List<Project> list() {
    return getSession().createQuery("from Project").list();
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.dao.ProjectDao#list(int, int)
   */
  @Override public List<Project> list(int start, int pageSize) {
    return getSession().createQuery("from Project").setFirstResult(start).setMaxResults(pageSize).list();
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.dao.ProjectDao#save(org.wangy.webtest.model.Project)
   */
  @Override public Integer save(Project project) {
    return (Integer) getSession().save(project);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.dao.ProjectDao#update(org.wangy.webtest.model.Project)
   */
  @Override public void update(Project project) {
    getSession().saveOrUpdate(project);
  }
} // end class ProjectDaoImpl
