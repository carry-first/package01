package com.MyThread.demo1;

public class demo1 {
    public static void main(String[] args) {
        for (int i = 0; i < 30; i++) {
            System.out.println(i);
//            因为主程序就是一个主线程所以可以直接使用Thread中的方法
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
