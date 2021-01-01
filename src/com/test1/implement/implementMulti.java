package com.test1.implement;

public class implementMulti implements multiInterface{
    @Override
    public void eat() {
        System.out.println("第一个类的吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("第一个类的睡觉");
    }
}
