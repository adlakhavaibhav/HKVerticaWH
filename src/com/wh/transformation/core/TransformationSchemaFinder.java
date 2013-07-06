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


  public TfDimTable getTfDimTable(String dimTableName) {

    final TfDimTable tfDimTable = new TfDimTable();


    DbConnectionUtil.query("select id, table_name, schema_name  from dim_table where table_name = ? ", new RowProcessor() {
      @Override
      public void process(ResultSet rs) throws SQLException {
        int id = rs.getInt("id");
        String tableName = rs.getString("table_name");
        String schemaName = rs.getString("schema_name");

        tfDimTable.setId(id);
        tfDimTable.setSchemaName(schemaName);
        tfDimTable.setTableName(tableName);
      }
    }, DataSourceType.TransformationDS, dimTableName);


    List<TfDimTableColumn> tfDimTableColumns = getTfDimTableColumns(tfDimTable.getId());
    tfDimTable.setColumns(tfDimTableColumns);

    TfDDTable tfDDTable = getTfDDTableFrorDimTable(tfDimTable.getId());
    tfDimTable.setTfDDTable(tfDDTable);

    return tfDimTable;
  }


  public List<TfDimTableColumn> getTfDimTableColumns(int dimTableId) {
    final List<TfDimTableColumn> tfDimTableColumns = new ArrayList<TfDimTableColumn>();

    DbConnectionUtil.query("select id, column_name, dim_table_id, usage_order  from dim_table_columns where dim_table_id = ? order by usage_order ", new RowProcessor() {
      @Override
      public void process(ResultSet rs) throws SQLException {
        int id = rs.getInt("id");
        String columnName = rs.getString("column_name");
        int dimTableId = rs.getInt("dim_table_id");
        int usageOrder = rs.getInt("usage_order");


        TfDimTableColumn tfDimTableColumn = new TfDimTableColumn();
        tfDimTableColumn.setId(id);
        tfDimTableColumn.setColumnName(columnName);
        tfDimTableColumn.setDimTableId(dimTableId);
        tfDimTableColumn.setOrder(usageOrder);

        tfDimTableColumns.add(tfDimTableColumn);

      }
    }, DataSourceType.TransformationDS, dimTableId);


    return tfDimTableColumns;
  }


  public TfDDTable getTfDDTableFrorDimTable(int dimTableId) {

    final TfDDTable tfDDTable = new TfDDTable();


    DbConnectionUtil.query("select id, table_name, schema_name,alias,for_dim_table_id   from dd_table where for_dim_table_id = ? ", new RowProcessor() {
      @Override
      public void process(ResultSet rs) throws SQLException {
        int id = rs.getInt("id");
        String tableName = rs.getString("table_name");
        String schemaName = rs.getString("schema_name");
        String alias = rs.getString("alias");

        tfDDTable.setId(id);
        tfDDTable.setSchemaName(schemaName);
        tfDDTable.setTableName(tableName);
        tfDDTable.setAlias(alias);
      }
    }, DataSourceType.TransformationDS, dimTableId);


    List<TfDDTableColumn> tfDdTableColumns = getTfDdTableColumns(tfDDTable.getId());
    tfDDTable.setColumns(tfDdTableColumns);

    List<TfDDTableJoin> tfDDTableJoins = getTfDdTableJoins(tfDDTable.getId());
    tfDDTable.setJoins(tfDDTableJoins);

    return tfDDTable;
  }


  public List<TfDDTableColumn> getTfDdTableColumns(int ddTableId) {
    final List<TfDDTableColumn> tfDDTableColumns = new ArrayList<TfDDTableColumn>();

    DbConnectionUtil.query("select id, column_name, dd_table_id, usage_order  from dd_table_columns where dd_table_id = ? order by usage_order ", new RowProcessor() {
      @Override
      public void process(ResultSet rs) throws SQLException {
        int id = rs.getInt("id");
        String columnName = rs.getString("column_name");
        int ddTableId = rs.getInt("dd_table_id");
        int usageOrder = rs.getInt("usage_order");


        TfDDTableColumn tfDDTableColumn = new TfDDTableColumn();
        tfDDTableColumn.setId(id);
        tfDDTableColumn.setColumnName(columnName);
        tfDDTableColumn.setDdTableId(ddTableId);
        tfDDTableColumn.setOrder(usageOrder);

        tfDDTableColumns.add(tfDDTableColumn);

      }
    }, DataSourceType.TransformationDS, ddTableId);


    return tfDDTableColumns;
  }

  public List<TfDDTableJoin> getTfDdTableJoins(int ddTableId) {
    final List<TfDDTableJoin> ddTableJoinList = new ArrayList<TfDDTableJoin>();

    DbConnectionUtil.query("select id, lhsCol, rhsCol, join_table_name , join_table_alias,usage_order,dd_table_id " +
        " from dd_table_join where dd_table_id = ? order by usage_order ", new RowProcessor() {
      @Override
      public void process(ResultSet rs) throws SQLException {
        int id = rs.getInt("id");
        String lhsCol = rs.getString("lhsCol");
        String rhsCol = rs.getString("rhsCol");
        String joinTableName = rs.getString("join_table_name");
        String joinTableAlias = rs.getString("join_table_alias");
        int ddTableId = rs.getInt("dd_table_id");
        int usageOrder = rs.getInt("usage_order");


        TfDDTableJoin tfDDTableJoin = new TfDDTableJoin();
        tfDDTableJoin.setId(id);
        tfDDTableJoin.setLhsCol(lhsCol);
        tfDDTableJoin.setRhsCol(rhsCol);
        tfDDTableJoin.setJoinTableAlias(joinTableAlias);
        tfDDTableJoin.setJoinTableName(joinTableName);
        tfDDTableJoin.setOrder(usageOrder);
        tfDDTableJoin.setDdTableId(ddTableId);

        ddTableJoinList.add(tfDDTableJoin);

      }
    }, DataSourceType.TransformationDS, ddTableId);


    return ddTableJoinList;
  }
}
