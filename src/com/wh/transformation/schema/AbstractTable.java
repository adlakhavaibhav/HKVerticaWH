package com.wh.transformation.schema;

import com.wh.transformation.constants.WhConstants;

import java.util.Set;
import java.util.LinkedHashSet;

/**
 * Created by IntelliJ IDEA.
 * User: Vaibhav
 * Date: Jul 5, 2013
 * Time: 6:43:49 PM
 */
public abstract class AbstractTable {


  protected String tableName;
  protected String schemaName;
  protected String alias;

  protected Set<String> tableColumns = new LinkedHashSet<String>();

  public AbstractTable setAlias(String alias) {
    this.alias = alias;
    return this;
  }

  public String getAlias() {
    return alias;
  }

  public String getQualifiedName() {
    return this.schemaName.concat(WhConstants.REF_OP).concat(this.tableName).concat(" ");
  }


  public AbstractTable(String tableName, String schemaName) {
    this.tableName = tableName;
    this.schemaName = schemaName;
  }


  public AbstractTable addTableColumn(String colName) {
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
