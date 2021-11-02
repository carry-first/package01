package com.FuctionalInterface.base.Supplier;

import java.util.function.Supplier;

public class use {
    public static String getSupplier(Supplier<String> s) {
        return s.get();
    }

    public static void main(String[] args) {
//        使用lambda调用供应商方法
        String s = getSupplier(() -> "胡歌");
        System.out.println(s);
    }
}
