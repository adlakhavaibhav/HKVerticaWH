package com.wh.transformation.core;

import com.wh.common.util.RowProcessor;
import com.wh.transformation.schema.TfDimTable;
import com.wh.transformation.util.DataSourceType;
import com.wh.transformation.util.DbConnectionUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by IntelliJ IDEA.
 * User: admin
 * Date: Jul 6, 2013
 * Time: 5:09:16 AM
 */
public class TransformationSchemaFinder {


  public TfDimTable getTfDimTable(String dimTableName) {

    final TfDimTable tfDimTable = new TfDimTable();


    DbConnectionUtil.query("select id, table_name, schema_name  from dim_table where table_name = ? ", new RowProcessor() {
      @Override
      public void process(ResultSet rs) throws SQLException {
        int id = rs.getInt("id");
        String tableName = rs.getString("table_name");
        String schemaName = rs.getString("schema_name");
      }
    }, DataSourceType.TransformationDS, dimTableName);


    return tfDimTable;
  }
}
