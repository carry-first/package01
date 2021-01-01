package cn.cast.dao;

import cn.cast.login.servlet.User;
import cn.cast.util.JDBCutils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDao {
//    获取数据库连接模板
    JdbcTemplate template = new JdbcTemplate(JDBCutils.getDataSource());

//    定义查询方法
    public User login(User loginUser){
        try {
//        定义sql
            String sql = "select * from users where name = ? and password = ?";
//        查询
            User user = template.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class),
                    loginUser.getName(), loginUser.getPassword());
//        如果没有错误返回查询结果
            return user;
        } catch (DataAccessException e) {
//            e.printStackTrace();
//            如果没有查询到返回空
            return null;
        }
    }
}
