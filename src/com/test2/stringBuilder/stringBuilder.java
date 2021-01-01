package com.test2.stringBuilder;

public class stringBuilder {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("1");
        sb.append(true);
        System.out.println(sb);
        System.out.println(sb.reverse());
        System.out.println(sb.toString());
    }
}
