package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class baseUse {
    public static void main(String[] args) {
//        show01();
//        show02();
        show03();
    }

    private static void show03() {
        Collection col = new ArrayList();
        col.add("ji");
        col.add("23");
        col.add("fdsa");
        col.add(12);
        col.add(53);
        col.add(19);
    }

    private static void show02() {
        ArrayList arr = new ArrayList();
        arr.add(12);
        arr.add(431);
        arr.add(34);
        arr.add(2);
        arr.add(65);
        arr.add(42);
        arr.sort(((o1, o2) -> Integer.parseInt(o2.toString()) - Integer.parseInt(o1.toString())));
        System.out.println(arr);
    }

    private static void show01() {
        List arrl = new ArrayList();
        arrl.add("jjio");
        Object[] objects = arrl.toArray();
        System.out.println(objects[0]);
    }

}
