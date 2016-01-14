package org.wangy.webtest.aop;

import org.aspectj.lang.JoinPoint;


/**
 * TODO: DOCUMENT ME!
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  01/14/2016 17:56
 */
public class LoggerAdvice {
  //~ Methods ----------------------------------------------------------------------------------------------------------


  /**
   * logBefore.
   *
   * @param   joinPoint  JoinPoint
   *
   * @throws  Throwable  exception
   */
  public void logBefore(JoinPoint joinPoint) throws Throwable {
    System.out.println("logBefore() is running!");
    System.out.println("hijacked : " + joinPoint.getSignature().getName());
    System.out.println("******");
  }
}
