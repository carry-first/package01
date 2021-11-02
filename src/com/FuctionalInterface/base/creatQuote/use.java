package com.FuctionalInterface.base.creatQuote;

import java.util.concurrent.Executors;

public class use {

    public static void printPerson(String name, biuldPerson bp) {
//        将字符串传递给perosn
        Person p = bp.builderPerson(name);
//        输出p
        System.out.println(p);
//        ClassLoader
    }

    public static void main(String[] args) {
//        简化打印的操作
        printPerson("迪丽热巴", s -> new Person(s));
//        简化箭头函数
        printPerson("赵丽颖", Person::new);
    }
}
