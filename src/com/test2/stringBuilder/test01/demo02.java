package com.test2.stringBuilder.test01;

import java.util.Arrays;
import java.util.Date;

public class demo02 {
    public static void main(String[] args) {
//        show01();
        shou02();
       int a =10;
    }

    private static void shou02() {
        int arr[] = {23,523,72,634,74,23,12,54,8,143};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void show01() {
        Date date = new Date();
        String str = String.format("%tF",date);
        System.out.println(str);
        StringBuilder sb = new StringBuilder(10);
        String s1 = Integer.toBinaryString(4323);
        System.out.println(s1);
        System.out.println(Integer.toHexString(2349242));
    }
}
