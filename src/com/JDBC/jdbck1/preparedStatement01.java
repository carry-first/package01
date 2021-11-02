package com.JDBC.jdbck1;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @author Tang A Biao
 * @create 2021/2/26 - 21:13
 */
public class preparedStatement01 {
    public static void main(String[] args) {
        InputStream resourceAsStream = preparedStatement01.class.getClassLoader().getResourceAsStream("druid.properties");
        Properties pp = new Properties();
        try {
            pp.load(resourceAsStream);
            String url = (String) pp.get("url");
            String user = (String) pp.get("user");
            String password = (String) pp.get("password");
            Connection connection = DriverManager.getConnection(url, user, password);
            ResultSet student = preparedS("student", connection);
            if (student != null) {
                student.next();
                System.out.println(student.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ResultSet preparedS(String table, Connection con) {
        String sql = "insert into student(name,age,sex) values(?,?,?)";
        ResultSet res = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setString(1,table);
            ps.setString(1, "王二麻子");
            ps.setInt(2, 12);
            ps.setString(3, "男");
            System.out.println(ps.toString());
            boolean execute = ps.execute();
            if (execute) System.out.println("执行成功");
            else System.out.println("执行失败");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return res;
    }
}
