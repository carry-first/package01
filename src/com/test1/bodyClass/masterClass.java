package com.test1.bodyClass;

import java.lang.reflect.Array;
import java.util.Scanner;

public class masterClass {
    public static void main(String[] args) {
//        直接创建内部类
        Body.heart h = new Body().new heart();
//        h.beat();
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        printpp(n);
        System.out.println(codivisor(12, 8));
    }

    public static long codivisor(long x1, long x2) {
        long t = 0;
        while (x2 != 0) {
            t = x1 % x2;
            x1 = x2;
            x2 = t;
        }

        return x1;
    }

    public static void printpp(int n) {
        int i = 0;
        if (n == 0) return;
        else while (n != 0) {
            if (n > 0) {
                System.out.print(n % 10);
            } else {
                System.out.print(-n % 10);
            }
            i++;
            n /= 10;
        }
    }
}
