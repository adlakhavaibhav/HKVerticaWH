package com.wh.vertica.schema;

import java.util.Set;
import java.util.HashSet;

/**
 * Created by IntelliJ IDEA.
 * User: Vaibhav
 * Date: Jul 6, 2013
 * Time: 5:20:42 PM
 */
public class VerticaFactTable extends VerticaBaseTable {


  public VerticaFactTable() {
    colsToIgnoreWhileInsert.add("update_time");
    colsToIgnoreWhileInsert.add("update_date");
    colsToIgnoreWhileInsert.add("current_flag");
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
