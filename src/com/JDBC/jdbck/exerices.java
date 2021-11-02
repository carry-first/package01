package com.JDBC.jdbck;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class exerices {
    public static void main(String[] args) {
        List<Emp> list = new exerices().findAll("emp");
        System.out.println(list);
        System.out.println("查询到：" + list.size() + " 条数据");
    }

    //    查询数据的类
    public List findAll(String table) {
//         定义存储数据的对象
        Connection conn = null;
        Statement statement = null;
        List<Emp> list = new ArrayList<Emp>();
        Emp emp = null;
        ResultSet resultSet;
        try {
//            导入驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
//            获取数据库连接对象
            conn = DriverManager.getConnection("jdbc:mysql:///task?&userSSL=false&serverTimezone=UTC", "root", "123456");
//            获取sql执行语句对象
            statement = conn.createStatement();
//            定义查询sql语句
            String sql = "select * from " + table;
//            执行查询语句
            resultSet = statement.executeQuery(sql);
//              循环读取数据并添加到集合中
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String ename = resultSet.getString("ename");
                int job_id = resultSet.getInt("job_id");
                int mgr = resultSet.getInt("mgr");
                Date joindate = resultSet.getDate("joindate");
                double salary = resultSet.getDouble("salary");
                double bonus = resultSet.getDouble("bonus");
                int dept_id = resultSet.getInt("dept_id");
//                创建对象
                emp = new Emp(id, ename, job_id, mgr, joindate, salary, bonus, dept_id);
//                 将数据添加到集合中
                list.add(emp);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
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

        return list;
    }
}
