package com.wh.transformation.schema;

/**
 * Created by IntelliJ IDEA.
 * User: admin
 * Date: Jul 6, 2013
 * Time: 5:13:11 AM
 */
public class DimTableColumn {

  private int id;
  private String columnName;
  private int order;
  private int dimTableId;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getColumnName() {
    return columnName;
  }

  public void setColumnName(String columnName) {
    this.columnName = columnName;
  }

  public int getOrder() {
    return order;
  }

  public void setOrder(int order) {
    this.order = order;
  }

  public int getDimTableId() {
    return dimTableId;
  }

  public void setDimTableId(int dimTableId) {
    this.dimTableId = dimTableId;
  }
}
