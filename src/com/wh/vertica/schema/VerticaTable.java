package com.wh.vertica.schema;

import java.util.Set;
import java.util.LinkedHashSet;

/**
 * Created by IntelliJ IDEA.
 * User: admin
 * Date: Jul 5, 2013
 * Time: 10:44:27 PM
 */
public class VerticaTable {

  protected String tableName;
  protected String schemaName;

  protected Set<String> tableColumns = new LinkedHashSet<String>();


  public boolean isFactTable() {
    return tableName.startsWith("ft_");
  }

  public boolean isDimTable() {
    return tableName.startsWith("dim_");
  }

  public String getPrimaryOLTPColumn() {
    if (isDimTable()) {

      for (String columnName : tableColumns) {
        if (columnName.endsWith("_id")) {
          return columnName;
        }
      }
    }

    return null;
  }

  public VerticaTable addTableColumn(String colName) {
    this.tableColumns.add(colName);
    return this;
  }

  public String getTableName() {
    return tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  public String getSchemaName() {
    return schemaName;
  }

  public void setSchemaName(String schemaName) {
    this.schemaName = schemaName;
  }

  public Set<String> getTableColumns() {
    return tableColumns;
  }

  public void setTableColumns(Set<String> tableColumns) {
    this.tableColumns = tableColumns;
  }
}