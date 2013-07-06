package com.wh.vertica;

import com.wh.common.io.ResultWriter;
import com.wh.vertica.core.VerticaSchemaFinder;
import com.wh.vertica.core.VerticaScriptBuilder;
import com.wh.vertica.schema.VerticaTable;
import com.wh.vertica.schema.VerticaSchema;
import com.wh.vertica.util.VerticaDataSourceType;
import com.wh.vertica.util.VerticaDbUtils;

/**
 * Created by IntelliJ IDEA.
 * User: praveen
 * Date: Jul 5, 2013
 * Time: 9:29:35 PM
 */
public class VerticaDbTest {

  private static ResultWriter writer;
  private static String stagSchemaName = "staging";
  private static String prodSchemaName = "hk_warehouse";


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
    VerticaDbUtils.addDataSource(VerticaDataSourceType.VerticaDS, dbName, userName, password.equals("dev") ? "" : password, dbServerIp);

    /*VerticaTable verticaDimTable = verticaSchemaFinder.getVerticaDimTable(stagSchemaName, "dim_pincode");*/
    VerticaScriptBuilder scriptBuilder = new VerticaScriptBuilder(prodSchemaName, stagSchemaName);


    VerticaSchemaFinder verticaSchemaFinder = new VerticaSchemaFinder();
    VerticaSchema verticaSchema = verticaSchemaFinder.getVerticaSchema(prodSchemaName);

    VerticaDbTest dbTest = new VerticaDbTest();


    dbTest.generateProjectionsForSchema(verticaSchema);
    dbTest.generateEndDtAndActiveUpdateSql(verticaSchema);


    /* String updateEndDtAndActiveSql = scriptBuilder.getUpdateEndDtAndActiveSqlForProd("dim_address", "dim_address", "address_id");*/


    getWriter().close();


    System.out.println("ttst");

  }


  public void generateEndDtAndActiveUpdateSql(VerticaSchema verticaSchema) {
    VerticaScriptBuilder scriptBuilder = new VerticaScriptBuilder(prodSchemaName, stagSchemaName);

    for (VerticaTable verticaTable : verticaSchema.getDimTables()) {
      String updateEndDtAndActiveSql = scriptBuilder.getUpdateEndDtAndActiveSqlForProd(verticaTable.getTableName(), verticaTable.getTableName(), verticaTable.getPrimaryOLTPColumn());


      getWriter().append(updateEndDtAndActiveSql).append("\n");
    }


  }


  public void generateProjectionsForSchema(VerticaSchema verticaSchema) {
    VerticaScriptBuilder scriptBuilder = new VerticaScriptBuilder(prodSchemaName, stagSchemaName);

    for (VerticaTable verticaTable : verticaSchema.getAllTables()) {
      String projectionSql = scriptBuilder.generateProjection(verticaTable.getSchemaName(), verticaTable.getTableName());


      getWriter().append(projectionSql).append("\n");
    }


  }

  public static ResultWriter getWriter() {
    return writer;
  }
}
