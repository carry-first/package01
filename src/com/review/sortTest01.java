package com.review;

import java.util.*;

public class sortTest01 {
    public static void main(String[] args) {
        Random rm = new Random(3);
        List<Integer> list = Arrays.asList(12,42,12,4,36,7,43,8,54,4,75);
        Collections.sort(list);
        System.out.println(list);
        Collections.shuffle(list,rm);
        System.out.println(list);
        int k = 2/0;
    }
}
