package cn.cast.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/demo002")
public class servlet02 extends HttpServlet {
    @Override
//    获取请求体内容
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        获取请求读取流
        BufferedReader reader = req.getReader();
        String len = null;
//          循环读取数据
        while ((len = reader.readLine()) !=null){
            System.out.println(len);
        }
        reader.close();
    }
}
