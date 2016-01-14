package org.wangy.webtest.service.impl;

import java.util.List;

import org.wangy.webtest.dao.TaskDao;
import org.wangy.webtest.model.Task;
import org.wangy.webtest.service.TaskService;


/**
 * Created by Administrator on 2015/9/6.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  01/14/2016 17:58
 */
public class TaskServiceImpl implements TaskService {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  private TaskDao taskDao;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.service.TaskService#delete(java.lang.Integer)
   */
  @Override public void delete(Integer id) {
    taskDao.delete(id);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.service.TaskService#findTask(java.lang.String)
   */
  @Override public Task findTask(String name) {
    return taskDao.findTask(name);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.service.TaskService#findTasks(java.lang.String)
   */
  @Override public List<Task> findTasks(String query) {
    return taskDao.findTasks(query);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.service.TaskService#get(java.lang.Integer)
   */
  @Override public Task get(Integer id) {
    return taskDao.get(id);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.service.TaskService#getCount()
   */
  @Override public int getCount() {
    return taskDao.getCount();
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.service.TaskService#list()
   */
  @Override public List<Task> list() {
    return taskDao.list();
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.service.TaskService#list(int, int)
   */
  @Override public List<Task> list(int start, int pageSize) {
    return taskDao.list(start, pageSize);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.service.TaskService#save(org.wangy.webtest.model.Task)
   */
  @Override public Integer save(Task task) {
    return taskDao.save(task);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for task dao.
   *
   * @param  taskDao  TaskDao
   */
  public void setTaskDao(TaskDao taskDao) {
    this.taskDao = taskDao;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.service.TaskService#update(org.wangy.webtest.model.Task)
   */
  @Override public void update(Task task) {
    taskDao.update(task);
  }
} // end class TaskServiceImpl
