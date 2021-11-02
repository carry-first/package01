package com.JDBC.util;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * @author Tang A Biao
 * @create 2021/2/28 - 17:59
 */
public class testTemplate {
    @Test
    public void test01() {
        final DataSource druid = JDBCuitlDruid.getDruid();
        JdbcTemplate tm = new JdbcTemplate(druid);

    }
}
