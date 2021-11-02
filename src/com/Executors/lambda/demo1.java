package com.Executors.lambda;

public class demo1 {
    public static void main(String[] args) {
//        创建线程并使用lambda表达式替代Runnable中的run方法
        new Thread(() -> {
            System.out.println("线程" + Thread.currentThread().getName());
        }).start();
    }
}
