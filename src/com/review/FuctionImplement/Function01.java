package com.review.FuctionImplement;

import java.util.function.Function;

/**
 * @author Tang A Biao
 * @create 2021/2/23 - 16:17
 */
public class Function01 {
    //    定义数据应用lambda
    public static int change(String s, Function<String, Integer> fun) {
        return fun.apply(s);
    }

    public static void main(String[] args) {
//        使用lambda
        int change = change("12", s -> Integer.parseInt(s));
        System.out.println(change);
    }
}
