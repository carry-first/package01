package com.test2.stringBuilder.Generic;

import java.util.ArrayList;
import java.util.Iterator;

public class demo3 {
    public static void main(String[] args) {
        ArrayList<Integer> intArr = new ArrayList<>();
        intArr.add(12);
        intArr.add(32);
        ArrayList<String> StringArr = new ArrayList<>();
        StringArr.add("a");
        StringArr.add("b");
        print(intArr);
        print(StringArr);
    }
//    不确定要传递什么类型的集合，类型使用？代替
    public static void print(ArrayList<?> list){
//        迭代器Iterator
        Iterator<?> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
