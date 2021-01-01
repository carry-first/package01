package com.JDBC.jdbck;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.mchange.v2.c3p0.impl.C3P0PooledConnection;
import com.mchange.v2.c3p0.impl.C3P0PooledConnectionPoolManager;

import java.sql.Connection;
import java.sql.SQLException;

public class C3P01 {
    public static void main(String[] args) {

        try {
//            创建数据库连接池对象
            ComboPooledDataSource com = new ComboPooledDataSource();
            for (int i = 1; i <= 8; i++) {
//            获取连接对象
                Connection conn = com.getConnection();
//            打印
                System.out.println("第"+i+"个"+conn);
            }

            //conn.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        System.out.println("-----------------------");
        try {
            testC3P0("otherc3p0",15);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public static void testC3P0(String name,int n) throws SQLException {
        ComboPooledDataSource cpd = new ComboPooledDataSource(name);


        for (int i = 0; i < n; i++) {
            Connection conn = cpd.getConnection();
            System.out.println("第"+i+"个"+conn);
        }
    }
}
