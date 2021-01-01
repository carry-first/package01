package com.test1.implement;

import java.util.Random;

public class implementFirst {
    public static void main(String[] args) {
        MyFirstInterfaceImplement mi = new MyFirstInterfaceImplement();
        mi.eat();
        mi.look();
        mi.write();
        mi.test();
        MyFirstInterface.methodStatic();
        mi.methodDefault1();
        mi.methodDefault2();
        mi.ab();
    }
}
