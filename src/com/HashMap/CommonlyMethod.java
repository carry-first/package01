package com.HashMap;

import java.util.*;

public class CommonlyMethod {
    public static void main(String[] args) {
//        use();
//        For();
        LinkedHashMap();
    }
    private static void LinkedHashMap() {
        Map<String,String> map = new LinkedHashMap<>();
        map.put("01","杨过");
        map.put("02","小龙女");
        map.put("03","金毛狮王");
//           得到所有键名
        Set<String> strings = map.keySet();
//        定义迭代器
        Iterator it = strings.iterator();
        while (it.hasNext()){
            System.out.println(map.get(it.next()));
        }

        for (String item:map.keySet()){
//                输出内容
            System.out.println(item+"="+map.get(item));
        }
    }

    private static void For() {
        Map<String,String> map = new HashMap<>();
        map.put("01","杨过");
        map.put("02","小龙女");
        map.put("03","金毛狮王");
//           得到所有键名
        Set<String> strings = map.keySet();
//        定义迭代器
        Iterator it = strings.iterator();
        while (it.hasNext()){
            System.out.println(map.get(it.next()));
        }

        for (String item:map.keySet()){
//                输出内容
                System.out.println(item+"="+map.get(item));
            }
    }

    public static void use(){
        Map<String,String> map = new HashMap<>();
        map.put("01","杨过");
        map.put("02","小龙女");
        map.put("03","金毛狮王");
        System.out.println(map);
    }
}
