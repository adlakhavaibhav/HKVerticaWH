package com.wh.transformation.test;

import com.wh.transformation.builder.JoinBuilder;

/**
 * Created by IntelliJ IDEA.
 * User: admin
 * Date: Jul 5, 2013
 * Time: 6:29:43 PM
 */
public class Generator {

  public static void main(String[] args) {
    TestDimTable addressDimTable = new TestDimTable("dim_address");

    addressDimTable.addTableColumn("address_id").addTableColumn("address_line1")
        .addTableColumn("address_line2").addTableColumn("name")
        .addTableColumn("phone").addTableColumn("pincode_id").addTableColumn("user_id")
        .addTableColumn("country_id");

    TestDDTable addressDDTable = new TestDDTable("dd_address");
    addressDDTable.addTableColumn("id").addTableColumn("line1")
        .addTableColumn("line2").addTableColumn("name")
        .addTableColumn("phone").addTableColumn("pincode_id").addTableColumn("user_id")
        .addTableColumn("country_id");

    System.out.println(generateBasicDimSql(addressDimTable, addressDDTable));


    TestDimTable pincodeDimTable = new TestDimTable("dim_pincode");
    pincodeDimTable.addTableColumn("pincode_id").addTableColumn("is_current")
        .addTableColumn("locality").addTableColumn("region")
        .addTableColumn("city_name").addTableColumn("state_name").addTableColumn("tier")
        .addTableColumn("zone_name");


    TestDDTable pincodeDDTable = new TestDDTable("dd_pincode");
    pincodeDDTable.setAlias("pn");
    pincodeDDTable.addTableColumn("pn.pincode").addTableColumn("1")
        .addTableColumn("pn.locality").addTableColumn("pn.region")
        .addTableColumn("cy.name").addTableColumn("st.name").addTableColumn("pn.tier")
        .addTableColumn("zn.name");



    TestDDTable stateDDTable = new TestDDTable("dd_state");
    stateDDTable.setAlias("st");
    TestDDTable cityDDTable = new TestDDTable("dd_city");
    cityDDTable.setAlias("cy");

    JoinBuilder stateJoinBuilder = new JoinBuilder().setJoinDDTable(stateDDTable).setLhsCol("pn.state_id").setRhsCol("st.id");
    JoinBuilder cityJoinBuilder = new JoinBuilder().setJoinDDTable(cityDDTable).setLhsCol("pn.city_id").setRhsCol("cy.id");

    pincodeDDTable.addJoinBuilder(stateJoinBuilder).addJoinBuilder(cityJoinBuilder);

    System.out.println(pincodeDimTable.getBaseInsert().append(pincodeDDTable.getBaseSelect()).toString());

  }


  public static String generateBasicDimSql(TestDimTable dimTable, TestDDTable ddTable) {


    return dimTable.getBaseInsert().append(ddTable.getBaseSelect()).toString();


  }


}
