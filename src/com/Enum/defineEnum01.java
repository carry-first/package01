package com.Enum;

public class defineEnum01 {
    public static void main(String[] args) {
        defineEnum02 autumn = defineEnum02.autumn;
        System.out.println(autumn);
//      输出当前得到的内容
        System.out.println(autumn.toString());
        System.out.println(defineEnum02.values());
//        得到枚举对象的所有方法
        defineEnum02[] values = defineEnum02.values();
        System.out.println("**************************");
        for (defineEnum02 value : values) {
            System.out.println(value);
        }
//        判断字符串是否是该枚举中的方法
        defineEnum02 defineEnum02 = com.Enum.defineEnum02.valueOf("autumn");
        System.out.println(defineEnum02);
//        调用重写的show方法
        autumn.show();
    }
}
