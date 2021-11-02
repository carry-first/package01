package com.review.ListStream01;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author Tang A Biao
 * @create 2021/2/23 - 16:38
 */
public class listStream01 {
    public static void main(String[] args) {
        Stream<? extends Serializable> list = Stream.of("张无忌", 1, 32);
        boolean flag = list.anyMatch(item -> item.equals("黄月"));
        System.out.println("是否包含张无忌" + flag);
    }
}
