package com.test1;

import java.util.ArrayList;

public class list {
    public static void main(String[] args) {
        ArrayList<ArrayList> arr = new ArrayList<>();
        ArrayList<Integer> element = new ArrayList<>();
        ArrayList<String> str = new ArrayList<>();
        str.add("第一个字符串");
        str.add("第二个字符串");
        element.add(12);
        element.add(32);
        element.add(54);
        element.add(32);
        arr.add(element);
        arr.add(str);
        System.out.println(arr);
    }
}
