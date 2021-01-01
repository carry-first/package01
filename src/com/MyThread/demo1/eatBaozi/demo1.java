package com.MyThread.demo1.eatBaozi;

public class demo1 {
    public static void main(String[] args) {
        Baozi baozi = new Baozi();
//        创建线程并执行包子铺线程
        new baozipu(baozi).start();
//        创建吃货线程并执行吃货线程
        new chihuo(baozi).start();
    }
}
