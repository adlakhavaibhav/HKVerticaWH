package com.wh.vertica.util;

import com.wh.common.util.AntServiceLocator;
import com.wh.common.util.ResultSetExtractor;
import com.wh.common.util.RowProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.sql.DataSource;
import java.sql.*;

/**
 * Created by IntelliJ IDEA.
 * User: admin
 * Date: Jul 5, 2013
 * Time: 10:32:43 PM
 */
public class VerticaDbConnectionUtil {
  private static Logger log = LoggerFactory.getLogger(VerticaDbConnectionUtil.class);

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
    String url = "jdbc:vertica://" + ip + ":5433/" + schemaName;
    Class.forName("ccom.vertica.jdbc.Driver");
    Connection con = DriverManager.getConnection(url, user, password);
    return con;
  }

  /**
   * @param verticaDataSourceType The data source whose connection is to be obtained
   * @return A connection to the specified DataSourceType
   * @throws SQLException
   * @throws RuntimeException When no DataSource of the specified DataSourceType could be found
   */
  public static Connection getConnection(VerticaDataSourceType verticaDataSourceType) throws SQLException {

    DataSource ds = AntServiceLocator.instance().getDataSource(verticaDataSourceType.location());

    if (ds == null)
      throw new SQLException("Could not locate Data Source for the type: " + verticaDataSourceType);

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

  public static <T> T query(String sql, ResultSetExtractor<T> extractor, VerticaDataSourceType verticaDataSourceType, Object... args) {
    Connection conn = null;
    PreparedStatement ps = null;
    try {
      conn = getConnection(verticaDataSourceType);
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

  public static <T> T query(String sql, VerticaDataSourceType verticaDataSourceType, ResultSetExtractor<T> extractor) {
    return query(sql, extractor, verticaDataSourceType, new Object[0]);
  }

  public static void query(String sql, VerticaDataSourceType verticaDataSourceType, RowProcessor processor) {
    query(sql, processor, verticaDataSourceType, new Object[0]);
  }

  public static void query(String sql, RowProcessor processor, VerticaDataSourceType verticaDataSourceType, Object... args) {
    Connection conn = null;
    PreparedStatement ps = null;
    try {
      conn = getConnection(verticaDataSourceType);
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

  public static boolean executeSql(String sql, VerticaDataSourceType verticaDataSourceType) {
    Connection conn = null;
    Statement ps = null;
    try {
      conn = getConnection(verticaDataSourceType);
      ps = conn.createStatement();
      return ps.execute(sql);
    } catch (SQLException se) {
      throw new RuntimeException(se);
    } finally {
      safelyCloseStatement(ps);
      safelyCloseConnection(conn);
    }
  }

  public static int executeUpdateSql(String sql, VerticaDataSourceType verticaDataSourceType) {
    Connection conn = null;
    Statement ps = null;
    try {
      conn = getConnection(verticaDataSourceType);
      ps = conn.createStatement();
      return ps.executeUpdate(sql);
    } catch (SQLException se) {
      throw new RuntimeException(se);
    } finally {
      safelyCloseStatement(ps);
      safelyCloseConnection(conn);
    }
  }

  public static boolean executeSql(String sql, VerticaDataSourceType verticaDataSourceType, Object... args) {
    Connection conn = null;
    PreparedStatement ps = null;
    try {
      conn = getConnection(verticaDataSourceType);
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

  public static int executeUpdateSql(String sql, VerticaDataSourceType verticaDataSourceType, Object... args) {
    Connection conn = null;
    PreparedStatement ps = null;
    try {
      conn = getConnection(verticaDataSourceType);
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
