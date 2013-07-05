package com.wh.common.util;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by IntelliJ IDEA.
 * User: Vaibhav
 * Date: Jul 5, 2013
 * Time: 10:34:38 PM
 */
public interface ResultSetExtractor<T> {

    public T extract(ResultSet rs) throws SQLException;
}
