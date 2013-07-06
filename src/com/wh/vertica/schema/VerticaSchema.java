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

  private List<VerticaTable> allTables = new ArrayList<VerticaTable>();

  private String schemaName;


  public List<VerticaTable> getDimTables() {
    List<VerticaTable> dimTables = new ArrayList<VerticaTable>();

    for (VerticaTable verticaTable : allTables) {
      if (verticaTable.isDimTable()) {
        dimTables.add(verticaTable);
      }
    }

    return dimTables;
  }


  public List<VerticaTable> getAllTables() {
    return allTables;
  }

  public void setAllTables(List<VerticaTable> allTables) {
    this.allTables = allTables;
  }

  public String getSchemaName() {
    return schemaName;
  }

  public void setSchemaName(String schemaName) {
    this.schemaName = schemaName;
  }
}
