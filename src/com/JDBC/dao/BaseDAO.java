package com.JDBC.dao;

import com.JDBC.util.JDBCuitlDruid;
import com.JDBC.util.JDBCutils;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Tang A Biao
 * @create 2021/2/27 - 21:59
 */
public class BaseDAO {
    //    添加操作
    public static int addData(Connection connection, String table, Object... args) {
        PreparedStatement ps = null;
        try {
//            定义sql
            String sql = "insert into " + table + " values(";
//            循环插入?占位符
            for (int i = 0; i < args.length; i++) {
                sql += "?,";
            }
//            拼接参数
            sql = sql.substring(0, sql.length() - 1) + ")";
            System.out.println(sql);
//            获取执行对象
            ps = connection.prepareStatement(sql);
//            拼接参数
            for (int i = 0; i < args.length; i++) {
                ps.setObject(i + 1, args[i]);
            }
//            返回受影响的条数
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCuitlDruid.close(ps);
        }

        return 0;
    }

    //    查询一条数据
    public static <T> T queryDataForOne(Connection connection, Object table, Class<T> gen) {
        T o = null;
        PreparedStatement ps = null;
        ResultSet resultSet = null;
        try {
            connection = JDBCutils.getConnection();

            String sql = "select * from " + table;
            ps = connection.prepareStatement(sql);
//            ps.setObject(1,table);
            resultSet = ps.executeQuery();
//            循环读取数据
            if (resultSet.next()) {
//                获取当前结果集的Meta对象
                ResultSetMetaData metaData = resultSet.getMetaData();
//                当前列中有几个字段
                int columnCount = metaData.getColumnCount();
//                System.out.println("查询到的字段数量："+columnCount);
//                创建对象来存储数据
                o = gen.newInstance();
                for (int i = 0; i < columnCount; i++) {
//                    获取当前字段的参数
                    Object objectValue = resultSet.getObject(i + 1);
//                    获取字段名
                    String columnClassName = metaData.getColumnName(i + 1);
//                    System.out.println("key:"+columnClassName+"\tvalue:"+objectValue);
//                      获取字段名
                    Field field = o.getClass().getDeclaredField(columnClassName);
//                    暴力反射
                    field.setAccessible(true);
//                    设置值
                    field.set(o, objectValue);
                }
            }
        } catch (Exception throwables) {
            throwables.printStackTrace();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
        return o;
    }

    //    查询操作
    public static <T> List<T> queryData(Connection connection, Object table, Class<T> gen) {
//        定义存储泛型T的集合
        List<T> list = new ArrayList<>();
        PreparedStatement ps = null;
        ResultSet resultSet = null;
        try {
            connection = JDBCutils.getConnection();

            String sql = "select * from " + table;
            ps = connection.prepareStatement(sql);
//            ps.setObject(1,table);
            resultSet = ps.executeQuery();
//            循环读取数据
            while (resultSet.next()) {
//                获取当前结果集的Meta对象
                ResultSetMetaData metaData = resultSet.getMetaData();
//                当前列中有几个字段
                int columnCount = metaData.getColumnCount();
//                System.out.println("查询到的字段数量："+columnCount);
//                创建对象来存储数据
                T o = gen.newInstance();
//                循环将每个字段的值获取出来进行java对象的封装
                for (int i = 0; i < columnCount; i++) {
//                    获取当前字段的参数
                    Object objectValue = resultSet.getObject(i + 1);
//                    获取字段名
                    String columnClassName = metaData.getColumnName(i + 1);
//                    System.out.println("key:"+columnClassName+"\tvalue:"+objectValue);
//                      获取字段名
                    Field field = o.getClass().getDeclaredField(columnClassName);
//                    暴力反射
                    field.setAccessible(true);
//                    设置值
                    field.set(o, objectValue);
                }
//                将数据添加到集合中
                list.add(o);
            }
        } catch (Exception throwables) {
            throwables.printStackTrace();
        } finally {
            JDBCuitlDruid.close(resultSet);
            JDBCuitlDruid.close(ps);
        }
        return list;
    }

    //    执行传递的sql
    public static int excuteSql(Connection connection, String sql) {
        PreparedStatement ps = null;
        try {
            //            获取执行对象
            ps = connection.prepareStatement(sql);
            //            返回受影响的条数
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCuitlDruid.close(ps);
        }

        return 0;
    }
}
