package com.MyThread.demo1.test;

public class test1 {
    public static void main(String[] args) {
        Runnable rn = new threaad1();
        Thread t = new Thread(rn);
        Thread t1 = new Thread(rn);
        Thread t2 = new Thread(rn);
        t.start();
        t1.start();
        t2.start();
    }
}

class threaad1 implements Runnable {

    private int num = 100;
    Object obj = new Object();

    @Override
    public void run() {

        while (true) {

            synchronized (obj) {

                if (num > 0) {
                    System.out.println(num);
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    num--;
                    System.out.println("obj:" + obj);
                } else break;

            }

        }
    }
}
