package com.test1.implement;

public class musterImplement {
    public static void main(String[] args) {
        multiInterface mi = new implementMulti();
        multiInterface m2 = new implementMulti2();
        mi.eat();
        mi.sleep();
        m2.eat();
        m2.sleep();
    }

}
