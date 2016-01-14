package org.wangy.webtest.dao;

import java.util.List;

import org.wangy.webtest.model.Project;
import org.wangy.webtest.model.Task;


/**
 * Created by Administrator on 2015/9/8.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  01/14/2016 17:57
 */
public interface TaskDao {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * delete.
   *
   * @param  id  Integer
   */
  void delete(Integer id);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * findTask.
   *
   * @param   name  String
   *
   * @return  Task
   */
  Task findTask(String name);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * findTasks.
   *
   * @param   query  String
   *
   * @return  List
   */
  List<Task> findTasks(String query);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * get.
   *
   * @param   id  Integer
   *
   * @return  Task
   */
  Task get(Integer id);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for count.
   *
   * @return  int
   */
  int getCount();

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * list.
   *
   * @return  List
   */
  List<Task> list();

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * list.
   *
   * @param   start     int
   * @param   pageSize  int
   *
   * @return  List
   */
  List<Task> list(int start, int pageSize);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * save.
   *
   * @param   task  Task
   *
   * @return  Integer
   */
  Integer save(Task task);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * update.
   *
   * @param  task  Task
   */
  void update(Task task);
} // end interface TaskDao
