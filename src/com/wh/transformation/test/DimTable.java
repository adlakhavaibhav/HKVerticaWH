package com.wh.transformation.test;

import com.wh.transformation.constants.WhConstants;

/**
 * Created by IntelliJ IDEA.
 * User: Vaibhav
 * Date: Jul 5, 2013
 * Time: 6:32:03 PM
 */
public class DimTable extends AbstractTable {


  public DimTable(String dimTableName) {
    this(dimTableName, WhConstants.DIM_SCHEMA);
  }

  public DimTable(String dimTableName, String schemaName) {
    super(dimTableName, schemaName);
  }


  public StringBuilder getBaseInsert() {
    StringBuilder baseInsertBuilder = new StringBuilder();

    baseInsertBuilder.append(WhConstants.INSERT_OP).append(this.getQualifiedName());

    baseInsertBuilder.append(WhConstants.OPEN_RND_BRACE);

    int i = 0;
    for (String colName : tableColumns) {
      baseInsertBuilder.append(colName);
      if (i != tableColumns.size() - 1) {
        baseInsertBuilder.append(WhConstants.COMMA);
      }
      i++;
    }

    baseInsertBuilder.append(WhConstants.CLOSE_RND_BRACE);


    return baseInsertBuilder;
  }
}
