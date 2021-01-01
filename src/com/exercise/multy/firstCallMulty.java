package com.exercise.multy;

public class firstCallMulty {
    public static void main(String[] args) {
//        定义多态的使用
        firstMultyFu dt = new firstMultyZi();
//        向下转型
        firstMultyZi downZi = (firstMultyZi) dt;
//        子类的独有方法
        downZi.privateMethod();
//        子类重写了父类的方法所以得到的是子类的内容
        dt.method();
//        变量不能重写所以得到的是父类的变量
        System.out.println(dt.num);
        dt.getNum();
    }
}
