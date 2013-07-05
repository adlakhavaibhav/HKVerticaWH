package com.wh.transformation.core;

import com.wh.common.util.RowProcessor;
import com.wh.transformation.util.DbConnectionUtil;
import com.wh.vertica.schema.VerticaDimTable;
import com.wh.vertica.util.VerticaDataSourceType;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by IntelliJ IDEA.
 * User: Vaibhav
 * Date: Jul 6, 2013
 * Time: 5:09:16 AM
 */
public class TransformationSchemaFinder {



  public  getVerticaDimTable(String schemaName, String tableName) {

    final VerticaDimTable verticaDimTable = new VerticaDimTable();
    verticaDimTable.setSchemaName(schemaName);
    verticaDimTable.setTableName(tableName);

    DbConnectionUtil.query("select column_name from v_catalog.columns where table_name = ? and table_schema = ?", new RowProcessor() {
      @Override
      public void process(ResultSet rs) throws SQLException {
        verticaDimTable.addTableColumn(rs.getString(1));
      }
    }, VerticaDataSourceType.VerticaDS, tableName, schemaName);


    return verticaDimTable;
  }
}
