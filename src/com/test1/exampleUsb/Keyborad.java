package com.test1.exampleUsb;

public class Keyborad implements USB {

    @Override
    public void open() {
        System.out.println("打开键盘");
    }

    @Override
    public void close() {
        System.out.println("关闭键盘");
    }

    public void keyDown() {
        System.out.println("键被按下");
    }
}
