package com.wh.transformation.core;

import com.wh.common.util.RowProcessor;
import com.wh.transformation.schema.*;
import com.wh.transformation.util.DataSourceType;
import com.wh.transformation.util.DbConnectionUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: admin
 * Date: Jul 6, 2013
 * Time: 5:09:16 AM
 */
public class TransformationSchemaFinder {


  public DimTable getDimTable(String dimTableName) {

    final DimTable dimTable = new DimTable();


    DbConnectionUtil.query("select id, table_name, schema_name  from dim_table where table_name = ? ", new RowProcessor() {
      @Override
      public void process(ResultSet rs) throws SQLException {
        int id = rs.getInt("id");
        String tableName = rs.getString("table_name");
        String schemaName = rs.getString("schema_name");

        dimTable.setId(id);
        dimTable.setSchemaName(schemaName);
        dimTable.setTableName(tableName);
      }
    }, DataSourceType.TransformationDS, dimTableName);


    List<DimTableColumn> dimTableColumns = getDimTableColumns(dimTable.getId());
    dimTable.setColumns(dimTableColumns);

    DDTable ddTable = getDDTableFrorDimTable(dimTable.getId());
    dimTable.setDdTable(ddTable);

    return dimTable;
  }


  public List<DimTableColumn> getDimTableColumns(int dimTableId) {
    final List<DimTableColumn> dimTableColumns = new ArrayList<DimTableColumn>();

    DbConnectionUtil.query("select id, column_name, dim_table_id, usage_order  from dim_table_columns where dim_table_id = ? order by usage_order ", new RowProcessor() {
      @Override
      public void process(ResultSet rs) throws SQLException {
        int id = rs.getInt("id");
        String columnName = rs.getString("column_name");
        int dimTableId = rs.getInt("dim_table_id");
        int usageOrder = rs.getInt("usage_order");


        DimTableColumn dimTableColumn = new DimTableColumn();
        dimTableColumn.setId(id);
        dimTableColumn.setColumnName(columnName);
        dimTableColumn.setDimTableId(dimTableId);
        dimTableColumn.setOrder(usageOrder);

        dimTableColumns.add(dimTableColumn);

      }
    }, DataSourceType.TransformationDS, dimTableId);


    return dimTableColumns;
  }


  public DDTable getDDTableFrorDimTable(int dimTableId) {

    final DDTable ddTable = new DDTable();


    DbConnectionUtil.query("select id, table_name, schema_name,alias,for_dim_table_id   from dd_table where for_dim_table_id = ? ", new RowProcessor() {
      @Override
      public void process(ResultSet rs) throws SQLException {
        int id = rs.getInt("id");
        String tableName = rs.getString("table_name");
        String schemaName = rs.getString("schema_name");
        String alias = rs.getString("alias");

        ddTable.setId(id);
        ddTable.setSchemaName(schemaName);
        ddTable.setTableName(tableName);
        ddTable.setAlias(alias);
      }
    }, DataSourceType.TransformationDS, dimTableId);


    List<DDTableColumn> ddTableColumns = getDDTableColumns(ddTable.getId());
    ddTable.setColumns(ddTableColumns);

    List<DDTableJoin> ddTableJoins = getDDTableJoins(ddTable.getId());
    ddTable.setJoins(ddTableJoins);

    return ddTable;
  }


  public List<DDTableColumn> getDDTableColumns(int ddTableId) {
    final List<DDTableColumn> ddTableColumns = new ArrayList<DDTableColumn>();

    DbConnectionUtil.query("select id, column_name, dd_table_id, usage_order  from dd_table_columns where dd_table_id = ? order by usage_order ", new RowProcessor() {
      @Override
      public void process(ResultSet rs) throws SQLException {
        int id = rs.getInt("id");
        String columnName = rs.getString("column_name");
        int ddTableId = rs.getInt("dd_table_id");
        int usageOrder = rs.getInt("usage_order");


        DDTableColumn ddTableColumn = new DDTableColumn();
        ddTableColumn.setId(id);
        ddTableColumn.setColumnName(columnName);
        ddTableColumn.setDdTableId(ddTableId);
        ddTableColumn.setOrder(usageOrder);

        ddTableColumns.add(ddTableColumn);

      }
    }, DataSourceType.TransformationDS, ddTableId);


    return ddTableColumns;
  }

  public List<DDTableJoin> getDDTableJoins(int ddTableId) {
    final List<DDTableJoin> ddTableJoinList = new ArrayList<DDTableJoin>();

    DbConnectionUtil.query("select id, lhsCol, rhsCol, join_table_qualified_name , join_table_alias,usage_order,dd_table_id, join_type " +
        " from dd_table_join where dd_table_id = ? order by usage_order ", new RowProcessor() {
      @Override
      public void process(ResultSet rs) throws SQLException {
        int id = rs.getInt("id");
        String lhsCol = rs.getString("lhsCol");
        String rhsCol = rs.getString("rhsCol");
        String joinTableQualifiedName = rs.getString("join_table_qualified_name");
        String joinTableAlias = rs.getString("join_table_alias");
        String joinType = rs.getString("join_type");
        int ddTableId = rs.getInt("dd_table_id");
        int usageOrder = rs.getInt("usage_order");


        DDTableJoin ddTableJoin = new DDTableJoin();
        ddTableJoin.setId(id);
        ddTableJoin.setLhsCol(lhsCol);
        ddTableJoin.setRhsCol(rhsCol);
        ddTableJoin.setJoinTableAlias(joinTableAlias);
        ddTableJoin.setJoinTableQualifiedName(joinTableQualifiedName);
        ddTableJoin.setOrder(usageOrder);
        ddTableJoin.setDdTableId(ddTableId);
        ddTableJoin.setJoinType(joinType);

        ddTableJoinList.add(ddTableJoin);

      }
    }, DataSourceType.TransformationDS, ddTableId);


    return ddTableJoinList;
  }
}
