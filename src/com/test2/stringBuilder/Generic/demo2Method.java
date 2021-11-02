package com.test2.stringBuilder.Generic;

public class demo2Method {
    public static void main(String[] args) {
//        调用泛型方法
        demo d = new demo();
        d.method(12);
        d.method("jfsaf");
        d.method(true);
    }
}

class demo {
    //    定义泛型方法
    public <M> void method(M arg) {
        System.out.println(arg);
    }
}
