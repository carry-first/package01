package com.JDBC.util;

import com.alibaba.druid.sql.visitor.functions.Now;
import com.alibaba.druid.util.JdbcUtils;
import org.junit.Test;

import java.io.*;
import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Tang A Biao
 * @create 2021/2/26 - 22:10
 */
public class implJDBC {

    @Test
    public void method01() {
        custmoers blob = getCustmoers("custmoers", custmoers.class);
        System.out.println("结果：" + blob);
    }

    @Test
    public void testAddData() {
        File f = new File("bizhi01.png");
        try (InputStream is = new FileInputStream(f);) {
            final int i = addBlobData("custmoers", is, null, "小李子", new Date());
            if (i > 0) {
                System.out.println("执行成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testZhuanZhang() {
        Connection connection = null;
        try {
            connection = JDBCutils.getConnection();
//        设置开启事务
            connection.setAutoCommit(false);
//        张三转200块
            final int i = updateMoney(connection, "moneytable", "张三", -200);
//        李四加200块
            final int i1 = updateMoney(connection, "moneytable", "李四", 200);
            System.out.println("张三转账" + i);
            System.out.println("李四转账" + i1);
//        当两次转账成功的时候才提交
//        提交事务
            if (i == i1) {
                connection.commit();
            } else {
                connection.rollback();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
//        如果出错则回滚事务
            try {
                connection.rollback();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

    }

    //    添加操作
    public static int addBlobData(String table, InputStream is, Object... args) {
        PreparedStatement ps = null;
        try (Connection connection = JDBCutils.getConnection();
        ) {
//            定义sql
            String sql = "insert into " + table + " values(";
//            循环插入?占位符
            for (int i = 0; i < args.length + 1; i++) {
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
//            设置添加图片类型的数据
            ps.setBlob(args.length + 1, is);
//            返回受影响的条数
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }

        return 0;
    }

    //    添加操作
    public static int addData(String table, Object... args) {
        PreparedStatement ps = null;
        try (Connection connection = JDBCutils.getConnection();
        ) {
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
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }

        return 0;
    }

    //    查询一条数据
    public static <T> T queryDataForOne(Object table, Class<T> gen) {
        T o = null;
        Connection connection = null;
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
            JDBCuitlDruid.close(resultSet, connection, ps);
        }
        return o;
    }

    //    查询操作
    public static <T> List<T> queryData(Object table, Class<T> gen) {
//        定义存储泛型T的集合
        List<T> list = new ArrayList<>();
        Connection connection = null;
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
            JDBCuitlDruid.close(resultSet, connection, ps);
        }
        return list;
    }

    public static custmoers getCustmoers(String table, Class gen) {
        custmoers cs = new custmoers();
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet resultSet = null;
        OutputStream os = null;
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
                for (int i = 0; i < columnCount; i++) {
//                    获取当前字段的参数
                    Object objectValue = resultSet.getObject(i + 1);
//                    获取字段名
                    String columnClassName = metaData.getColumnName(i + 1);
                    //                    System.out.println("key:"+columnClassName+"\tvalue:"+objectValue);
                    //                      获取字段名
                    Field field = cs.getClass().getDeclaredField(columnClassName);
                    //                    暴力反射
                    field.setAccessible(true);
//                    如果字段是photo那么就表示是二进制文件
                    if (!"photo".equals(columnClassName)) {
                        //                    设置值
                        field.set(cs, objectValue);
                    } else {
//                        定义存放路劲
                        File f = new File("src//com//JDBC//util//image//" + System.currentTimeMillis() + ".png");
//                        获取该二进制文件
                        final Blob blob = resultSet.getBlob(i + 1);
//                        获取二进制文件的输入流
                        final InputStream binaryStream = blob.getBinaryStream();
//                        定义输出流
                        os = new FileOutputStream(f);
//                        定义缓冲byte数组
                        byte bytes[] = new byte[1024];
//                        定义接收到的有效字节数
                        int len;
//                        循环读取和写入内容
                        while ((len = binaryStream.read(bytes)) != -1) {
                            os.write(bytes, 0, len);
                        }
                        //设置值
                        field.set(cs, f);
                    }
                }
            }
        } catch (Exception throwables) {
            throwables.printStackTrace();
        } finally {
            JDBCuitlDruid.close(resultSet, connection, ps);
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return cs;
    }

    //    修改操作
    public static int updateMoney(Connection con, String table, String name, int money) {
        try {
            String s;
            if (money >= 0) {
                s = "+ " + money;
            } else {
                s = "- " + Math.abs(money);
            }
//            定义sql
            String sql = "update " + table + " set money = money " + s + " where name = ?";
//            获取ps执行对象
            final PreparedStatement ps = con.prepareStatement(sql);
//            设置?的参数
            ps.setString(1, name);
//            返回执行结果
            return ps.executeUpdate();
        } catch (Exception throwables) {
            throwables.printStackTrace();
        }
        return 0;
    }

}

