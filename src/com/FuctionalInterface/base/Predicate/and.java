package com.FuctionalInterface.base.Predicate;

import java.util.function.Predicate;

public class and {
    public static boolean and(String s, Predicate<String> a, Predicate<String> b) {
//        a和b同时满足我所定义的规则的时候就返回true
        return a.and(b).test(s);
    }

    public static void main(String[] args) {
//        如果传递的字符串大于3并小于6的话返回true
        System.out.println(and("jiews", s -> s.length() > 3, s -> s.length() < 6));
    }
}
