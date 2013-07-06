package com.wh.transformation.util;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.wh.common.util.AntServiceLocator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.sql.DataSource;

/**
 * Created by IntelliJ IDEA.
 * User: admin
 * Date: Jul 6, 2013
 * Time: 2:22:58 AM
 */
public class DbUtils {

  private static Logger logger = LoggerFactory.getLogger(DbUtils.class);

  public static DataSource addDataSource(DataSourceType dataSourceType, String dbName, String userName, String password, String serverUrl) {
    ComboPooledDataSource cpds = null;
    try {

      cpds = new ComboPooledDataSource();
      cpds.setDriverClass("com.mysql.jdbc.Driver"); // loads the jdbc driver
      cpds.setJdbcUrl("jdbc:mysql://" + serverUrl + "/" + dbName + "?useUnicode=true&characterEncoding=utf-8");
      cpds.setUser(userName);
      cpds.setPassword(password);
      cpds.setMinPoolSize(5);
      cpds.setPreferredTestQuery("SELECT 1");
      cpds.setTestConnectionOnCheckin(true);
      cpds.setTestConnectionOnCheckout(true);
      AntServiceLocator.instance().bindDataSource(dataSourceType.location(), cpds);
    } catch (Exception e) {
      logger.error("Error while adding data source", e);

      throw new IllegalArgumentException("Unable to bind datasource type", e);
    }

    return cpds;
  }
}
