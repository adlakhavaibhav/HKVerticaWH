package com.wh.common.util;

import javax.naming.NamingException;
import javax.sql.DataSource;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by IntelliJ IDEA.
 * User: Vaibhav
 * Date: Jul 5, 2013
 * Time: 10:33:20 PM
 */
public class AntServiceLocator {

  private static AntServiceLocator _instance = new AntServiceLocator();
  private Map<String, DataSource> dsCache;
  private Map<String, Object> nameMap;


  public static AntServiceLocator instance() {
    return _instance;
  }

  private AntServiceLocator() {
    this.dsCache = new ConcurrentHashMap<String, DataSource>();
    this.nameMap = new ConcurrentHashMap<String, Object>();
  }


  public DataSource getDataSource(String dataSourceName) {
    DataSource dataSource = this.dsCache.get(dataSourceName);

    return dataSource;
  }

  public void bindDataSource(String dataSourceName, DataSource dataSource) throws NamingException {
    this.dsCache.put(dataSourceName, dataSource);
  }

  public void bind(String resourceName, Object resource) {
    this.nameMap.put(resourceName, resource);
  }

  public Object getResource(String resourceName) {
    return this.nameMap.get(resourceName);
  }


}
