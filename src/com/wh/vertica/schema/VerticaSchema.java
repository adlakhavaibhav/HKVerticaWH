package com.wh.vertica.schema;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: admin
 * Date: Jul 6, 2013
 * Time: 12:22:59 AM
 */
public class VerticaSchema {

  private List<VerticaDimTable> dimTables = new ArrayList<VerticaDimTable>();
  private List<VerticaFactTable> factTables = new ArrayList<VerticaFactTable>();

  private String schemaName;


  public VerticaDimTable getDimTableByName(String dimTableName) {

    for (VerticaDimTable verticaDimTable : dimTables) {
      if (verticaDimTable.getTableName().equals(dimTableName)) {
        return verticaDimTable;
      }
    }

    return null;
  }

  public List<VerticaBaseTable> getAllTables() {
    List<VerticaBaseTable> allTables = new ArrayList<VerticaBaseTable>();

    for (VerticaDimTable verticaDimTable : dimTables) {
      allTables.add(verticaDimTable);
    }

    for (VerticaFactTable verticaFactTable : factTables) {
      allTables.add(verticaFactTable);
    }

    return allTables;
  }

  public String getSchemaName() {
    return schemaName;
  }

  public void setSchemaName(String schemaName) {
    this.schemaName = schemaName;
  }

  public List<VerticaDimTable> getDimTables() {
    return dimTables;
  }

  public void setDimTables(List<VerticaDimTable> dimTables) {
    this.dimTables = dimTables;
  }

  public List<VerticaFactTable> getFactTables() {
    return factTables;
  }

  public void setFactTables(List<VerticaFactTable> factTables) {
    this.factTables = factTables;
  }
}
