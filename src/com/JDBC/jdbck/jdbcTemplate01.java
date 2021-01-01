package com.JDBC.jdbck;

import com.JDBC.util.JDBCuitlDruid;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class jdbcTemplate01 {
    public static void main(String[] args) {
//        获取数据库池对象
        DataSource druid = JDBCuitlDruid.getDruid();
//        创建jdbc模板，里面传递的是一个数据库池对象
        JdbcTemplate jdbcTemplate = new JdbcTemplate(druid);
//        创建sql
        String sql = "update casetab set salary = ? where name = ?";
//        执行sql
        int i = jdbcTemplate.update(sql, 100, "lisi");
        System.out.println(i);
    }
}
