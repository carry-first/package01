package com.company;

public class string1 {
    public static void main(String[] args) {
        String a = "aaa";
        String b = "aaa";
        String c = "bb";
        char ch[] = {'a', 'b', 'c'};
        String d = new String(ch);
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a == d);
    }
}
