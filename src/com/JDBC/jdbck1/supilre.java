package com.JDBC.jdbck1;

import com.mysql.cj.jdbc.Driver;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Tang A Biao
 * @create 2021/2/26 - 19:59
 */
public class supilre {
    @Test
    public void testCon01() {
        String url = "jdbc:mysql:///test?&userSSL=false&serverTimezone=UTC";
        String user = "root";
        String password = "123456";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, user, password);
//            connection.sta
        } catch (Exception throwables) {
            throwables.printStackTrace();
        }
    }
}
