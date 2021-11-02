package com.test1.toString;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        int a = 12;
        Scanner sc = new Scanner(System.in);
        System.out.println(Integer.toString(12));
        System.out.println(sc.toString());
        demo d = new demo();
        d.setS("阿凡达");
        System.out.println(d.toString());
    }
}

class demo {
    private String s;

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "重写同String demo{" +
                "s='" + s + '\'' +
                '}';
    }
}