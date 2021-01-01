package com.ArrayListStream;

import java.util.ArrayList;

public class arraylistFilter {
    public static void main(String[] args) {
//        定义list集合
        ArrayList<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("黄蓉");
        list.add("周芷若");
        list.add("张三丰");
//        使用函数编程思想过滤数据
        list.stream()
//                开始长度的字符为“张”
                .filter(name -> name.startsWith("张"))
                .filter(len -> len.length()>=3)
                .forEach( item -> System.out.println(item));
    }
}
