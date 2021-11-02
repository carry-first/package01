package com.review.lambda;

/**
 * @author Tang A Biao
 * @create 2021/2/23 - 12:48
 */
public class show01 {
    public static void main(String[] args) {
        me01(2, () -> {
            System.out.println("当前线程：" + Thread.currentThread().getName());
        });
    }

    public static void me01(int level, fn01 f) {
        if (level == 1) {
            System.out.println("权限==1");
            f.method01();
        } else {
            System.out.println("权限不足");
        }
    }
}
