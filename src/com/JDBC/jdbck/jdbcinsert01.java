package com.JDBC.jdbck;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcinsert01 {
    public static void main(String[] args) {
//        导入驱动
        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
//            定义sql语句
            String s = "insert into casetab values(null,'zhaoliu',7000)";
//            定义连接目标和账号密码
            String url = "jdbc:mysql://localhost:3306/task?&useSSL=false&serverTimezone=UTC";
            String user = "root";
            String psd = "123456";
//            获取集合对象
            connection = DriverManager.getConnection(url, user, psd);
//            获取执行sql语句的对象
            statement = connection.createStatement();
//            执行sql云居
            int i = statement.executeUpdate(s);
            if (i > 0) {
                System.out.println("sql执行成功");
            } else {
                System.out.println("sql执行失败");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
//            如果对象不为空
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
//            如果对象不为空
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
}
