package com.JDBC.jdbck;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcupdate01 {
    public static void main(String[] args) {
//        修改数据
        String sql = "update casetab set salary = 1234 where cc = 'zhangsan'";
//        删除数据
        String sql1 = "delete from casetab where cc = 'zhangsan'";
//        执行sql
//        update(sql1);
//        创建表
        String createTabSQL = "create table test01(id int,name varchar(12),age int)";
        create(createTabSQL);
    }

//    表格创建方法
public static void create(String sql){
    Connection connection = null;
    Statement statement = null;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql:///task?&userSSL=false&serverTimezone=UTC","root","123456");
        statement = connection.createStatement();
        int i = statement.executeUpdate(sql);
        if(i ==0 ) System.out.println(i+"sql执行成功");
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }catch (SQLException throwables) {
        throwables.printStackTrace();
    } finally{
        if(connection != null){
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        if(statement != null){
            try {
                statement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}

//    数据更新方法
    public static void update(String sql){
        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql:///task?&userSSL=false&serverTimezone=UTC","root","123456");
            statement = connection.createStatement();
            int i = statement.executeUpdate(sql);
            System.out.println(i);
            if(i > 0){
                System.out.println("sql执行成功");
            }else{
                System.out.println("sql执行失败");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally{
            if(connection != null){
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }

            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
}
