package org.wangy.webtest.model;

import java.io.Serializable;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.*;


/**
 * Created by Administrator on 2015/9/9.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  01/14/2016 17:58
 */
@Entity public class Task implements Serializable {
  //~ Static fields/initializers ---------------------------------------------------------------------------------------

  /** Use serialVersionUID for interoperability. */
  private static final long serialVersionUID = -5293668703136824642L;

  //~ Instance fields --------------------------------------------------------------------------------------------------

  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id private Integer id;

  @JoinColumn(name = "projectId")
  @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.REFRESH })
  private Project project;

  @Transient private Integer projectId;

  @Column(length = 200)
  private String taskDescription;

  @Column(
    unique   = true,
    nullable = false,
    length   = 20
  )
  private String taskName;

  @JoinColumn(name = "userId")
  @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.REFRESH })
  private User user;

  @Transient private Integer userId;

  //~ Methods ----------------------------------------------------------------------------------------------------------

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
   * getter method for project.
   *
   * @return  Project
   */
  public Project getProject() {
    return project;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for project id.
   *
   * @return  Integer
   */
  public Integer getProjectId() {
    return projectId;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for project name.
   *
   * @return  String
   */
  public String getProjectName() {
    if (this.getProject() != null) {
      return this.getProject().getProjectName();
    }

    return null;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for task description.
   *
   * @return  String
   */
  public String getTaskDescription() {
    return taskDescription;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for task name.
   *
   * @return  String
   */
  public String getTaskName() {
    return taskName;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for user.
   *
   * @return  User
   */
  public User getUser() {
    return user;
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
   * getter method for user name.
   *
   * @return  String
   */
  public String getUserName() {
    if (this.getUser() != null) {
      return this.getUser().getUsername();
    }

    return null;
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
   * setter method for project.
   *
   * @param  project  Project
   */
  public void setProject(Project project) {
    this.project = project;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for project id.
   *
   * @param  projectId  Integer
   */
  public void setProjectId(Integer projectId) {
    this.projectId = projectId;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for task description.
   *
   * @param  taskDescription  String
   */
  public void setTaskDescription(String taskDescription) {
    this.taskDescription = taskDescription;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for task name.
   *
   * @param  taskName  String
   */
  public void setTaskName(String taskName) {
    this.taskName = taskName;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for user.
   *
   * @param  user  User
   */
  public void setUser(User user) {
    this.user = user;
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
} // end class Task
