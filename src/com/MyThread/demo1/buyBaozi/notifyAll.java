package com.MyThread.demo1.buyBaozi;

public class notifyAll {
    public static void main(String[] args) {
//        创建锁对象
        Object obj = new Object();
//        创建客户
        new Thread(){
            @Override
            public void run() {
                while (true){
                    //                调用同步锁
                    synchronized (obj){
                        System.out.println("老板做几个包子");
//                    无限等待中
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
//                    当老板线程做好包子后使用同步锁中的obj唤醒
//                    用户就可以执行下面代码
                        System.out.println("包子拿到了，开吃");
                    }
                    System.out.println("-----------------------------");
                }
            }
        }.start();
//        老板线程
        new Thread(){
            @Override
            public void run() {
                while(true){
                    //                老板类做包子
//                线程睡眠，5秒后做好一组包子
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
//                确保线程的同步，等待和唤醒的操作只有一个
//                包子做好了唤醒obj同步锁对象，可以继续执行同步锁后的任务
                    synchronized (obj){
                        System.out.println("包子已经做好了");
//                    唤醒obj类
                        obj.notify();
                    }
                }
            }
        }.start();
    }
}
