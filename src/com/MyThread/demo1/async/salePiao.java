package com.MyThread.demo1.async;

public class salePiao {
    public static void main(String[] args) {
        MyRunnable1 m1 = new MyRunnable1();
        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m1);
        Thread t3 = new Thread(m1);
        System.out.println("Run:" + m1);
//        运行线程
        t1.start();
        t2.start();
        t3.start();

    }
}

class MyRunnable1 implements Runnable {

    private int total = 100;
    Object obj = new Object();

    @Override
    public void run() {
        System.out.println(this);
//        循环售票
        while (true) {
//            调用买票同步任务
            plaPiao();
//            如果等于0终止程序
            if (total == 0) break;
        }
    }

    public /*synchronized*/  void plaPiao() {

//            同步锁
        synchronized (this) {

//            如果还有票则继续售票
            if (total > 0) {
                //        打印当前票数
                System.out.println(Thread.currentThread().getName() + "---->" + total);
//                线程睡眠
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//        让票数减减
                total--;
            }
        }
    }
}