package com.test1;

import java.lang.reflect.Array;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class test1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Map map = count(sc.next());
//        System.out.println(map.toString());;
         count2(sc.next());
    }

    private static void count2(String next) {
        int index = 0;
         next.indexOf(index,next.charAt(0));

    }

    private static Map count(String next) {
//        使用map集合来统计不重复的字符个数
        Map map = new LinkedHashMap<String,Integer>();
//        使用for遍历
        for (int i = 0; i < next.length(); i++) {
//            获取当前循环的key值
            char c = next.charAt(i);
//            如果当前字符存在
            if(map.containsKey(c)){
//                获取键值
                int num = (int)map.get(c);
//                重定义键值
                map.put(c,++num);
            }else{
//                如果当前字符不存在
                map.put(c,1);
            }
        }
//        返回map集合
        return map;
    }

}
