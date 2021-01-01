package com.test2.stringBuilder.Generic;

import java.util.*;

public class example {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Citizen>> hmap = new HashMap<>();
        ArrayList<Citizen> list = new ArrayList<>();
        list.add(new Citizen("刘恺威",23));
        list.add(new Citizen("杨幂",19));
        list.add(new Citizen("小糯米",2));

        hmap.put("刘恺威一家",list);

        Set<Map.Entry<String, ArrayList<Citizen>>> entries = hmap.entrySet();
        Iterator<Map.Entry<String, ArrayList<Citizen>>> iterator = entries.iterator();

        while(iterator.hasNext()){
//            获取entry对象，也就是存储的键值对
            Map.Entry<String, ArrayList<Citizen>> Entry = iterator.next();
            String key = Entry.getKey();

//            通过entry对象get
            ArrayList<Citizen> value = Entry.getValue();
            System.out.println(key);
            for (Citizen citizen : value) {
                System.out.print("姓名:"+citizen.getName()+"   年龄:"+citizen.getAge()+"\t");
            }

        }
    }
}
