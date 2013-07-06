package com.wh.vertica.core;

import com.wh.vertica.util.VerticaDataSourceType;
import com.wh.vertica.util.VerticaDbConnectionUtil;
import com.wh.vertica.schema.VerticaSchema;
import com.wh.vertica.schema.VerticaDimTable;
import com.wh.common.util.RowProcessor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

/**
 * Created by IntelliJ IDEA.
 * User: admin
 * Date: Jul 5, 2013
 * Time: 10:43:39 PM
 */
public class VerticaSchemaFinder {

  public VerticaSchema getVerticaSchema(String schemaName) {
    VerticaSchema verticaSchema = new VerticaSchema();

    verticaSchema.setSchemaName(schemaName);

    final Set<String> tablesNamesForSchema = new HashSet<String>();


    VerticaDbConnectionUtil.query("select table_name from v_catalog.tables where table_schema = ?", new RowProcessor() {
      @Override
      public void process(ResultSet rs) throws SQLException {
        tablesNamesForSchema.add(rs.getString(1));
      }
    }, VerticaDataSourceType.VerticaDS, schemaName);


    for (String tableName : tablesNamesForSchema) {
      verticaSchema.getDimTables().add(getVerticaDimTable(schemaName, tableName));
    }

    return verticaSchema;

  }


  public VerticaDimTable getVerticaDimTable(String schemaName, String tableName) {

    final VerticaDimTable verticaDimTable = new VerticaDimTable();
    verticaDimTable.setSchemaName(schemaName);
    verticaDimTable.setTableName(tableName);

    VerticaDbConnectionUtil.query("select column_name from v_catalog.columns where table_name = ? and table_schema = ?", new RowProcessor() {
      @Override
      public void process(ResultSet rs) throws SQLException {
        verticaDimTable.addTableColumn(rs.getString(1));
      }
    }, VerticaDataSourceType.VerticaDS, tableName, schemaName);


    return verticaDimTable;
  }


  public String getIdsToInsertOnProdSql(String prodSchemaName, String stagSchemaName, String stagDimTableName, String prodDimTableName, String idColumn) {
    String prodDimTableQualifiedName = stagSchemaName.concat(".").concat(prodDimTableName);
    String stagDimTableQualifiedName = prodSchemaName.concat(".").concat(stagDimTableName);

    StringBuilder idFinderSql = new StringBuilder("select ");
    idFinderSql.append(stagDimTableQualifiedName).append(".").append(idColumn).append(" ").append(" from ").append(stagDimTableQualifiedName);
    idFinderSql.append(" left join ").append(prodDimTableQualifiedName);
    idFinderSql.append(" on ").append(stagDimTableQualifiedName).append(".").append(idColumn).append(" = ").append(prodDimTableQualifiedName).append(".").append(idColumn);
    idFinderSql.append(" where ").append(prodDimTableQualifiedName).append(".").append(idColumn).append(" is null");


    idFinderSql.append(" limit 10");

    return idFinderSql.toString();
  }


  public List<Integer> getIdsToInsertOnProd(String prodSchemaName, String stagSchemaName, String stagDimTableName, String prodDimTableName, String idColumn) {
    final List<Integer> idsToInsert = new ArrayList<Integer>();

    String idFinderSql = getIdsToInsertOnProdSql(prodSchemaName, stagSchemaName, stagDimTableName, prodDimTableName, idColumn);

    VerticaDbConnectionUtil.query(idFinderSql, new RowProcessor() {
      @Override
      public void process(ResultSet rs) throws SQLException {
        idsToInsert.add(rs.getInt(1));
      }
    }, VerticaDataSourceType.VerticaDS);

    return idsToInsert;
  }

}
