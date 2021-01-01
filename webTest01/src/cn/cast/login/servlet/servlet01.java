package cn.cast.login.servlet;

import cn.cast.dao.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class servlet01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
        req.setCharacterEncoding("utf-8");
//        获取参数
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        User userLogin = new User(name,password);
//        登录
        UserDao userdao = new UserDao();
        User user = userdao.login(userLogin);
        if(user == null){
//            登录失败跳转到失败页面
            req.getRequestDispatcher("/failLogin").forward(req,resp);
        }else{
//        设置静态数据区
            req.setAttribute("user",user);
//            登录成功
            req.getRequestDispatcher("/successLogin").forward(req,resp);
        }

    }
}
