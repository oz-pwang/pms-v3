package org.wangy.webtest.command;

import java.util.Set;

import org.wangy.webtest.model.Project;
import org.wangy.webtest.model.Task;
import org.wangy.webtest.model.User;


/**
 * Created by Administrator on 2015/9/7.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  01/14/2016 17:56
 */
public class TaskCommand {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  // TaskCommand  attribute
  private Integer id;

  // project attribute
  private Project project;
  private Integer projectId;
  private String  projectName;
  // project attribute end
  private String  taskDescription;
  // TaskCommand  attribute end
  private String  taskName;

  // user attribute
  private User    user;
  private Integer userId;
  // user attribute end
  private String  username;

  //~ Constructors -----------------------------------------------------------------------------------------------------


  /**
   * Creates a new TaskCommand object.
   */
  public TaskCommand() { }

  /**
   * Creates a new TaskCommand object.
   *
   * @param  task  Task
   */
  public TaskCommand(Task task) {
    this.id              = task.getId();
    this.taskName        = task.getTaskName();
    this.taskDescription = task.getTaskDescription();

    if (task.getUser() != null) {
      this.userId   = task.getUser().getId();
      this.username = task.getUser().getUsername();
    }

    if (task.getProject() != null) {
      this.projectId   = task.getProject().getId();
      this.projectName = task.getProject().getProjectName();
    }

  }

  //~ Methods ----------------------------------------------------------------------------------------------------------

  // TaskCommand get and set
  /**
   * getter method for id.
   *
   * @return  Integer
   */
  public Integer getId() {
    return id;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  // project get and set
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
    return projectName;
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

  // user get and set
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
   * getter method for username.
   *
   * @return  String
   */
  public String getUsername() {
    return username;
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
   * setter method for project name.
   *
   * @param  projectName  String
   */
  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }
  // project get and set end

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for task description.
   *
   * @param  taskDescription  String
   */
  public void setTaskDescription(String taskDescription) {
    this.taskDescription = taskDescription;
  }
  // TaskCommand get and set end

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
  // user get and set end

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
   * toTask.
   *
   * @return  Task
   *
   * @throws  Exception  exception
   */
  public Task toTask() throws Exception {
    Task task = new Task();
    task.setId(this.getId());
    task.setTaskName(this.getTaskName());
    task.setTaskDescription(this.getTaskDescription());

    if (this.getUserId() != null) {
      User user = new User();
      user.setId(this.getUserId());
      task.setUser(user);
    }

    if (this.getProjectId() != null) {
      Project project = new Project();
      project.setId(this.getProjectId());
      task.setProject(project);
    }

    return task;
  }

  //~ ------------------------------------------------------------------------------------------------------------------


  /**
   * update.
   *
   * @param  task  Task
   */
  public void update(Task task) {
    User    user    = new User();
    Project project = new Project();
    user.setId(this.getUserId());
    project.setId(this.getProjectId());
    task.setUser(user);
  }


} // end class TaskCommand
