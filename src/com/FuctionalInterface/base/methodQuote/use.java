package com.FuctionalInterface.base.methodQuote;


public class use {
    public static void pr(Fuction2 p) {
        p.pri("Hello World!");
    }

    public static void main(String[] args) {
        pr(s -> System.out.println(s));
        pr(System.out::println);
    }
}
