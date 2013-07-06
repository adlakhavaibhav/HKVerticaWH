package com.wh.transformation.core;

import com.wh.common.util.RowProcessor;
import com.wh.transformation.schema.TfDimTable;
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


  public TfDimTable getTfDimTables() {

    final TfDimTable tfDimTable = new TfDimTable();


    DbConnectionUtil.query("select id, table_name, schema_name  from v_catalog.columns where table_name = ? and table_schema = ?", new RowProcessor() {
      @Override
      public void process(ResultSet rs) throws SQLException {

      }
    }, VerticaDataSourceType.VerticaDS, tableName, schemaName);


    return verticaDimTable;
  }
}
