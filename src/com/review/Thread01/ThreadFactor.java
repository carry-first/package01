package com.review.Thread01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Tang A Biao
 * @create 2021/2/22 - 20:47
 */
public class ThreadFactor {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(new runnable());
        executorService.shutdown();
    }
}
