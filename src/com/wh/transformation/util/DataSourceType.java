package com.wh.transformation.util;

/**
 * Created by IntelliJ IDEA.
 * User: admin
 * Date: Jul 6, 2013
 * Time: 2:22:45 AM
 */
public enum DataSourceType {


  TransformationDS("TransformationDS");


  private String location;


  DataSourceType(String location) {
    this.location = location;
  }

  public String location() {
    return location;
  }
}
