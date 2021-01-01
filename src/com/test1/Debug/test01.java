package com.test1.Debug;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Tang A Biao
 * @create 2021/1/1 - 17:23
 */
public class test01 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("zs","我是张三");
        map.put("ls","我是李四");
        map.put("ww","我是王五");
//        System.out.println(map);
        for (int i = 0; i < 10; i++) {
            System.out.println(i+"次");
        }

    }

}
