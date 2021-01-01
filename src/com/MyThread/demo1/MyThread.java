package com.MyThread.demo1;

public class MyThread extends Thread{
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
//        打印当前线程名字
        System.out.println(Thread.currentThread().getName());;
//        无限创建线程
/*        MyThread m = new MyThread();
        m.start();*/
    }
}
