package com.Executors;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class demo1 {
    public static void main(String[] args) {
//        创建线程池
        ExecutorService es = Executors.newFixedThreadPool(2);
//        执行线程
        es.submit(new RunnableImpl1());
        es.submit(new RunnableImpl1());
        es.submit(new RunnableImpl1());

//        关闭线程池
        es.shutdown();
    }
}

class RunnableImpl1 implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"正在执行");
    }
}