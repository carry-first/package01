package com.MyThread.demo1.MyRunnable;

public class run2 {
    public static void main(String[] args) {
//        匿名内部类实现Runnable
        new Thread(new Runnable() {
            //            接口重写Runnable
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + i);
                }
            }
//            匿名对象启用线程
//            等同于Thread t。start
        }).start();
    }
}
