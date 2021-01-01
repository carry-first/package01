package com.test2.stringBuilder.Generic;

public class demoMainGeneric {
    public static void main(String[] args) {
//        直接使用泛型
        implementsGeneric1 im = new implementsGeneric1();
        im.method("第一种使用方法");
//        定义泛型中的数据类型
        implementsGeneric2<Integer> im2 = new implementsGeneric2<>();
        im2.method(12);
    }

}

class generic01 <T>{
//    T [] arr01 = new T[12];
    T [] arr02 = (T[])new Object[12];

}
