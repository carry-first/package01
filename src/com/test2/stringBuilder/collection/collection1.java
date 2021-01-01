package com.test2.stringBuilder.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class collection1 {
    public static void main(String[] args) {
        Collection c1 = new HashSet();
        c1.add("java");
        c1.add("javaScript");
        c1.add("spring");
        c1.add("html");
        c1.add("css");
        c1.add("Vue");
        c1.remove("java");
//        c1.clear();
        Object[] CollectionToArr = c1.toArray();
        System.out.println(c1.isEmpty());
        System.out.println(c1);
        for (int i = 0; i < CollectionToArr.length; i++) {
            System.out.print(CollectionToArr[i]+"\t");
        }
    }
}
