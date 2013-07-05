package com.wh.transformation;

import com.wh.transformation.schema.DDTable;
import com.wh.transformation.schema.DimTable;
import com.wh.transformation.builder.JoinBuilder;

/**
 * Created by IntelliJ IDEA.
 * User: Vaibhav
 * Date: Jul 5, 2013
 * Time: 6:29:43 PM
 */
public class Generator {

  public static void main(String[] args) {
    DimTable addressDimTable = new DimTable("dim_address");

    addressDimTable.addTableColumn("address_id").addTableColumn("address_line1")
        .addTableColumn("address_line2").addTableColumn("name")
        .addTableColumn("phone").addTableColumn("pincode_id").addTableColumn("user_id")
        .addTableColumn("country_id");

    DDTable addressDDTable = new DDTable("dd_address");
    addressDDTable.addTableColumn("id").addTableColumn("line1")
        .addTableColumn("line2").addTableColumn("name")
        .addTableColumn("phone").addTableColumn("pincode_id").addTableColumn("user_id")
        .addTableColumn("country_id");

    System.out.println(generateBasicDimSql(addressDimTable, addressDDTable));


    DimTable pincodeDimTable = new DimTable("dim_pincode");
    pincodeDimTable.addTableColumn("pincode_id").addTableColumn("is_current")
        .addTableColumn("locality").addTableColumn("region")
        .addTableColumn("city_name").addTableColumn("state_name").addTableColumn("tier")
        .addTableColumn("zone_name");


    DDTable pincodeDDTable = new DDTable("dd_pincode");
    pincodeDDTable.setAlias("pn");
    pincodeDDTable.addTableColumn("pn.pincode").addTableColumn("1")
        .addTableColumn("pn.locality").addTableColumn("pn.region")
        .addTableColumn("cy.name").addTableColumn("st.name").addTableColumn("pn.tier")
        .addTableColumn("zn.name");



    DDTable stateDDTable = new DDTable("dd_state");
    stateDDTable.setAlias("st");
    DDTable cityDDTable = new DDTable("dd_city");
    cityDDTable.setAlias("cy");

    JoinBuilder stateJoinBuilder = new JoinBuilder().setJoinDDTable(stateDDTable).setLhsCol("pn.state_id").setRhsCol("st.id");
    JoinBuilder cityJoinBuilder = new JoinBuilder().setJoinDDTable(cityDDTable).setLhsCol("pn.city_id").setRhsCol("cy.id");

    pincodeDDTable.addJoinBuilder(stateJoinBuilder).addJoinBuilder(cityJoinBuilder);

    System.out.println(pincodeDimTable.getBaseInsert().append(pincodeDDTable.getBaseSelect()).toString());

  }


  public static String generateBasicDimSql(DimTable dimTable, DDTable ddTable) {


    return dimTable.getBaseInsert().append(ddTable.getBaseSelect()).toString();


  }


}
