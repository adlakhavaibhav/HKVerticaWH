package com.wh.vertica.util;

/**
 * Created by IntelliJ IDEA.
 * User: Vaibhav
 * Date: Jul 5, 2013
 * Time: 10:33:07 PM
 */
public enum VerticaDataSourceType {

  VerticaDS("VerticaDA");


  private String location;


  VerticaDataSourceType(String location) {
    this.location = location;
  }

  public String location() {
    return location;
  }
}
