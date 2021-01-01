package com.MyThread.demo1.MyRunnable;

public class runImpl {
    public static void main(String[] args) {
//        创建线程
        runnable run = new runnable();
//        将线程放入到创建的线程中
//        因为runnable没有start方法所以借助线程类来实现线程的调用
        Thread t = new Thread(run);
//        调用线程
        t.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("main:"+i);
        }
    }
}
