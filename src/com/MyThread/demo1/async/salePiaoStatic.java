package com.MyThread.demo1.async;

public class salePiaoStatic {
    public static void main(String[] args) {
        MyRunnable2 m1 = new MyRunnable2();
        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m1);
        Thread t3 = new Thread(m1);
//        运行线程
        t1.start();
        t2.start();
        t3.start();

    }
}

class MyRunnable2 implements Runnable {

    private static int total =100;
    @Override
    public void run() {
//        循环售票
        while (true){
//            调用买票同步任务
            plaPiao();
//            如果等于0终止程序
            if (total==0) break;
        }
    }
    public synchronized static void plaPiao(){

//            同步锁
//        synchronized (salePiaoStatic.class){

//            如果还有票则继续售票
            if(total>0){
                //        打印当前票数
                System.out.println(Thread.currentThread().getName()+"---->"+total);
//                线程睡眠
                try {
                    Thread.sleep(30);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//        让票数减减
                total--;
//            }
        }
    }
}