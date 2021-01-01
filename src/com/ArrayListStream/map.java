package com.ArrayListStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class map {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("3", "5", "7", "12", "51", "2");
//        map流可以转化数据类型，里面是Function函数式定义接口
        long count = stream.map(item -> Integer.parseInt(item) + 10).count();
//        输出统计的个数
        System.out.println(count);
    }
}
