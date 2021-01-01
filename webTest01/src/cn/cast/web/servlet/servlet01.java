package cn.cast.web.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/demokkk")
public class servlet01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        获取请求头的全部名称
        Enumeration<String> headerNames = req.getHeaderNames();
//        循环遍历枚举中是否还有元素
        while (headerNames.hasMoreElements()){
//            获取当前元素名
            String name = headerNames.nextElement();
//            获取头部信息
            String header = req.getHeader(name);
//            输出头部信息
            System.out.println(name+": "+header);
        }

    }
}
