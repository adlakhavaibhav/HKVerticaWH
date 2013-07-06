package com.wh.vertica.core;

import com.wh.common.util.RowProcessor;
import com.wh.vertica.schema.VerticaTable;
import com.wh.vertica.schema.VerticaSchema;
import com.wh.vertica.util.VerticaDataSourceType;
import com.wh.vertica.util.VerticaDbConnectionUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: admin
 * Date: Jul 5, 2013
 * Time: 10:43:39 PM
 */
public class VerticaSchemaFinder {

  public VerticaSchema getVerticaSchema(String schemaName) {
    VerticaSchema verticaSchema = new VerticaSchema();

    verticaSchema.setSchemaName(schemaName);

    final Set<String> tablesNamesForSchema = new HashSet<String>();


    VerticaDbConnectionUtil.query("select table_name from v_catalog.tables where table_schema = ?", new RowProcessor() {
      @Override
      public void process(ResultSet rs) throws SQLException {
        tablesNamesForSchema.add(rs.getString(1));
      }
    }, VerticaDataSourceType.VerticaDS, schemaName);


    for (String tableName : tablesNamesForSchema) {
      verticaSchema.getAllTables().add(getVerticaDimTable(schemaName, tableName));
    }

    return verticaSchema;

  }


  public VerticaTable getVerticaDimTable(String schemaName, String tableName) {

    final VerticaTable verticaTable = new VerticaTable();
    verticaTable.setSchemaName(schemaName);
    verticaTable.setTableName(tableName);

    VerticaDbConnectionUtil.query("select column_name from v_catalog.columns where table_name = ? and table_schema = ?", new RowProcessor() {
      @Override
      public void process(ResultSet rs) throws SQLException {
        verticaTable.addTableColumn(rs.getString(1));
      }
    }, VerticaDataSourceType.VerticaDS, tableName, schemaName);


    return verticaTable;
  }


}
