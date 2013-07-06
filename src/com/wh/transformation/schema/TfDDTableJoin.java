package com.wh.transformation.schema;

/**
 * Created by IntelliJ IDEA.
 * User: Vaibhav
 * Date: Jul 6, 2013
 * Time: 5:33:10 AM
 */
public class TfDDTableJoin {

  private int id;

  private String lhsCol;
  private String rhsCol;

  private String joinTableName;
  private String joinTableAlias;
  private int order;
  private int ddTableId;


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getLhsCol() {
    return lhsCol;
  }

  public void setLhsCol(String lhsCol) {
    this.lhsCol = lhsCol;
  }

  public String getRhsCol() {
    return rhsCol;
  }

  public void setRhsCol(String rhsCol) {
    this.rhsCol = rhsCol;
  }

  public String getJoinTableName() {
    return joinTableName;
  }

  public void setJoinTableName(String joinTableName) {
    this.joinTableName = joinTableName;
  }

  public String getJoinTableAlias() {
    return joinTableAlias;
  }

  public void setJoinTableAlias(String joinTableAlias) {
    this.joinTableAlias = joinTableAlias;
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
