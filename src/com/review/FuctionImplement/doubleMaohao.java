package com.review.FuctionImplement;

import com.FuctionalInterface.base.methodQuote.Calcable;

/**
 * @author Tang A Biao
 * @create 2021/2/23 - 17:00
 */
public class doubleMaohao {
    public static int cal(int num, Calcable calcable) {
//        返回使用的lambda表达式的值
        return calcable.calc(num);
    }

    public static void main(String[] args) {
        int num = -10;
//        因为源码中的方法abs已存在，直接使用引用就可以了
        int cal = cal(num, Math::abs);
        System.out.println("转化的值：" + cal);
    }
}
