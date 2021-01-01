package com.JDBC.util;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCuitlDruid {

    private static DataSource ds;

    static{

        try {
//            创建属性集对象
            Properties pro = new Properties();
//            加载属性文件
            pro.load(JDBCuitlDruid.class.getClassLoader().getResourceAsStream("druid.properties"));
            ds = DruidDataSourceFactory.createDataSource(pro);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

//    获取连接对象
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

//    获取数据连接池
    public static DataSource getDruid(){
        return ds;
    }

//    返还连接对象
    public static void close(Connection conn, Statement stat){
        close(null,conn, stat);
    }

//    返还连接对象
    public static void close( ResultSet res,Connection conn, Statement stat){
        if(res != null){
            try {
                res.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        if(conn != null){
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        if(stat != null){
            try {
                stat.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
