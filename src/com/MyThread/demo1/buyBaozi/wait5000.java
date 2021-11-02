package com.MyThread.demo1.buyBaozi;

public class wait5000 {
    public static void main(String[] args) {
        //        创建锁对象
        Object obj = new Object();
//        创建客户
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    //                调用同步锁
                    synchronized (obj) {
                        System.out.println("老板做几个包子");
//                    无限等待中
                        try {
                            obj.wait(5000);
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
    }
}
