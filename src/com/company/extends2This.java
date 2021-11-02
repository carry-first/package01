package com.company;

public class extends2This {
    public static void main(String[] args) {
        son2 s = new son2();
    }
}

class fa2 {

}

class son2 {
    son2() {
        System.out.println("子类构造函数");
    }

    son2(int a) {
//        构造方法的调用自己调用自己
//        调用的是son2，必须是第一条语句
        this();
    }

    public void show1() {
//        调用本类中的方法
        this.show2();
    }

    public void show2() {

    }
}