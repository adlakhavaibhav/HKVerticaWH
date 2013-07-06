package com.wh.vertica.core;

import com.wh.common.util.RowProcessor;
import com.wh.vertica.schema.VerticaBaseTable;
import com.wh.vertica.schema.VerticaSchema;
import com.wh.vertica.schema.VerticaDimTable;
import com.wh.vertica.schema.VerticaFactTable;
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

  private boolean isFactTable(String tableName) {
    return tableName.startsWith("ft_");
  }

  private boolean isDimTable(String tableName) {
    return tableName.startsWith("dim_");
  }

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

      if (isDimTable(tableName)) {
        VerticaDimTable verticaDimTable = new VerticaDimTable();
        buildVerticaBaseTable(schemaName, tableName, verticaDimTable);
        verticaSchema.getDimTables().add(verticaDimTable);
      }

      if (isFactTable(tableName)) {
        VerticaFactTable verticaFactTable = new VerticaFactTable();
        buildVerticaBaseTable(schemaName, tableName, verticaFactTable);
        verticaSchema.getFactTables().add(verticaFactTable);
      }

    }

    return verticaSchema;
  }


  public void buildVerticaBaseTable(String schemaName, String tableName, final VerticaBaseTable verticaBaseTable) {
    verticaBaseTable.setSchemaName(schemaName);
    verticaBaseTable.setTableName(tableName);

    VerticaDbConnectionUtil.query("select column_name from v_catalog.columns where table_name = ? and table_schema = ?", new RowProcessor() {
      @Override
      public void process(ResultSet rs) throws SQLException {
        verticaBaseTable.addTableColumn(rs.getString(1));
      }
    }, VerticaDataSourceType.VerticaDS, tableName, schemaName);
  }


}
