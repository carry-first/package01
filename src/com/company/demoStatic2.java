package com.company;

public class demoStatic2 {
    public static void main(String[] args) {

    }
}

class test {
    private static int num;
    private int i;
    private String s;

    public void show() {
        System.out.println("非静态方法" + num);
        System.out.println("非静态方法" + i);
        show1();
    }

    public static void show1() {
        System.out.println("静态方法" + num);
//        System.out.println("静态方法"+i);
    }
}