package com.wh.transformation;

import com.wh.transformation.core.TransformationSchemaFinder;
import com.wh.transformation.schema.TfDimTable;
import com.wh.transformation.util.DataSourceType;
import com.wh.transformation.util.DbUtils;

/**
 * Created by IntelliJ IDEA.
 * User: admin
 * Date: Jul 6, 2013
 * Time: 5:01:01 AM
 */
public class GeneratorFromDb {

  public static void main(String[] args) throws Exception {

    String dbServerIp = "127.0.0.1";
    String userName = "root";
    String password = "";
    String dbName = "transformation";


    DbUtils.addDataSource(DataSourceType.TransformationDS, dbName, userName, password.equals("dev") ? "" : password, dbServerIp);



    TransformationSchemaFinder finder = new TransformationSchemaFinder();

    TfDimTable dimTable = finder.getTfDimTable("dim_address");
    TfDimTable dimTable1 = finder.getTfDimTable("dim_pincode");
    System.out.println("test");
  }

}
