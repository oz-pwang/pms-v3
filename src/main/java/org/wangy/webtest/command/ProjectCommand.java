package org.wangy.webtest.command;

import org.wangy.webtest.model.Project;
import org.wangy.webtest.model.User;
import org.wangy.webtest.service.UserService;


/**
 * Created by Administrator on 2015/9/7.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  01/14/2016 17:56
 */
public class ProjectCommand {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  private User    creator;
  private Integer id;

  private String  projectName;
  private Integer userId;
  private String  username;

  //~ Constructors -----------------------------------------------------------------------------------------------------

  /**
   * Creates a new ProjectCommand object.
   */
  public ProjectCommand() { }

  /**
   * Creates a new ProjectCommand object.
   *
   * @param  project  Project
   */
  public ProjectCommand(Project project) {
    this.id          = project.getId();
    this.projectName = project.getProjectName();
    this.creator     = project.getCreator();

    if (project.getCreator() != null) {
      this.userId   = project.getCreator().getId();
      this.username = project.getCreator().getUsername();
    }
  }

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

  // get an set
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
    return username;
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

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for username.
   *
   * @param  username  String
   */
  public void setUsername(String username) {
    this.username = username;
  }

  //~ ------------------------------------------------------------------------------------------------------------------


  /**
   * toProject.
   *
   * @return  Project
   *
   * @throws  Exception  exception
   */
  public Project toProject() throws Exception {
    Project project = new Project();
    project.setId(this.getId());
    project.setProjectName(this.getProjectName());

    if (this.getUserId() != null) {
      User user = new User();
      user.setId(this.getUserId());
      project.setCreator(user);
    }

    return project;
  }

  //~ ------------------------------------------------------------------------------------------------------------------


  /**
   * update.
   *
   * @param  project  Project
   */
  public void update(Project project) {
    User user = new User();
    user.setId(this.getUserId());
    project.setCreator(user);
  }

} // end class ProjectCommand
