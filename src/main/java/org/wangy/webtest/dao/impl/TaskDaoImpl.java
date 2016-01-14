package org.wangy.webtest.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.wangy.webtest.dao.TaskDao;
import org.wangy.webtest.model.Task;


/**
 * Created by Administrator on 2015/9/6.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  01/14/2016 17:57
 */
public class TaskDaoImpl extends BaseDaoImpl implements TaskDao {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.dao.TaskDao#delete(java.lang.Integer)
   */
  @Override public void delete(Integer id) {
    getSession().delete(get(id));
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.dao.TaskDao#findTask(java.lang.String)
   */
  @Override public Task findTask(String name) {
    return (Task) getSession().createQuery("from Task where taskName = ?").setParameter(0, name).setMaxResults(1)
      .uniqueResult();
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.dao.TaskDao#findTasks(java.lang.String)
   */
  @Override public List<Task> findTasks(String query) {
    return getSession().createQuery("from Task where taskName like :q or taskDescription like :q").setParameter("q",
        ("%" + query + "%")).list();
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.dao.TaskDao#get(java.lang.Integer)
   */
  @Override public Task get(Integer id) {
    return (Task) getSession().get(Task.class, id);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.dao.TaskDao#getCount()
   */
  @Override public int getCount() {
    Number number = (Number) getSession().createQuery("select count(id) from Task").uniqueResult();

    return number.intValue();
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.dao.TaskDao#list()
   */
  @Override public List<Task> list() {
    return getSession().createQuery("from Task").list();
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.dao.TaskDao#list(int, int)
   */
  @Override public List<Task> list(int start, int pageSize) {
    return getSession().createQuery("from Task").setFirstResult(start).setMaxResults(pageSize).list();
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.dao.TaskDao#save(org.wangy.webtest.model.Task)
   */
  @Override public Integer save(Task task) {
    return (Integer) getSession().save(task);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.dao.TaskDao#update(org.wangy.webtest.model.Task)
   */
  @Override public void update(Task task) {
    getSession().saveOrUpdate(task);
  }
} // end class TaskDaoImpl
