package com.wh.transformation.schema;

import com.wh.transformation.constants.WhConstants;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: admin
 * Date: Jul 6, 2013
 * Time: 5:28:00 AM
 */
public class DDTable {

  private int id;
  private String tableName;
  private String schemaName;
  private String alias;

  private List<DDTableColumn> columns = new ArrayList<DDTableColumn>();
  private List<DDTableJoin> joins = new ArrayList<DDTableJoin>();


  public String getQualifiedName() {
    return this.schemaName.concat(WhConstants.REF_OP).concat(this.tableName).concat(" ");
  }

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

  public List<DDTableColumn> getColumns() {
    return columns;
  }

  public void setColumns(List<DDTableColumn> columns) {
    this.columns = columns;
  }

  public List<DDTableJoin> getJoins() {
    return joins;
  }

  public void setJoins(List<DDTableJoin> joins) {
    this.joins = joins;
  }

  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }
}
