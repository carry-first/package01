package com.revise.simple;

/**
 * @author Tang A Biao
 * @create 2021/9/18 - 17:56
 */
public class str {
    public static void main(String[] args) {
        String s1 = "kk";
        String s2 = new String("KK");
        String s3 = "fewaoijJIDOFjiofew安妮";
        final byte[] bytes = s3.getBytes();


        System.out.println(s1 == s2);
    }
}
