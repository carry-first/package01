package com.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class keyOnly {
    public static void main(String[] args) {
        use();
    }
    public static void use(){
        Map<Person,String> map = new HashMap<>();
        map.put(new Person("李世民",300),"大民国");
        map.put(new Person("秦始皇",600),"秦朝");
        map.put(new Person("慈禧",200),"清朝");
        map.put(new Person("李世民",300),"清朝");
        Set<Map.Entry<Person, String>> entries = map.entrySet();
        for (Map.Entry<Person,String> item:entries){
//            输出键和值的对应关系
            System.out.println(item.getKey()+"-->"+item.getValue());
        }

    }
}
