package org.wangy.webtest.dao;

import java.util.List;

import org.wangy.webtest.model.Aop;
import org.wangy.webtest.model.Project;


/**
 * Created by Administrator on 2015/9/23.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  01/14/2016 17:57
 */
public interface AopDao {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * findProject.
   *
   * @param   name  String
   *
   * @return  Aop
   */
  Aop findProject(String name);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * findProjects.
   *
   * @param   query  String
   *
   * @return  List
   */
  List<Aop> findProjects(String query);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * list.
   *
   * @return  List
   */
  List<Aop> list();

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * save.
   *
   * @param  aop  Aop
   */
  void save(Aop aop);
} // end interface AopDao
