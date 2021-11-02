package com.company;

public class string2 {
    public static void main(String[] args) {
        String s1 = "abcfasdfwe";
        String s2 = "def";
//        System.out.println(s1.concat(s2));
//        System.out.println(s1.substring(2,5));
//        System.out.println(s1.indexOf('f'));
//        System.out.println(s1.indexOf("cf",1));
        byte ch[] = s1.getBytes();
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i] + "\t");
        }
        char ch1[] = s1.toCharArray();
        for (int i = 0; i < ch1.length; i++) {
            System.out.print(ch1[i]);
        }
    }
}
