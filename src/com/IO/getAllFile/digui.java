package com.IO.getAllFile;

public class digui {
    public static void main(String[] args) {
        int s = task(5);
        System.out.println(s);
    }

    private static int task(int i) {
//        如果当前i等于1就返回1
        if (i == 1) return 1;

//        如果不是1则递归继续调用自己
        return i * task(--i);
    }
}
