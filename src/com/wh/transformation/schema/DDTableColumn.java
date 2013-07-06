package com.wh.transformation.schema;

/**
 * Created by IntelliJ IDEA.
 * User: admin
 * Date: Jul 6, 2013
 * Time: 5:32:55 AM
 */
public class DDTableColumn {

  private int id;
  private String columnName;
  private int order;
  private int ddTableId;


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

  public int getDdTableId() {
    return ddTableId;
  }

  public void setDdTableId(int ddTableId) {
    this.ddTableId = ddTableId;
  }
}
