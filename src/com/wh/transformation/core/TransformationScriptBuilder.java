package com.wh.transformation.core;

import com.wh.transformation.constants.WhConstants;
import com.wh.transformation.schema.*;
import org.apache.commons.lang.StringUtils;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: admin
 * Date: Jul 6, 2013
 * Time: 9:49:43 AM
 */
public class TransformationScriptBuilder {

  private static final String DEFAULT_WHERE = "update_dt between  $oldate and $newdate ";


  public static String generateDimSql(DimTable dimTable) {

    return getBaseInsertForDimTable(dimTable).append(getBaseDDSelectForDimTable(dimTable.getDdTable())).toString();

  }


  private static StringBuilder getBaseDDSelectForDimTable(DDTable ddTableForDimTable) {
    StringBuilder baseSelectBuilder = new StringBuilder();

    baseSelectBuilder.append(WhConstants.SELECT_OP);

    int i = 0;
    List<DDTableColumn> ddTableColumnList = ddTableForDimTable.getColumns();
    for (DDTableColumn ddTableColumn : ddTableColumnList) {
      baseSelectBuilder.append(ddTableColumn.getColumnName());
      if (i != ddTableColumnList.size() - 1) {
        baseSelectBuilder.append(WhConstants.COMMA);
      }
      i++;
    }

    baseSelectBuilder.append(WhConstants.FROM).append(ddTableForDimTable.getQualifiedName()).append(" ");

    if (StringUtils.isNotBlank(ddTableForDimTable.getAlias())) {
      baseSelectBuilder.append(ddTableForDimTable.getAlias()).append(" ");
    }

    List<DDTableJoin> ddTableJoins = ddTableForDimTable.getJoins();

    for (DDTableJoin ddTableJoin : ddTableJoins) {
      if (StringUtils.isBlank(ddTableJoin.getJoinType())) {
        baseSelectBuilder.append(WhConstants.INNER_JOIN);
      } else {
        baseSelectBuilder.append(ddTableJoin.getJoinType());
      }

      baseSelectBuilder.append(ddTableJoin.getJoinTableQualifiedName());
      if (StringUtils.isNotBlank(ddTableJoin.getJoinTableAlias())) {
        baseSelectBuilder.append(ddTableJoin.getJoinTableAlias()).append(" ");
      }

      baseSelectBuilder.append(WhConstants.ON);
      baseSelectBuilder.append(ddTableJoin.getLhsCol());
      baseSelectBuilder.append(" = ");
      baseSelectBuilder.append(ddTableJoin.getRhsCol());
    }

    baseSelectBuilder.append(getDefaultWhereForDDSelect(ddTableForDimTable));


    return baseSelectBuilder;
  }


  private static String getDefaultWhereForDDSelect(DDTable ddTableForDimTable) {
    if (StringUtils.isNotBlank(ddTableForDimTable.getAlias())) {
      return WhConstants.WHERE.concat(WhConstants.OPEN_RND_BRACE).concat(ddTableForDimTable.getAlias()).concat(WhConstants.REF_OP)
          .concat(DEFAULT_WHERE).concat(WhConstants.CLOSE_RND_BRACE);
    } else {
      return WhConstants.WHERE.concat(WhConstants.OPEN_RND_BRACE).concat(DEFAULT_WHERE).concat(WhConstants.CLOSE_RND_BRACE);
    }
  }

  private static StringBuilder getBaseInsertForDimTable(DimTable dimTable) {
    StringBuilder baseInsertBuilder = new StringBuilder();

    baseInsertBuilder.append(WhConstants.INSERT_OP).append(dimTable.getQualifiedName());

    baseInsertBuilder.append(WhConstants.OPEN_RND_BRACE);

    int i = 0;
    for (DimTableColumn dimTableColumn : dimTable.getColumns()) {
      baseInsertBuilder.append(dimTableColumn.getColumnName());
      if (i != dimTable.getColumns().size() - 1) {
        baseInsertBuilder.append(WhConstants.COMMA);
      }
      i++;
    }

    baseInsertBuilder.append(WhConstants.CLOSE_RND_BRACE);


    return baseInsertBuilder;
  }
}
