package com.review.Thread01;

/**
 * @author Tang A Biao
 * @create 2021/2/22 - 19:02
 */
public class newThread extends Thread {
    public static void main(String[] args) {
        newThread t = new newThread();
        t.start();
        System.out.println("主线程名：" + Thread.currentThread().getName());
        Object o = new Object();

    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("第" + i + "次循环");
        }
        System.out.println("被调用的线程：" + Thread.currentThread().getName());
    }
}
