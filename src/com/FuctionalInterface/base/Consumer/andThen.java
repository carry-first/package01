package com.FuctionalInterface.base.Consumer;

import java.util.function.Consumer;

public class andThen {
    public static void andThen(String s, Consumer<String> t1,Consumer<String> t2){
        t1.andThen(t2).accept(s);
    }
    public static void main(String[] args) {
        andThen("hello",(t1)->{
            System.out.println(t1.toLowerCase());
        },(t2)->{
            System.out.println(t2.toUpperCase());
        });
    }
}
