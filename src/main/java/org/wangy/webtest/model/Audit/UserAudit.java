package org.wangy.webtest.model.Audit;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.*;

import org.wangy.webtest.model.Role;


/**
 * Created by Administrator on 2015/9/23.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  01/14/2016 17:58
 */
@Entity public class UserAudit implements Serializable {
  //~ Static fields/initializers ---------------------------------------------------------------------------------------

  /** Use serialVersionUID for interoperability. */
  private static final long serialVersionUID = -7724376285856145905L;

  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Column private String age;

  @Column private String birthDate;

  @Column private Date createDate;

  @Column private String email;

  @Column private String gender;

  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id private Integer id;

  @Column private String password;

  @Column private String phoneNumber;

  @Column private String roleId;

  @Column private String userId;

  @Column private String username;

  //~ Methods ----------------------------------------------------------------------------------------------------------


  /**
   * getter method for age.
   *
   * @return  String
   */
  public String getAge() {
    return age;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for birth date.
   *
   * @return  String
   */
  public String getBirthDate() {
    return birthDate;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for create date.
   *
   * @return  Date
   */
  public Date getCreateDate() {
    return createDate;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for email.
   *
   * @return  String
   */
  public String getEmail() {
    return email;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for gender.
   *
   * @return  String
   */
  public String getGender() {
    return gender;
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
   * getter method for password.
   *
   * @return  String
   */
  public String getPassword() {
    return password;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for phone number.
   *
   * @return  String
   */
  public String getPhoneNumber() {
    return phoneNumber;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for role id.
   *
   * @return  String
   */
  public String getRoleId() {
    return roleId;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for user id.
   *
   * @return  String
   */
  public String getUserId() {
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
   * setter method for age.
   *
   * @param  age  String
   */
  public void setAge(String age) {
    this.age = age;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for birth date.
   *
   * @param  birthDate  String
   */
  public void setBirthDate(String birthDate) {
    this.birthDate = birthDate;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for create date.
   *
   * @param  createDate  Date
   */
  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for email.
   *
   * @param  email  String
   */
  public void setEmail(String email) {
    this.email = email;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for gender.
   *
   * @param  gender  String
   */
  public void setGender(String gender) {
    this.gender = gender;
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
   * setter method for password.
   *
   * @param  password  String
   */
  public void setPassword(String password) {
    this.password = password;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for phone number.
   *
   * @param  phoneNumber  String
   */
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for role id.
   *
   * @param  roleId  String
   */
  public void setRoleId(String roleId) {
    this.roleId = roleId;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for user id.
   *
   * @param  userId  String
   */
  public void setUserId(String userId) {
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
} // end class UserAudit
