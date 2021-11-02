package com.JDBC.jdbck;

import com.JDBC.util.JDBCuitlDruid;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DruidImpl {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstm = null;
        try {
//            获取数据池中的连接对象
            conn = JDBCuitlDruid.getConnection();
//            定义sql
            String sql = "insert into casetab values(null,?,?)";
//            获取sql执行对象
            pstm = conn.prepareStatement(sql);
//            设置？的值
            pstm.setString(1, "田七");
            pstm.setDouble(2, 4589);
            int i = pstm.executeUpdate();
            if (i > 0) {
                System.out.println(i + "sql执行成功");
            } else {
                System.out.println(i + "sql执行失败");
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
//            返回连接对象
            JDBCuitlDruid.close(conn, pstm);
        }
    }
}
