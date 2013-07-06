package com.wh.vertica;

import com.wh.common.io.ResultWriter;
import com.wh.vertica.core.VerticaSchemaFinder;
import com.wh.vertica.core.VerticaScriptBuilder;
import com.wh.vertica.schema.VerticaBaseTable;
import com.wh.vertica.schema.VerticaDimTable;
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

    VerticaSchemaFinder verticaSchemaFinder = new VerticaSchemaFinder();
    VerticaSchema verticaSchema = verticaSchemaFinder.getVerticaSchema(prodSchemaName);


    /*VerticaBaseTable verticaDimTable = verticaSchemaFinder.getVerticaDimTable(stagSchemaName, "dim_pincode");*/
    VerticaScriptBuilder scriptBuilder = new VerticaScriptBuilder(prodSchemaName, stagSchemaName, verticaSchema);      // only for testing


    VerticaDbTest dbTest = new VerticaDbTest();


    dbTest.generateProjectionsForSchema(verticaSchema);
    dbTest.generateEndDtAndActiveUpdateSql(verticaSchema);
    dbTest.generateInsertSqlForDimTables(verticaSchema);


    /*String updateEndDtAndActiveSql = scriptBuilder.getInsertSqlForProd("dim_address", "dim_address");

    System.out.println(updateEndDtAndActiveSql);*/

    getWriter().close();


    System.out.println("ttst");

  }

  public void generateInsertSqlForDimTables(VerticaSchema verticaSchema) {
    VerticaScriptBuilder scriptBuilder = new VerticaScriptBuilder(prodSchemaName, stagSchemaName, verticaSchema);

    for (VerticaDimTable verticaDimTable : verticaSchema.getDimTables()) {
      String insertDimSql = scriptBuilder.getInsertSqlForProd(verticaDimTable.getTableName(), verticaDimTable.getTableName());


      getWriter().append(insertDimSql).append("\n");
    }


  }


  public void generateEndDtAndActiveUpdateSql(VerticaSchema verticaSchema) {
    VerticaScriptBuilder scriptBuilder = new VerticaScriptBuilder(prodSchemaName, stagSchemaName, verticaSchema);

    for (VerticaDimTable verticaDimTable : verticaSchema.getDimTables()) {
      String updateEndDtAndActiveSql = scriptBuilder.getUpdateEndDtAndActiveSqlForProd(verticaDimTable.getTableName(), verticaDimTable.getTableName(), verticaDimTable.getPrimaryOLTPColumn());


      getWriter().append(updateEndDtAndActiveSql).append("\n");
    }


  }


  public void generateProjectionsForSchema(VerticaSchema verticaSchema) {
    VerticaScriptBuilder scriptBuilder = new VerticaScriptBuilder(prodSchemaName, stagSchemaName, verticaSchema);

    for (VerticaBaseTable verticaBaseTable : verticaSchema.getAllTables()) {
      String projectionSql = scriptBuilder.generateProjection(verticaBaseTable.getSchemaName(), verticaBaseTable.getTableName());


      getWriter().append(projectionSql).append("\n");
    }


  }

  public static ResultWriter getWriter() {
    return writer;
  }
}
