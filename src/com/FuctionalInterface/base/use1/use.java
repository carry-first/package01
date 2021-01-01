package com.FuctionalInterface.base.use1;

public class use {

    public static void main(String[] args) {

     show01(1,()-> System.out.println("lambda调用方法"));
    }

    private static void show01(int level,Function1 f1) {
        if(level == 1){
            System.out.println("权限不是1，不执行代码");
            f1.method1();
        }
    }
}
