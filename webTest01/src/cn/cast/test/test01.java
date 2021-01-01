package cn.cast.test;

import cn.cast.dao.UserDao;
import cn.cast.login.servlet.User;
import org.junit.Test;

public class test01 {

    @Test
    public void test(){
        User u = new User("tang","123");
        UserDao dao = new UserDao();
        User result = dao.login(u);
        System.out.println(result);
    }
}
