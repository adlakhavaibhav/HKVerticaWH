package com.wh.transformation.schema;

import com.wh.transformation.constants.WhConstants;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: admin
 * Date: Jul 6, 2013
 * Time: 5:10:38 AM
 */
public class DimTable {

  private int id;
  private String tableName;
  private String schemaName;

  private List<DimTableColumn> columns = new ArrayList<DimTableColumn>();

  private DDTable ddTable;


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

  public List<DimTableColumn> getColumns() {
    return columns;
  }

  public void setColumns(List<DimTableColumn> columns) {
    this.columns = columns;
  }

  public DDTable getDdTable() {
    return ddTable;
  }

  public void setDdTable(DDTable ddTable) {
    this.ddTable = ddTable;
  }
}
