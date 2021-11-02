package com.Jsoup.src.code;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Tang A Biao
 * @create 2021/1/4 - 20:57
 */
public class copyBaiduPageImg {
    public static void main(String[] args) throws IOException {
        List<songs> list = new ArrayList<>();
//        Document document = Jsoup.connect("http://www.baidu.com").get();
//        Document document = Jsoup.connect("https://www.baidu.com/s?ie=utf-8&f=8&rsv_bp=1&tn=request_24_pg&wd=%E7%BD%91%E6%98%93%E4%BA%91&oq=jsoup&rsv_pq=a64fe74100005992&rsv_t=bc931%2BSL4jdDG9WikV6L4NepeZGLrIC9yo5K40hSOoiftpyuQDk%2FHCoIT67d%2FKVr8ettlw&rqlang=cn&rsv_enter=1&rsv_dl=tb&rsv_sug3=11&rsv_sug1=7&rsv_sug7=100&rsv_sug2=0&rsv_btype=t&inputT=3207&rsv_sug4=2120905").get();
        Document document = Jsoup.connect("https://music.163.com/discover").get();
//        获取链接中的png图片
        Elements select = document.select("#singer-list li");
        for (Element element : select) {
            String imgLink = element.select(".j-img").attr("src");
            String name = element.select(".f-ib").text();
            String discribe = element.select(".s-fc3").text();
            songs s = new songs(name, discribe, imgLink);
//            System.out.println(element);
            list.add(s);
        }
//        System.out.println(list);
//        System.out.println(document);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
//        System.out.println(document);
    }
}
