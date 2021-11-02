package com.review.Thread01;

/**
 * @author Tang A Biao
 * @create 2021/2/22 - 18:58
 */
public class runnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("第" + i + "次循环");
        }
    }
}
