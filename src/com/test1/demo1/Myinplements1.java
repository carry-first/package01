package com.test1.demo1;

public class Myinplements1 {
    public static void main(String[] args) {
//        匿名对象类
        Myinterface1 obj = new Myinterface1() {
            @Override
            public void eat() {
                System.out.println("匿名内部类");
            }
        };
        obj.eat();
    }
}
