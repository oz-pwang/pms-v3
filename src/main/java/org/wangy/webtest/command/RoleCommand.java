package org.wangy.webtest.command;

import java.util.Set;

import org.wangy.webtest.model.Role;
import org.wangy.webtest.model.User;


/**
 * Created by Administrator on 2015/9/7.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  01/14/2016 17:56
 */
public class RoleCommand {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  private String  description;
  private Integer id;
  private String  name;

  //~ Constructors -----------------------------------------------------------------------------------------------------

  /**
   * Creates a new RoleCommand object.
   */
  public RoleCommand() { }

  /**
   * Creates a new RoleCommand object.
   *
   * @param  role  Role
   */
  public RoleCommand(Role role) {
    this.id          = role.getId();
    this.name        = role.getName();
    this.description = role.getDescription();
  }

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * getter method for description.
   *
   * @return  String
   */
  public String getDescription() {
    return description;
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
   * getter method for name.
   *
   * @return  String
   */
  public String getName() {
    return name;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for description.
   *
   * @param  description  String
   */
  public void setDescription(String description) {
    this.description = description;
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
   * setter method for name.
   *
   * @param  name  String
   */
  public void setName(String name) {
    this.name = name;
  }

  //~ ------------------------------------------------------------------------------------------------------------------


  /**
   * toRole.
   *
   * @return  Role
   *
   * @throws  Exception  exception
   */
  public Role toRole() throws Exception {
    Role role = new Role();
    role.setId(this.getId());
    role.setName(this.getName());
    role.setDescription(this.getDescription());

    return role;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * update.
   *
   * @param  role  Role
   */
  public void update(Role role) {
    role.setDescription(this.getDescription());
  }
  // get and set end
} // end class RoleCommand
