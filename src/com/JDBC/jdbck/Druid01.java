package com.JDBC.jdbck;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class Druid01 {
    public static void main(String[] args) {
        use();
    }

    private static void use() {
        InputStream is = null;
        try {
            Properties pro = new Properties();
            is = Druid01.class.getClassLoader().getResourceAsStream("druid.properties");
            pro.load(is);
//            获取数据库池对象
            DataSource ds = DruidDataSourceFactory.createDataSource(pro);
//            获取连接对象
            Connection conn = ds.getConnection();
//            打印该对象
            System.out.println(conn);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (is != null) is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
