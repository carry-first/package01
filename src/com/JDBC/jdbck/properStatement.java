package com.JDBC.jdbck;

import com.JDBC.util.JDBCutils;

import java.sql.*;
import java.util.Scanner;

public class properStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入账号：");
        String user = sc.next();
        System.out.println("请输入密码：");
        String passwrod = sc.next();
        boolean is = new properStatement().isSuccess(user, passwrod);
        if (is) {
            System.out.println("登录成功");
        } else {
            System.out.println("账号或密码错误");
        }
    }

    public boolean isSuccess(String user, String password) {

        JDBCutils jc = new JDBCutils();

        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet rs = null;

        try {
            connection = jc.getConnection();
            String sql = "select * from login where user = ? and password = ? ;";
            statement = connection.prepareStatement(sql);
//          设置？的值
            statement.setString(1, user);
            statement.setString(2, password);
//            提交参数查询
            System.out.println(sql);
//            查询的时候不需要传递参数
            rs = statement.executeQuery();

//            如果有下一个数据则返回true，否则返回false；
            return rs.next();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            jc.close(connection, statement, rs);
        }
//          如果执行出错则返回false；
        return false;
    }

    public boolean login2(String username, String password) {
        if (username == null || password == null) {
            return false;
        }
        //连接数据库判断是否登录成功
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        JDBCutils JDBCUtils = new JDBCutils();
        //1.获取连接
        try {
            conn = JDBCUtils.getConnection();
            //2.定义sql
            String sql = "select * from login where user = ? and password = ?";
            //3.获取执行sql的对象
            pstmt = conn.prepareStatement(sql);
            //给?赋值
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            //4.执行查询,不需要传递sql
            rs = pstmt.executeQuery();
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
            JDBCUtils.close(conn, pstmt, rs);
        }


        return false;
    }
}
