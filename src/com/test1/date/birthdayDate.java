package com.test1.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class birthdayDate {
    public static void main(String[] args) throws ParseException {
//        定义扫描器
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入生日日期，格式为：yyyy-MM-dd");
//        输入的时间
        String Birthday = sc.next();
//          定义简单的如期格式化工具
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        获取当前毫秒数
        long todayDate = new Date().getTime();
//        将输入的内容转化为日期格式
        Date birthdayInput = sdf.parse(Birthday);
//        将输入的日期转化为毫秒数
        long birthdayDate = birthdayInput.getTime();
//        相差的时间
        long DifferenceDate = todayDate - birthdayDate;
//        将日期转化为天
        long result = DifferenceDate / 1000 / 60 / 60 / 24 / 30 / 12;
        System.out.println(result);
    }
}
