package com.changeArgs;

public class demo1 {
    public static void main(String[] args) {
        double result1 = sum(12, (float) 32.32, 21.4, 32.4, 65.54, 3);
        System.out.println(result1);
        int result2 = sum(12, 432, 21, 43231, 43, 21, 32);
        System.out.println(result2);
    }

    public static int sum(int... nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    public static double sum(int a, float b, double... c) {
        double sum = 0;
//        先把固定的两个参数相加
        sum += a += b;
//        循环遍历c，将所有的double值内容相加
        for (double v : c) {
            sum += v;
        }
        return sum;
    }
}
