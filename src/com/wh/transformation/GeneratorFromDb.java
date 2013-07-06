package com.wh.transformation;

import com.wh.transformation.core.TransformationSchemaFinder;
import com.wh.transformation.core.TransformationScriptBuilder;
import com.wh.transformation.schema.DimTable;
import com.wh.transformation.util.DataSourceType;
import com.wh.transformation.util.DbUtils;
import com.wh.common.io.ResultWriter;

/**
 * Created by IntelliJ IDEA.
 * User: admin
 * Date: Jul 6, 2013
 * Time: 5:01:01 AM
 */
public class GeneratorFromDb {

  private static ResultWriter writer;


  static {
    writer = new ResultWriter("C:\\drives\\test1.sql");
  }

  public static void main(String[] args) throws Exception {

    String dbServerIp = "127.0.0.1";
    String userName = "root";
    String password = "";
    String dbName = "transformation";


    DbUtils.addDataSource(DataSourceType.TransformationDS, dbName, userName, password.equals("dev") ? "" : password, dbServerIp);


    TransformationSchemaFinder finder = new TransformationSchemaFinder();

    DimTable dimTable = finder.getDimTable("dim_address");
    DimTable dimTable1 = finder.getDimTable("dim_pincode");


    getWriter().append(TransformationScriptBuilder.generateDimSql(dimTable));
    getWriter().append("\n");
    getWriter().append(TransformationScriptBuilder.generateDimSql(dimTable1));
    getWriter().flush();
    getWriter().close();


  }


  public static ResultWriter getWriter() {
    return writer;
  }

}
