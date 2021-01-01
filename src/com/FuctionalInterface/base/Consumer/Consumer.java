package com.FuctionalInterface.base.Consumer;

public class Consumer {
    public static void useConsumer(String name, java.util.function.Consumer<String> con){
        con.accept(name);
    }

    public static void main(String[] args) {
        useConsumer("赵丽颖",(String name)->{
            System.out.println(new StringBuffer(name).reverse().toString());
        });
    }
}
