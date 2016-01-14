package org.wangy.webtest.command;


import java.util.Collection;
import java.util.List;

import org.wangy.webtest.model.User;


/**
 * Created by Administrator on 2015/10/29.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  01/14/2016 17:56
 */
public class JsonCommand<T> {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  private Collection<T> data;
  private String        msg;
  private boolean       success = true;
  private int           total;

  //~ Constructors -----------------------------------------------------------------------------------------------------

  /**
   * Creates a new JsonCommand object.
   *
   * @param  data  Collection
   */
  public JsonCommand(Collection<T> data) {
    this.total = data.size();
    this.data  = data;
  }

  /**
   * Creates a new JsonCommand object.
   *
   * @param  data    Collection
   * @param  total1  int
   */
  public JsonCommand(Collection<T> data, int total1) {
    this.total = total1;
    this.data  = data;
  }

  /**
   * Creates a new JsonCommand object.
   *
   * @param  data     Collection
   * @param  total    int
   * @param  success  boolean
   */
  public JsonCommand(Collection<T> data, int total, boolean success) {
    this.total   = total;
    this.success = success;
    this.data    = data;
  }

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * getter method for data.
   *
   * @return  Collection
   */
  public Collection<T> getData() {
    return data;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for msg.
   *
   * @return  String
   */
  public String getMsg() {
    return msg;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for total.
   *
   * @return  int
   */
  public int getTotal() {
    return total;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for success.
   *
   * @return  boolean
   */
  public boolean isSuccess() {
    return success;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for data.
   *
   * @param  data  Collection
   */
  public void setData(Collection<T> data) {
    this.data = data;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for msg.
   *
   * @param  msg  String
   */
  public void setMsg(String msg) {
    this.msg = msg;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for success.
   *
   * @param  success  boolean
   */
  public void setSuccess(boolean success) {
    this.success = success;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for total.
   *
   * @param  total  int
   */
  public void setTotal(int total) {
    this.total = total;
  }
} // end class JsonCommand
