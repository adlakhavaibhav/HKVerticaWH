package com.wh.vertica.schema;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: admin
 * Date: Jul 6, 2013
 * Time: 5:20:34 PM
 */
public class VerticaDimTable extends VerticaBaseTable {


  public VerticaDimTable() {
    colsToIgnoreWhileInsert.add("start_date");
    colsToIgnoreWhileInsert.add("end_date");
    colsToIgnoreWhileInsert.add("is_current");
    colsToIgnoreWhileInsert.add("start_time");
  }


  public String getPrimaryOLTPColumn() {
    for (String columnName : tableColumns) {
      if (columnName.endsWith("_id")) {
        return columnName;
      }
    }
    return null;
  }


  protected Set<String> getColsToIgnoreWhileInsert() {
    Set<String> colsToIgnore = new HashSet<String>();

    colsToIgnore.addAll(colsToIgnoreWhileInsert);

    for (String colName : tableColumns) {
      if (colName.endsWith("_key")) {
        colsToIgnore.add(colName);
      }
    }

    return colsToIgnore;
  }
}
