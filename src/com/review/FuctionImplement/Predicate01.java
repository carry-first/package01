package com.review.FuctionImplement;

import java.util.function.Predicate;

/**
 * @author Tang A Biao
 * @create 2021/2/23 - 15:48
 */
public class Predicate01 {
    //    定义一个消费接口，返回的时boolean类型
    public static boolean compaseTwoNumber(String s, Predicate<String> pre) {
//        使用lambda代码进行判断
        return pre.test(s);
    }

    public static void main(String[] args) {
//        使用接口
        boolean flag = compaseTwoNumber("他惹我四哦我去", s -> s.length() > 5);
        System.out.println("是否大于5：" + flag);
    }

    public static boolean andTwoArgs(String s, Predicate<String> p1, Predicate<String> p2) {
//        p1的lambda表达式和p2的表达式满足后才能返回true
        return p1.negate().test(s);
    }
}
