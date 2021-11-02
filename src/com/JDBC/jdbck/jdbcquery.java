package com.JDBC.jdbck;

import java.sql.*;

public class jdbcquery {
    public static void main(String[] args) {
//        调用查询数据jdbc
        queryData("select * from casetab");
    }

    //    表格查询方法
    public static void queryData(String sql) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultset = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql:///task?&userSSL=false&serverTimezone=UTC", "root", "123456");
            statement = connection.createStatement();
//            获取query查询对象
            resultset = statement.executeQuery(sql);
//              如果还有下一行
            while (resultset.next()) {
//              获取当前行的第一列
                int anInt = resultset.getInt(1);
                String name = resultset.getString("cc");
                double salary = resultset.getDouble("salary");
                System.out.println(anInt + "-----" + name + "------" + salary);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            if (resultset != null) {
                try {
                    resultset.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }

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
