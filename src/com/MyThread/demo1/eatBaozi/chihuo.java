package com.MyThread.demo1.eatBaozi;

public class chihuo extends Thread {
    private Baozi baozi;

    public chihuo(Baozi baozi) {
        this.baozi = baozi;
    }

    @Override
    public void run() {
//        一直吃包子
        while (true) {
            //       使用同步技术保证包子生产和吃货吃包子只有一个在执行
            synchronized (baozi) {
//        判断是否有包子
                if (baozi.flag) {
//            有包子就吃包子1秒吃包子的时间
                    System.out.println("吃货正在吃：" + baozi.pi + baozi.xian + "味的包子");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
//                修改包子的状态
                    baozi.flag = false;
//                    提示包子已经吃完了
                    System.out.println("包子被吃货吃完了");
//                让包子铺做包子
                    baozi.notify();
                    System.out.println("--------------------------");
                }
//              如果没有包子，包子作为同步锁的对象，直接等待
                try {
                    baozi.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
