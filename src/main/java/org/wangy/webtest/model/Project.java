package org.wangy.webtest.model;

import java.io.Serializable;

import javax.persistence.*;


/**
 * Created by Administrator on 2015/9/8.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  01/14/2016 17:58
 */
@Entity public class Project implements Serializable {
  //~ Static fields/initializers ---------------------------------------------------------------------------------------

  /** Use serialVersionUID for interoperability. */
  private static final long serialVersionUID = -8197800559337916598L;

  //~ Instance fields --------------------------------------------------------------------------------------------------

  @JoinColumn(name = "userId")
  @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.REFRESH })
  private User creator;

  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id private Integer        id;
  @Column(length = 10)
  private String             projectName;
  @Transient private Integer userId;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * getter method for creator.
   *
   * @return  User
   */
  public User getCreator() {
    return creator;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for id.
   *
   * @return  Integer
   */
  public Integer getId() {
    return id;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for project name.
   *
   * @return  String
   */
  public String getProjectName() {
    return projectName;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for user id.
   *
   * @return  Integer
   */
  public Integer getUserId() {
    return userId;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for username.
   *
   * @return  String
   */
  public String getUsername() {
    if (this.getCreator() != null) {
      return this.getCreator().getUsername();
    }

    return null;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for creator.
   *
   * @param  creator  User
   */
  public void setCreator(User creator) {
    this.creator = creator;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for id.
   *
   * @param  id  Integer
   */
  public void setId(Integer id) {
    this.id = id;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for project name.
   *
   * @param  projectName  String
   */
  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for user id.
   *
   * @param  userId  Integer
   */
  public void setUserId(Integer userId) {
    this.userId = userId;
  }
} // end class Project
