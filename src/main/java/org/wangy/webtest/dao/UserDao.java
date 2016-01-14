package org.wangy.webtest.dao;

import java.io.Serializable;

import java.util.List;

import org.hibernate.Query;

import org.wangy.webtest.model.User;


/**
 * Created by Yang Wang on 8/26/15.
 *
 * @author   $author$
 * @version  $Revision$, $Date$
 */
public interface UserDao {
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
   * @param   username  DOCUMENT ME!
   * @param   password  DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  User findUser(String username, String password);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * findUsers.
   *
   * @param   query  String
   *
   * @return  List
   */
  List<User> findUsers(String query);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * findUsers.
   *
   * @param   query      String
   * @param   startSize  int
   * @param   limitSize  int
   *
   * @return  List
   */
  List<User> findUsers(String query, int startSize, int limitSize);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param   id  DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  User get(Integer id);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for count.
   *
   * @return  int
   */
  int getCount();

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for count.
   *
   * @param   query  String
   *
   * @return  int
   */
  int getCount(String query);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  List<User> list();

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * list.
   *
   * @param   start     int
   * @param   pageSize  int
   *
   * @return  List
   */
  List<User> list(int start, int pageSize);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param   user  DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  Integer save(User user);

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param  user  DOCUMENT ME!
   */
  void update(User user);
} // end interface UserDao
