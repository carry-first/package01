package com.review;

public class impTest01 implements Testinterface01{
    @Override
    public void eat() {
        System.out.println("吃");
    }

    @Override
    public void sleep() {
        System.out.println("sleep");
    }
}
