package org.wangy.webtest.model;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.*;


/**
 * Created by Administrator on 2015/9/23.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  01/14/2016 17:58
 */
@Entity public class Aop implements Serializable {
  //~ Static fields/initializers ---------------------------------------------------------------------------------------

  /** Use serialVersionUID for interoperability. */
  private static final long serialVersionUID = 4367135365683479072L;

  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Column private Date date;

  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id private Integer    id;
  @Column private String name;
  @Column private String operation;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * getter method for date.
   *
   * @return  Date
   */
  public Date getDate() {
    return date;
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
   * getter method for name.
   *
   * @return  String
   */
  public String getName() {
    return name;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for operation.
   *
   * @return  String
   */
  public String getOperation() {
    return operation;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for date.
   *
   * @param  date  Date
   */
  public void setDate(Date date) {
    this.date = date;
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
   * setter method for operation.
   *
   * @param  operation  String
   */
  public void setOperation(String operation) {
    this.operation = operation;
  }
} // end class Aop
