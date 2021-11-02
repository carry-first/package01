package com.MyThread.demo1;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Tang A Biao
 * @create 2021/10/9 - 17:00
 */
public class ConcurrentMap {
    public static void main(String[] args) {
        MyThread01 t = new MyThread01();
        new Thread(t).start();
        new Thread(t).start();
    }

}


class MyThread01 implements Runnable{

    ConcurrentHashMap<Integer,Double> map = new ConcurrentHashMap<>();

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            map.put(i,i+Math.random());
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }
    }
}