package com.jpanel.calendar;

import java.util.Calendar;
import java.util.Date;

public class calendar {
    public static void main(String[] args) {
//        getDate();
//        setDate();
//        addDate();
//        getTimeDate();
    }
//    获取时间
    public static void getDate(){
        Calendar cl = Calendar.getInstance();
        int year = cl.get(Calendar.YEAR);
        int month = cl.get(Calendar.MONTH)+1;
        int day = cl.get(Calendar.DAY_OF_MONTH);
        System.out.println(year+"年"+month+"月"+day+"日");
    }
//    设置时间
    public static void setDate(){
        Calendar cl = Calendar.getInstance();
//        设置日期
        cl.set(Calendar.YEAR,3030);
        cl.set(Calendar.MONTH,12);
        cl.set(Calendar.DAY_OF_MONTH,33);
//        获取日期
        int year = cl.get(Calendar.YEAR);
        int month = cl.get(Calendar.MONTH)+1;
        int day = cl.get(Calendar.DAY_OF_MONTH);
        System.out.println(year+"年"+month+"月"+day+"天");
    }
//    添加或减少日期值
    public static void addDate(){
        Calendar cl = Calendar.getInstance();
//增加年份
        cl.add(Calendar.YEAR,1000000);
        cl.add(Calendar.MONTH,2000000);
        cl.add(Calendar.DAY_OF_MONTH,3000000);
//        获取日期
        int year = cl.get(Calendar.YEAR);
        int month = cl.get(Calendar.MONTH)+1;
        int day = cl.get(Calendar.DAY_OF_MONTH);
        System.out.println(year+"年"+month+"月"+day+"天");
    }
    public static void getTimeDate(){
        Calendar cl = Calendar.getInstance();
        System.out.println(cl.getTime());
        System.out.println(new Date().toLocaleString());
    }
}
