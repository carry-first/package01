package com.company;

public class abstract1 {
    public static void main(String[] args) {
        cat cat1 = new cat();
        cat1.eat();
    }
}

//定义抽象类
abstract class Animal {
    public abstract void eat();
}

//实现抽象类
class cat extends Animal {
    public void eat() {
        System.out.println("猫吃鱼");
    }
}