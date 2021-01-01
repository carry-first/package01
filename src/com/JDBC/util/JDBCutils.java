package com.JDBC.util;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Properties;

public class JDBCutils {

    private static String url;
    private static String user;
    private static String password;
//    定义存储数据的静态代码块

    static {

        try {
//            定义属性集
            Properties pro = new Properties();
//            获取类加载器
            ClassLoader classLoader = JDBCutils.class.getClassLoader();
//            获取类加载中的获取源文件名
            URL resource = classLoader.getResource("propertiesJDBC.properties");
//            获取文件的路劲
            String path = resource.getPath();
//            查看文件存在的路劲
//            System.out.println(path);
//            加载文件进属性级中
            pro.load(new FileReader(path));
//            将文件中的数据赋值到内容中
            url = pro.getProperty("url");
            user = pro.getProperty("user");
            password = pro.getProperty("password");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//    定义获取数据库连接对象
    public Connection getConnection() throws SQLException {
        Connection coon = null;
        try {
//            导入驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
//        定义获取对象
            coon = DriverManager.getConnection(url,user,password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return coon;
    }

//    定义关闭Connection和Statement流的方法
    public void close(Connection coon, Statement stat){
//        关闭数据流
        if(coon != null){
            try {
                coon.close();
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

//    定义关闭Connection、Statement、ResultSet流的方法
    public void close(Connection coon, Statement stat, ResultSet res){
//        关闭数据流
        if(coon != null){
            try {
                coon.close();
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

        if(res != null){
            try {
                res.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

}
