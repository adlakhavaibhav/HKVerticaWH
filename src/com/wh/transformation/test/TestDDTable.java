package com.wh.transformation.test;

import com.wh.transformation.builder.JoinBuilder;
import com.wh.transformation.constants.WhConstants;
import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: admin
 * Date: Jul 5, 2013
 * Time: 6:43:23 PM
 */
public class TestDDTable extends AbstractTable {

  private static final String DEFAULT_WHERE = "update_dt between  $oldate and $newdate ";

  private List<JoinBuilder> joinBuilders = new ArrayList<JoinBuilder>();


  public TestDDTable addJoinBuilder(JoinBuilder joinBuilder) {
    this.joinBuilders.add(joinBuilder);
    return this;
  }

  public TestDDTable(String tableName, String schemaName) {
    super(tableName, schemaName);

  }

  public TestDDTable(String tableName) {
    this(tableName, WhConstants.DD_SCHEMA);
  }


  /* public String getPrimaryKeyCol() {
    return primaryKeyCol;
  }*/

  /*public TestDDTable primaryKeyCol(String primaryKeyCol) {
    this.primaryKeyCol = primaryKeyCol;
    return this;
  }*/

  public StringBuilder getBaseSelect() {
    StringBuilder baseSelectBuilder = new StringBuilder();

    baseSelectBuilder.append(WhConstants.SELECT_OP);
    // .append(this.schemaName).append(WhConstants.REF_OP).append(this.tableName);


    int i = 0;
    for (String colName : tableColumns) {
      baseSelectBuilder.append(colName);
      if (i != tableColumns.size() - 1) {
        baseSelectBuilder.append(WhConstants.COMMA);
      }
      i++;
    }

    baseSelectBuilder.append(WhConstants.FROM).append(this.getQualifiedName());

    if (StringUtils.isNotBlank(this.alias)) {
      baseSelectBuilder.append(this.alias).append(" ");
    }

    //JoinBuilder prevJoinBuilder = null;

    for (JoinBuilder joinBuilder : joinBuilders) {
      baseSelectBuilder.append(joinBuilder.getJoinType()).append(joinBuilder.getJoinDDTable().getQualifiedName());
      if (StringUtils.isNotBlank(joinBuilder.getJoinDDTable().getAlias())) {
        baseSelectBuilder.append(joinBuilder.getJoinDDTable().getAlias()).append(" ");
      }

      baseSelectBuilder.append(WhConstants.ON);

      /*if (prevJoinBuilder == null) {
        baseSelectBuilder.append(this.alias).append(WhConstants.REF_OP);
      } else {
        baseSelectBuilder.append(prevJoinBuilder.getJoinDDTable().getAlias()).append(WhConstants.REF_OP);
      }*/

      baseSelectBuilder.append(joinBuilder.getLhsCol());

      /*if (StringUtils.isNotBlank(joinBuilder.getLhsCol())) {
        baseSelectBuilder.append(joinBuilder.getLhsCol());
      } else {
        baseSelectBuilder.append(this.primaryKeyCol);
      }*/

      baseSelectBuilder.append(" = ");

      baseSelectBuilder.append(joinBuilder.getRhsCol());

      /*if (StringUtils.isNotBlank(joinBuilder.getRhsCol())) {
        baseSelectBuilder.append(joinBuilder.getRhsCol());
      } else {
        baseSelectBuilder.append(joinBuilder.getJoinDDTable().getAlias()).append(WhConstants.REF_OP);
        baseSelectBuilder.append(joinBuilder.getJoinDDTable().getPrimaryKeyCol());
      }*/
    }

    baseSelectBuilder.append(getDefaultWhere());


    return baseSelectBuilder;
  }


  public String getDefaultWhere() {
    if (StringUtils.isNotBlank(alias)) {
      return WhConstants.WHERE.concat(WhConstants.OPEN_RND_BRACE).concat(alias).concat(WhConstants.REF_OP)
          .concat(DEFAULT_WHERE).concat(WhConstants.CLOSE_RND_BRACE);
    } else {
      return WhConstants.WHERE.concat(WhConstants.OPEN_RND_BRACE).concat(DEFAULT_WHERE).concat(WhConstants.CLOSE_RND_BRACE);
    }
  }
}
