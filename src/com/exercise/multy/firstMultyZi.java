package com.exercise.multy;

public class firstMultyZi extends firstMultyFu {
    int num = 20;

    public void privateMethod() {
        System.out.println("子类独有方法");
    }

    public void method() {
        System.out.println("子类方法");
    }

    public void getNum() {
        System.out.println(num);
    }
}
