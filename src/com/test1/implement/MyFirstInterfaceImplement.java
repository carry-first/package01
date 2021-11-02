package com.test1.implement;

public class MyFirstInterfaceImplement implements MyFirstInterface, MyFirstInterface2 {

    @Override
    public void ab() {
        System.out.println("两个接口的抽象方法");
    }

    //如果接口中的默认内容冲突那么必须在实现类中重写默认的方法
    public void dm() {
        System.out.println("实现类default中的重写");
    }

    @Override
    public void eat() {
        System.out.println("第一个接口");
    }

    @Override
    public void look() {
        System.out.println("第二个接口");

    }

    @Override
    public void write() {
        System.out.println("第三个接口");

    }

    @Override
    public void aa(int a) {
        System.out.println(a);
    }
}
