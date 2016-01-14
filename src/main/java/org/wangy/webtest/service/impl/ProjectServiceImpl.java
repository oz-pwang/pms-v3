package org.wangy.webtest.service.impl;

import java.util.List;

import org.wangy.webtest.dao.ProjectDao;
import org.wangy.webtest.model.Project;
import org.wangy.webtest.service.ProjectService;


/**
 * Created by Administrator on 2015/9/6.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  01/14/2016 17:58
 */
public class ProjectServiceImpl implements ProjectService {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  private ProjectDao projectDao;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.service.ProjectService#delete(java.lang.Integer)
   */
  @Override public void delete(Integer id) {
    projectDao.delete(id);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.service.ProjectService#findProject(java.lang.String)
   */
  @Override public Project findProject(String name) {
    return projectDao.findProject(name);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.service.ProjectService#findProjects(java.lang.String)
   */
  @Override public List<Project> findProjects(String query) {
    return projectDao.findProjects(query);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.service.ProjectService#get(java.lang.Integer)
   */
  @Override public Project get(Integer id) {
    return projectDao.get(id);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.service.ProjectService#getCount()
   */
  @Override public int getCount() {
    return projectDao.getCount();
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.service.ProjectService#list()
   */
  @Override public List<Project> list() {
    return projectDao.list();
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.service.ProjectService#list(int, int)
   */
  @Override public List<Project> list(int start, int pageSize) {
    return projectDao.list(start, pageSize);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.service.ProjectService#save(org.wangy.webtest.model.Project)
   */
  @Override public Integer save(Project project) {
    return projectDao.save(project);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for project dao.
   *
   * @param  projectDao  ProjectDao
   */
  public void setProjectDao(ProjectDao projectDao) {
    this.projectDao = projectDao;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  org.wangy.webtest.service.ProjectService#update(org.wangy.webtest.model.Project)
   */
  @Override public void update(Project project) {
    projectDao.update(project);
  }
} // end class ProjectServiceImpl
