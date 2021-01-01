package com.JDBC.jdbck;

import com.JDBC.util.JDBCutils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbcWork {
    public static void main(String[] args) {
        use();
    }

    private static void use() {
        JDBCutils jd = new JDBCutils();
        Connection connection = null;
        PreparedStatement pst1 = null;
        PreparedStatement pst2 = null;
        try {
            connection = jd.getConnection();
//            开启事务
            connection.setAutoCommit(false);
//           定义sql
            String sql1= "update casetab set salary = salary - ? where cc = ? ";
            String sql2= "update casetab set salary = salary + ? where cc = ? ";
            pst1 = connection.prepareStatement(sql1);
            pst2 = connection.prepareStatement(sql2);
//            设置？的值
            pst1.setDouble(1,500);
            pst1.setString(2,"lisi");
            pst2.setDouble(1,500);
            pst2.setString(2,"zhangsan");
//            进行转账
            int i1 = pst1.executeUpdate();
            if(i1 > 0) System.out.println(i1+"------sql1执行成功");
//            代码报错的时候
            int i = 10/0;
            int i2 = pst2.executeUpdate();
            if(i2 > 0) System.out.println(i2+"------sql2执行成功");
//            如果没出错提交数据表
            connection.commit();
        } catch (SQLException throwables) {
//            如果出现错误回滚事务
            try {
               if(connection!=null) {
                   connection.rollback();
                   System.out.println("事务回滚成功");}
            } catch (SQLException e) {
                e.printStackTrace();
            }
            throwables.printStackTrace();
        }finally {
            jd.close(connection,pst1);
            try {
                if(pst2 !=null) pst2.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
