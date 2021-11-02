package com.MyThread.demo1.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class salePiao {
    public static void main(String[] args) {
        MyRunnable1 m1 = new MyRunnable1();
        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m1);
        Thread t3 = new Thread(m1);
//        运行线程
        t1.start();
        t2.start();
        t3.start();
    }
}

class MyRunnable1 implements Runnable {

    private int total = 100;
    //    定义lock锁
    Lock l = new ReentrantLock();

    @Override
    public void run() {
//        循环售票
        while (true) {
//          获取锁
            l.lock();
//            如果还有票则继续售票
            if (total > 0) {
                try {
//                        线程睡眠
                    Thread.sleep(100);
//                打印当前票数
                    System.out.println(Thread.currentThread().getName() + "---->" + total);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
//                        无论是否成功执行都会释放锁
                    l.unlock();
                }
//        让票数减减
                total--;
            } else {
                break;
            }
        }
    }
}