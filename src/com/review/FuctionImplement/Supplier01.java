package com.review.FuctionImplement;

import java.util.function.Supplier;

/**
 * @author Tang A Biao
 * @create 2021/2/23 - 15:18
 */
public class Supplier01 {
    //    定义Supplier函数接口
    public static String getSupplier(Supplier<String> s) {
//        返回加工后的数据
        return "我爱" + s.get();
    }

    public static void main(String[] args) {
//        使用lambda来简化操作
        String s = getSupplier(() -> "胡歌");
        System.out.println(s);
    }
}
