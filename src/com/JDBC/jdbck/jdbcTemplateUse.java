package com.JDBC.jdbck;

import com.JDBC.util.JDBCuitlDruid;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class jdbcTemplateUse {
    JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCuitlDruid.getDruid());
    @Test
    public void update(){
//        定义sql
        String sql = "update emp set salary = ? where ename = ?";
//        获取返回值
        int i = jdbcTemplate.update(sql, 10000, "孙悟空01");
//        输出是否成功
        System.out.println(i);
    }

//    创建一条数据
    @Test
    public void createPerson(){
//        定义sql
        String sql = "insert into emp(id,ename,salary) values(?,?,?)";
//        获取返回值
        int i = jdbcTemplate.update(sql, null,"段誉",20000);
//        输出是否成功
        System.out.println(i);
    }

//    查询单条数据
    @Test
    public void queryMap(){
//        定义sql
        String sql = "select * from emp where id = ?";
//        获取返回值
        Map<String, Object> sm = jdbcTemplate.queryForMap(sql,1004);
//        输出是否成功
        System.out.println(sm);
    }

//    查询所有数据
    @Test
    public void queryList(){
//        定义sql
        String sql = "select * from emp";
//        获取返回值
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
//        遍历获取到的结果
        for (Map<String, Object> map : maps) {
//            打印当前集合
            System.out.println(map);
        }
    }

//    查询所有并返回集合对象
    @Test
    public void queryAll(){
        String sql = "select * from emp";
//        获取返回值
        List<Emp> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Emp>(Emp.class));
//        遍历集合对象
        for (Emp emp : query) {
            System.out.println(emp);
        }

    }
}
