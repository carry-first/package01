package com.test1.exampleUsb;

public class Main {
    public static void main(String[] args) {
//        新建一个计算机类
        Computer cm = new Computer();
//        开启
        cm.powerOn();
//        多态类鼠标类
        USB mouseUsb = new Mouse();
//          通过计算机调用鼠标的使用
        cm.useDivice(mouseUsb);
//        匿名调用
        cm.useDivice(new Keyborad());
//        关闭计算机
        cm.powerOff();
    }
}
