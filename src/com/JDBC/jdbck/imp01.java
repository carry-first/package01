package com.JDBC.jdbck;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class imp01 {
    public static void main(String[] args) throws Exception {
//        导入驱动jar包
//        注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/task?&useSSL=false&serverTimezone=UTC";
        String user = "root";
        String psd = "123456";
//        获取数据库连接对象
        Connection root = DriverManager.getConnection(url, user, psd);
//        定义sql语句
        String sql = "update casetab set salary = salary - 400 where cc = 'zhangsan'";
//        获取sql执行对象
        Statement statement = root.createStatement();
//        执行sql语句
        int i = statement.executeUpdate(sql);
//        输出i
        System.out.println(i);
//        关闭流
        root.close();
        statement.close();
    }
}
