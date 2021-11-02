package cn.cast.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCutils {
    private static DataSource ds;

    static {
        try {
//            定义集合类来加载配置文件
            Properties pro = new Properties();
            InputStream is = JDBCutils.class.getClassLoader().getResourceAsStream("druid.properties");
//            加载配置文件
            pro.load(is);
//            通过工厂数据源来获取数据数据池
            ds = DruidDataSourceFactory.createDataSource(pro);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //    获取数据池对象
    public static DataSource getDataSource() {
        return ds;
    }

    //    获取连接对象
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
}
