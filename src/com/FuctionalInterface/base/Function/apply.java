package com.FuctionalInterface.base.Function;


import java.util.function.Function;

public class apply {
    public static int change(String s, Function<String,Integer> fun){
        return fun.apply(s)+20;
    }
    public static void main(String[] args) {
//        转化并输出内容
        System.out.println( change("123",s -> Integer.parseInt(s)));
    }
}
