package com.wh.transformation.schema;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: admin
 * Date: Jul 6, 2013
 * Time: 5:28:00 AM
 */
public class TfDDTable {

  private int id;
  private String tableName;
  private String schemaName;

  private List<TfDDTableColumn> columns = new ArrayList<TfDDTableColumn>();
  private List<TfDDTableJoin> joins = new ArrayList<TfDDTableJoin>();


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
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

  public List<TfDDTableColumn> getColumns() {
    return columns;
  }

  public void setColumns(List<TfDDTableColumn> columns) {
    this.columns = columns;
  }

  public List<TfDDTableJoin> getJoins() {
    return joins;
  }

  public void setJoins(List<TfDDTableJoin> joins) {
    this.joins = joins;
  }
}
