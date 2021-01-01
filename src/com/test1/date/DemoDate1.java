package com.test1.date;

import java.util.Date;

public class DemoDate1 {
    public static void main(String[] args) {
        long newDate = System.currentTimeMillis();
//        输出当前毫秒数
        System.out.println(newDate);
        Date d1 = new Date();
//        输出当前的时间
        System.out.println(d1);
//        将毫秒数转换为日期
        Date d2 = new Date(newDate);
        System.out.println(d2);
//         将如期转化为毫秒数
        System.out.println(d2.getTime());
    }
}
