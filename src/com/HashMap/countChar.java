package com.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countChar {
    public static void main(String[] args) {
        count();
    }

    private static void count() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
//        定义hashMap
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
//            获取当前循环的字符
            char c = s.charAt(i);
//            如果当前key名存在
            if (map.containsKey(c)) {
//                获取键对应的值
                Integer value = map.get(c);
//                增加
                value++;
//                重置值
                map.put(c, value);
            } else {
//                如果没有的话创建集合元素
                map.put(c, 1);
            }
        }
        System.out.println(map);
    }
}
