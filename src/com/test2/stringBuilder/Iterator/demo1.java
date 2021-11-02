package com.test2.stringBuilder.Iterator;

import java.util.ArrayList;

public class demo1 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("23");
        al.add(12);
        Integer num = (int) al.get(1);
        System.out.println(num.hashCode());
    }
}
