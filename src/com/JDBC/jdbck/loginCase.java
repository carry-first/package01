package com.JDBC.jdbck;

import com.JDBC.util.JDBCutils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class loginCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入账号：");
        String user = sc.next();
        System.out.println("请输入密码：");
        String passwrod = sc.next();
        boolean is = new loginCase().login(user, passwrod);
        if (is) {
            System.out.println("登录成功");
        } else {
            System.out.println("账号或密码错误");
        }
    }

    public boolean isSuccess(String user, String password) {

        JDBCutils jc = new JDBCutils();

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = jc.getConnection();

            String sql = "select * from login where user = '" + user + "' and password = '" + password + "' ";
            String sql2 = "select * from login where user = '" + user + "' and password='" + password + "or '123'='123'" + "';";
            System.out.println(sql);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

//            如果有下一个数据则返回true，否则返回false；
            return resultSet.next();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            jc.close(connection, statement, resultSet);
        }
//          如果执行出错则返回false；
        return false;
    }

    public boolean login(String username, String password) {
        if (username == null || password == null) {
            return false;
        }
        //连接数据库判断是否登录成功
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        JDBCutils JDBCUtils = new JDBCutils();
        //1.获取连接
        try {
            conn = JDBCUtils.getConnection();
            //2.定义sql
            String sql = "select * from user where username = '" + username + "' and password = '" + password + "' ";
            System.out.println(sql);
            //3.获取执行sql的对象
            stmt = conn.createStatement();
            //4.执行查询
            rs = stmt.executeQuery(sql);
            //5.判断
           /* if(rs.next()){//如果有下一行，则返回true
                return true;
            }else{
                return false;
            }*/
            return rs.next();//如果有下一行，则返回true

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(conn, stmt, rs);
        }


        return false;
    }

}
