package com.wh.vertica.schema;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Vaibhav
 * Date: Jul 6, 2013
 * Time: 12:22:59 AM
 */
public class VerticaSchema {

  private List<VerticaDimTable> dimTables = new ArrayList<VerticaDimTable>();

  private String schemaName;


  public List<VerticaDimTable> getDimTables() {
    return dimTables;
  }

  public void setDimTables(List<VerticaDimTable> dimTables) {
    this.dimTables = dimTables;
  }

  public String getSchemaName() {
    return schemaName;
  }

  public void setSchemaName(String schemaName) {
    this.schemaName = schemaName;
  }
}
