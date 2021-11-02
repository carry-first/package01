package com.demo02.ArrayListSort;

import java.util.*;

public class testCollection {
    public static void main(String[] args) {
//        Col();
//        Arr();
        List();
    }

    private static void List() {
        LinkedList list = new LinkedList();
        list.add(12);
        list.add(43);
        list.add("ds");
        list.add(true);
        list.removeFirst();
        System.out.println(list);
        Object o = 12;
        System.out.println(o);
    }

    private static void Arr() {
        ArrayList arrl = new ArrayList();
        arrl.add("dd");
        arrl.add(123);
        arrl.add(true);
        arrl.add(1, "插入元素");
        Collections.addAll(arrl, 12, 534, 32, "lkf");
//        打乱元素
        Random rm = new Random();
        Collections.shuffle(arrl);
        System.out.println(arrl);
    }

    private static void Col() {
        Collection cl = new ArrayList<>();
        cl.add(12);
        cl.add(21);
        cl.add("fds");
        cl.add(true);
        cl.add(false);
        System.out.println(cl);
    }

}
