package com.test1.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoDate2 {
    public static void main(String[] args) throws ParseException {
        demo2();
    }

    public static void demo2() throws ParseException {
//        把符合模式的字符串解析为日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年mm月dd日 hh点整");
        Date date = new Date(String.valueOf(sdf.parse("2020年9月28日 21点整")));
        System.out.println(date);
    }

    public static void demo1() {
        //        定义一个简单的日期格式化对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        Date date = new Date();
//        使用日期格式化中的format方法对日期进行格式化，里面传递一个日期
        String result = sdf.format(date);
//        输出
        System.out.println(result);
    }
}
