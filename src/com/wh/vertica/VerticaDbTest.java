package com.wh.vertica;

import com.wh.common.io.ResultWriter;
import com.wh.vertica.schema.VerticaDimTable;
import com.wh.vertica.schema.VerticaSchema;
import com.wh.vertica.core.VerticaSchemaFinder;
import com.wh.vertica.util.VerticaDataSourceType;
import com.wh.vertica.util.VerticaDbUtils;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: praveen
 * Date: Jul 5, 2013
 * Time: 9:29:35 PM
 */
public class VerticaDbTest {

  private static ResultWriter writer;


  static {
    writer = new ResultWriter("C:\\drives\\test.sql");
  }

  public static void main(String[] args) throws Exception {
    /*String url = "jdbc:vertica://192.168.1.92:5433/warehouse";
    Class.forName("com.vertica.jdbc.Driver");
    Connection con = DriverManager.getConnection(url, "dbadmin", "warehouse");*/


    String dbServerIp = "192.168.1.92";
    String userName = "dbadmin";
    String password = "warehouse";
    String dbName = "warehouse";

    String stagSchemaName = "staging";
    String prodSchemaName = "staging";

    VerticaDbUtils.addDataSource(VerticaDataSourceType.VerticaDS, dbName, userName, password.equals("dev") ? "" : password, dbServerIp);

    VerticaSchemaFinder verticaSchemaFinder = new VerticaSchemaFinder();

    VerticaSchema verticaSchema = verticaSchemaFinder.getVerticaSchema(stagSchemaName);

    VerticaDimTable verticaDimTable = verticaSchemaFinder.getVerticaDimTable(stagSchemaName, "dim_pincode");


    String sql = verticaSchemaFinder.getIdsToInsertOnProdSql(prodSchemaName, stagSchemaName, "dim_pincode", "dim_pincode_copy", "pincode_key");

    getWriter().append(sql);
    getWriter().flush();
    getWriter().close();

    List<Integer> idsToInsert = verticaSchemaFinder.getIdsToInsertOnProd(prodSchemaName, stagSchemaName, "dim_pincode", "dim_pincode_copy", "pincode_key");


    System.out.println("ttst");

  }


  public static ResultWriter getWriter() {
    return writer;
  }
}
