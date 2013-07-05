package com.wh.transformation.util;

import com.wh.common.util.AntServiceLocator;
import com.wh.common.util.ResultSetExtractor;
import com.wh.common.util.RowProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.sql.DataSource;
import java.sql.*;

/**
 * Created by IntelliJ IDEA.
 * User: Vaibhav
 * Date: Jul 6, 2013
 * Time: 2:23:08 AM
 */
public class DbConnectionUtil {

  private static Logger log = LoggerFactory.getLogger(DbConnectionUtil.class);

  /*
   * Get DB Connection using full known information about the Database
   *
   * throws SQLException
   * throws ClassNotFoundException When Mysql's JDBC Driver class is not found
   */
  public static Connection getStraightConnection(String ip, String schemaName, String user, String password) throws SQLException, ClassNotFoundException {

    /*String url = "jdbc:mysql://127.0.0.1:3306/healthkart_catalog";
 String user = "root";
 String password = "";*/
    String url = "jdbc:mysql://" + ip + ":3306/" + schemaName;
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection(url, user, password);
    return con;
  }

  /**
   * @param dataSourceType The data source whose connection is to be obtained
   * @return A connection to the specified DataSourceType
   * @throws SQLException
   * @throws RuntimeException When no DataSource of the specified DataSourceType could be found
   */
  public static Connection getConnection(DataSourceType dataSourceType) throws SQLException {

    DataSource ds = AntServiceLocator.instance().getDataSource(dataSourceType.location());

    if (ds == null)
      throw new SQLException("Could not locate Data Source for the type: " + dataSourceType);

    return ds.getConnection();
  }


  public static void safelyCloseResources(Connection connection, Statement statement, ResultSet resultSet) {
    safelyCloseResultSet(resultSet);
    safelyCloseStatement(statement);
    safelyCloseConnection(connection);
  }

  public static void safelyCloseResultSet(ResultSet resultSet) {
    if (resultSet != null) {
      try {
        resultSet.close();
      } catch (SQLException sqle) {
        if (log.isErrorEnabled())
          log.error("Could not close SQL ResultSet", sqle);
      }
    }
  }

  // Close connection and ensure that no exception is throw in the process
  public static void safelyCloseConnection(Connection connection) {
    if (connection != null) {
      try {
        connection.close();
      } catch (SQLException sqle) {
        if (log.isErrorEnabled())
          log.error("Could not close SQL Connection", sqle);
      }
    }
  }

  // Close statement and ensure that no exception is throw in the process
  public static void safelyCloseStatement(Statement statement) {
    if (statement != null) {
      try {
        statement.close();
      } catch (SQLException sqle) {
        if (log.isErrorEnabled())
          log.error("Could not close SQL statement", sqle);
      }
    }
  }

  public static <T> T query(String sql, ResultSetExtractor<T> extractor, DataSourceType dataSourceType, Object... args) {
    Connection conn = null;
    PreparedStatement ps = null;
    try {
      conn = getConnection(dataSourceType);
      ps = conn.prepareStatement(sql);
      if (args != null) {
        for (int i = 0; i < args.length; i++) {
          ps.setObject(i + 1, args[i]);
        }
      }
      ResultSet rs = ps.executeQuery();
      return extractor.extract(rs);
    }
    catch (SQLException se) {
      throw new RuntimeException(se);
    }
    finally {
      safelyCloseStatement(ps);
      safelyCloseConnection(conn);
    }
  }

  public static <T> T query(String sql, DataSourceType dataSourceType, ResultSetExtractor<T> extractor) {
    return query(sql, extractor, dataSourceType, new Object[0]);
  }

  public static void query(String sql, DataSourceType dataSourceType, RowProcessor processor) {
    query(sql, processor, dataSourceType, new Object[0]);
  }

  public static void query(String sql, RowProcessor processor, DataSourceType dataSourceType, Object... args) {
    Connection conn = null;
    PreparedStatement ps = null;
    try {
      conn = getConnection(dataSourceType);
      ps = conn.prepareStatement(sql);
      if (args != null) {
        for (int i = 0; i < args.length; i++) {
          ps.setObject(i + 1, args[i]);
        }
      }
      ResultSet rs = ps.executeQuery();
      while (rs.next()) {
        processor.process(rs);
      }
      rs.close();
    } catch (SQLException se) {
      throw new RuntimeException(se);
    } finally {
      /*System.out.println("closing connection");*/
      safelyCloseStatement(ps);
      safelyCloseConnection(conn);

      /*System.out.println("closed connection");*/
    }
  }

  public static boolean executeSql(String sql, DataSourceType dataSourceType) {
    Connection conn = null;
    Statement ps = null;
    try {
      conn = getConnection(dataSourceType);
      ps = conn.createStatement();
      return ps.execute(sql);
    } catch (SQLException se) {
      throw new RuntimeException(se);
    } finally {
      safelyCloseStatement(ps);
      safelyCloseConnection(conn);
    }
  }

  public static int executeUpdateSql(String sql, DataSourceType dataSourceType) {
    Connection conn = null;
    Statement ps = null;
    try {
      conn = getConnection(dataSourceType);
      ps = conn.createStatement();
      return ps.executeUpdate(sql);
    } catch (SQLException se) {
      throw new RuntimeException(se);
    } finally {
      safelyCloseStatement(ps);
      safelyCloseConnection(conn);
    }
  }

  public static boolean executeSql(String sql, DataSourceType dataSourceType, Object... args) {
    Connection conn = null;
    PreparedStatement ps = null;
    try {
      conn = getConnection(dataSourceType);
      ps = conn.prepareStatement(sql);
      if (args != null) {
        for (int i = 0; i < args.length; i++) {
          ps.setObject(i + 1, args[i]);
        }
      }
      return ps.execute();
    } catch (SQLException se) {
      throw new RuntimeException(se);
    } finally {
      safelyCloseStatement(ps);
      safelyCloseConnection(conn);
    }
  }

  public static int executeUpdateSql(String sql, DataSourceType dataSourceType, Object... args) {
    Connection conn = null;
    PreparedStatement ps = null;
    try {
      conn = getConnection(dataSourceType);
      ps = conn.prepareStatement(sql);
      if (args != null) {
        for (int i = 0; i < args.length; i++) {
          ps.setObject(i + 1, args[i]);
        }
      }
      return ps.executeUpdate();
    } catch (SQLException se) {
      throw new RuntimeException(se);
    } finally {
      safelyCloseStatement(ps);
      safelyCloseConnection(conn);
    }
  }

  //use inly in case sql queries multiple databases
  public static boolean executeSql(String sql, String ip, String schemaName, String user, String password) {
    Connection conn = null;
    Statement ps = null;
    try {
      conn = getStraightConnection(ip, schemaName, user, password);
      ps = conn.createStatement();
      return ps.execute(sql);
    } catch (ClassNotFoundException cnfe) {
      throw new RuntimeException(cnfe);
    } catch (SQLException se) {
      throw new RuntimeException(se);
    } finally {
      safelyCloseStatement(ps);
      safelyCloseConnection(conn);
    }
  }
}
