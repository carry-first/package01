package com.HashMap;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Entry {
    public static void main(String[] args) {
        use();
    }
    public static void use(){
        Map<String,String> map = new HashMap<>();
        map.put("01","杨过");
        map.put("02","小龙女");
        map.put("03","金毛狮王");
//        定义entry对象
        Set<Map.Entry<String, String>> entries = map.entrySet();
//        定义迭代器
        Iterator<Map.Entry<String, String>> it = entries.iterator();
//        遍历
        while (it.hasNext()){
//            取出当前循环的值
            Map.Entry<String, String> next = it.next();
//            取出键名
            String key = next.getKey();
//            取出值
            String value = next.getValue();
            System.out.println(key+":"+value);
        }


    }
}
