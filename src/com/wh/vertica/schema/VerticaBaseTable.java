package com.wh.vertica.schema;

import java.util.Set;
import java.util.LinkedHashSet;
import java.util.HashSet;

/**
 * Created by IntelliJ IDEA.
 * User: admin
 * Date: Jul 5, 2013
 * Time: 10:44:27 PM
 */
public abstract class VerticaBaseTable {

  protected String tableName;
  protected String schemaName;

  protected Set<String> tableColumns = new LinkedHashSet<String>();
  protected Set<String> colsToIgnoreWhileInsert = new HashSet<String>();

  private String DEFAULT_SEPARATOR = ",";


  protected VerticaBaseTable() {

  }


  public String getColumnsToInsertAsString() {
    return getColumnsToInsertAsStringSeparatedBy(DEFAULT_SEPARATOR);
  }

  public String getColumnsToInsertAsStringSeparatedBy(String separator) {
    StringBuilder colStringBuilder = new StringBuilder();

    int i = 0;
    Set<String> colsToIgnoreWhileInsertLocal = getColsToIgnoreWhileInsert();
    for (String colName : tableColumns) {

      if (!colsToIgnoreWhileInsertLocal.contains(colName)) {
        colStringBuilder.append(colName);
        if (i != tableColumns.size() - 1) {
          colStringBuilder.append(separator);
        }

      }
      i++;
    }

    return colStringBuilder.toString();
  }

  protected abstract Set<String> getColsToIgnoreWhileInsert();


  public VerticaBaseTable addTableColumn(String colName) {
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
