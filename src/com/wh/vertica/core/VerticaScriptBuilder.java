package com.wh.vertica.core;

import com.wh.common.util.RowProcessor;
import com.wh.vertica.constants.VerticaConstants;
import com.wh.vertica.util.VerticaDataSourceType;
import com.wh.vertica.util.VerticaDbConnectionUtil;
import com.wh.vertica.schema.VerticaSchema;
import com.wh.vertica.schema.VerticaDimTable;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Vaibhav
 * Date: Jul 6, 2013
 * Time: 2:21:40 PM
 */
public class VerticaScriptBuilder {

  public static final String SELECT = " SELECT ";
  public static final String UPDATE = " UPDATE ";
  public static final String INSERT = " INSERT INTO ";
  public static final String CREATE = " CREATE ";
  public static final String PROJECTION = " PROJECTION ";
  public static final String STAR = " * ";


  public static final String INNER_JOIN = " INNER JOIN ";
  public static final String lEFT_JOIN = " LEFT JOIN ";
  public static final String RIGHT_JOIN = " RIGHT_JOIN ";


  public static final String ON = " ON ";
  public static final String WHERE = " WHERE ";
  public static final String SET = " SET ";
  public static final String FROM = " FROM ";

  public static final String REF_OP = ".";
  public static final String EQUALS = " = ";
  public static final String COMMA = " , ";
  public static final String SEMI_COLON = " ; ";
  public static final String OPN_RND_BRACKET = " ( ";
  public static final String CLOSE_RND_BRACKET = " ) ";


  /**
   * FUNCTIONS
   */
  public static final String CURR_DATE = " CURRENT_DATE() ";

  private String prodSchemaName;
  private String stagSchemaName;
  private VerticaSchema verticaSchema;


  public VerticaScriptBuilder(String prodSchemaName, String stagSchemaName, VerticaSchema verticaSchema) {
    this.prodSchemaName = prodSchemaName;
    this.stagSchemaName = stagSchemaName;
    this.verticaSchema = verticaSchema;
  }

  public String getInsertSqlForProd(String stagDimTableName, String prodDimTableName) {
    VerticaDimTable stageDimTable = verticaSchema.getDimTableByName(stagDimTableName);
    VerticaDimTable prodDimTable = verticaSchema.getDimTableByName(prodDimTableName);

    String prodDimTableQualifiedName = getQualifiedName(prodSchemaName, prodDimTableName);
    String stagDimTableQualifiedName = getQualifiedName(stagSchemaName, stagDimTableName);


    StringBuilder insertSQlForProd = new StringBuilder(INSERT).append(prodDimTableQualifiedName)
        .append(OPN_RND_BRACKET).append(prodDimTable.getColumnsToInsertAsString()).append(CLOSE_RND_BRACKET)
        .append(SELECT).append(stageDimTable.getColumnsToInsertAsString()).append(FROM).append(stagDimTableQualifiedName).append(SEMI_COLON);


    return insertSQlForProd.toString();
  }

  public String getUpdateEndDtAndActiveSqlForProd(String stagDimTableName, String prodDimTableName, String idColumn) {
    String prodDimTableQualifiedName = getQualifiedName(prodSchemaName, prodDimTableName);
    String stagDimTableQualifiedName = getQualifiedName(stagSchemaName, stagDimTableName);

    /**
     * UPDATE hk_warehouse.dim_address SET is_current = 0, end_date = CURRENT_DATE()
     * FROM  staging.dim_address
     * WHERE staging.dim_address.address_id = hk_warehouse.dim_address.address_id;
     *
     */

    StringBuilder updateEndDtAndActiveSql = new StringBuilder(UPDATE).append(prodDimTableQualifiedName).append(SET);
    updateEndDtAndActiveSql.append(VerticaConstants.IS_CUURENT).append(EQUALS).append("0");
    updateEndDtAndActiveSql.append(COMMA).append(VerticaConstants.END_DATE).append(EQUALS).append(CURR_DATE);
    updateEndDtAndActiveSql.append(FROM).append(stagDimTableQualifiedName).append(WHERE).append(stagDimTableQualifiedName).append(REF_OP).append(idColumn);
    updateEndDtAndActiveSql.append(EQUALS).append(prodDimTableQualifiedName).append(REF_OP).append(idColumn).append(SEMI_COLON);


    return updateEndDtAndActiveSql.toString();


  }

  public String generateProjection(String schemaName, String dimTableName) {

    StringBuilder projectionBuilderSql = new StringBuilder(CREATE).append(" projection ").append(schemaName).append(REF_OP).append(dimTableName).append("_prj");
    projectionBuilderSql.append(" as ").append(SELECT).append(STAR).append(FROM).append(schemaName).append(REF_OP).append(dimTableName).append(SEMI_COLON);

    return projectionBuilderSql.toString();

  }


  public String getIdsToInsertOnProdSql(String stagDimTableName, String prodDimTableName, String idColumn) {
    String prodDimTableQualifiedName = getQualifiedName(prodSchemaName, prodDimTableName);
    String stagDimTableQualifiedName = getQualifiedName(stagSchemaName, stagDimTableName);

    StringBuilder idFinderSql = new StringBuilder("select ");
    idFinderSql.append(stagDimTableQualifiedName).append(".").append(idColumn).append(" ").append(" from ").append(stagDimTableQualifiedName);
    idFinderSql.append(" left join ").append(prodDimTableQualifiedName);
    idFinderSql.append(" on ").append(stagDimTableQualifiedName).append(".").append(idColumn).append(" = ").append(prodDimTableQualifiedName).append(".").append(idColumn);
    idFinderSql.append(" where ").append(prodDimTableQualifiedName).append(".").append(idColumn).append(" is null");


    return idFinderSql.toString();
  }


  private String getQualifiedName(String schemaName, String tableName) {
    return schemaName.concat(".").concat(tableName);
  }


  private List<Integer> getIdsToInsertOnProd(String stagDimTableName, String prodDimTableName, String idColumn) {
    final List<Integer> idsToInsert = new ArrayList<Integer>();

    String idFinderSql = getIdsToInsertOnProdSql(stagDimTableName, prodDimTableName, idColumn);

    VerticaDbConnectionUtil.query(idFinderSql, new RowProcessor() {
      @Override
      public void process(ResultSet rs) throws SQLException {
        idsToInsert.add(rs.getInt(1));
      }
    }, VerticaDataSourceType.VerticaDS);

    return idsToInsert;
  }


}
