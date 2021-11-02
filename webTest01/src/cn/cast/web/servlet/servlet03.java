package cn.cast.web.servlet;

import javax.net.ssl.HttpsURLConnection;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

@WebServlet("/demo04")
public class servlet03 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
//        获取指定字符参数
        String name = req.getParameter("name");
//        获取指定字符数组参数，多用于cheekbox
        String[] hobbies = req.getParameterValues("hobbies");
//        获取数据体中的键值名字
        Enumeration<String> parameterNames = req.getParameterNames();
//        获取数据体中所有数据，第一个为键值（name参数），第二个为所有参数值（values）
        Map<String, String[]> parameterMap = req.getParameterMap();
        System.out.println("paramter  name:" + name);
        System.out.println("paramterValues------------------");
        for (int i = 0; i < hobbies.length; i++) {
            System.out.println(hobbies[i]);
        }
        System.out.println("paramterNames------------------");
        while (parameterNames.hasMoreElements()) {
            System.out.println(parameterNames.nextElement());
        }
        System.out.println("paramterMap------------------");
        Set<String> strings = parameterMap.keySet();
        for (String string : strings) {
            String[] values = parameterMap.get(string);
            for (String value : values) {
                System.out.println(value);
            }
        }
    }
}
