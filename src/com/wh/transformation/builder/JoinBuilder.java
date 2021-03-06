package com.wh.transformation.builder;

import com.wh.transformation.test.TestDDTable;
import com.wh.transformation.constants.WhConstants;

/**
 * Created by IntelliJ IDEA.
 * User: admin
 * Date: Jul 5, 2013
 * Time: 6:58:50 PM
 */
public class JoinBuilder {

  private String joinType = WhConstants.INNER_JOIN;

  private TestDDTable joinDDTable;


  private String lhsCol;
  private String rhsCol;


  public JoinBuilder setJoinType(String joinType) {
    this.joinType = joinType;
    return this;
  }

  public JoinBuilder setJoinDDTable(TestDDTable joinDDTable) {
    this.joinDDTable = joinDDTable;
    return this;
  }

  public JoinBuilder setLhsCol(String lhsCol) {
    this.lhsCol = lhsCol;
    return this;
  }


  public String getJoinType() {
    return joinType;
  }

  public TestDDTable getJoinDDTable() {
    return joinDDTable;
  }

  public String getLhsCol() {
    return lhsCol;
  }

  public String getRhsCol() {
    return rhsCol;
  }

  public JoinBuilder setRhsCol(String rhsCol) {
    this.rhsCol = rhsCol;
    return this;
  }


  /*public StringBuilder join() {
    StringBuilder joinBuilderStr = new StringBuilder();

    joinBuilderStr.append(joinType).append(joinDDTable.getSchemaName()).append(WhConstants.REF_OP).
        append(joinDDTable.getTableName()).append(WhConstants.ON);
  }*/
}
