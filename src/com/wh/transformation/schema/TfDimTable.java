package com.wh.transformation.schema;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: admin
 * Date: Jul 6, 2013
 * Time: 5:10:38 AM
 */
public class TfDimTable {

  private int id;
  private String tableName;
  private String schemaName;

  private List<TfDimTableColumn> columns = new ArrayList<TfDimTableColumn>();

  private TfDDTable tfDDTable;


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

  public List<TfDimTableColumn> getColumns() {
    return columns;
  }

  public void setColumns(List<TfDimTableColumn> columns) {
    this.columns = columns;
  }

  public TfDDTable getTfDDTable() {
    return tfDDTable;
  }

  public void setTfDDTable(TfDDTable tfDDTable) {
    this.tfDDTable = tfDDTable;
  }
}
