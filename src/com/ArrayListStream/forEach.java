package com.ArrayListStream;

import java.util.stream.Stream;

public class forEach {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三", "李四", "王五", "赵六", "任七");
//        过滤姓赵的
        stream.filter(item -> item.startsWith("赵")).forEach(item -> System.out.println(item));
    }
}
