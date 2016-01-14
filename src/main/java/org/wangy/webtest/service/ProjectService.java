package org.wangy.webtest.service;

import java.util.List;

import org.wangy.webtest.model.Project;


/**
 * Created by Yang Wang on 8/26/15.
 *
 * @author   $author$
 * @version  $Revision$, $Date$
 */
public interface ProjectService {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param  id  DOCUMENT ME!
   */
  void delete(Integer id);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param   name  projectName DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
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
   * DOCUMENT ME!
   *
   * @param   id  DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
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
   * DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  List<Project> list();

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * list.
   *
   * @param   startSize  int
   * @param   limitSize  int
   *
   * @return  List
   */
  List<Project> list(int startSize, int limitSize);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param   project  DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  Integer save(Project project);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param  project  DOCUMENT ME!
   */
  void update(Project project);
} // end interface ProjectService
