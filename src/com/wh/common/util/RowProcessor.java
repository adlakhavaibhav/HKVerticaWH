package com.wh.common.util;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by IntelliJ IDEA.
 * User: Vaibhav
 * Date: Jul 5, 2013
 * Time: 10:34:53 PM
 */
public interface RowProcessor {
  public void process(ResultSet rs) throws SQLException;
}
