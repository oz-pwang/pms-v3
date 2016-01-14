package org.wangy.webtest.dao;

import java.util.List;

import org.wangy.webtest.model.Project;


/**
 * Created by Administrator on 2015/9/8.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  01/14/2016 17:57
 */
public interface ProjectDao {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * delete.
   *
   * @param  id  Integer
   */
  void delete(Integer id);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * findProject.
   *
   * @param   name  String
   *
   * @return  Project
   */
  Project findProject(String name);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * findProjects.
   *
   * @param   query  String
   *
   * @return  List
   */
  List<Project> findProjects(String query);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * get.
   *
   * @param   id  Integer
   *
   * @return  Project
   */
  Project get(Integer id);

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
  List list();

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * list.
   *
   * @param   start     int
   * @param   pageSize  int
   *
   * @return  List
   */
  List<Project> list(int start, int pageSize);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * save.
   *
   * @param   project  Project
   *
   * @return  Integer
   */
  Integer save(Project project);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * update.
   *
   * @param  project  Project
   */
  void update(Project project);
} // end interface ProjectDao
