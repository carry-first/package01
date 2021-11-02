package com.test1.demo1;

public class testWork {
    public static void main(String[] args) {
        putong();
//        test1();
    }

    //    test
    public static void test1() {
        int num = 0;
        char c = 'a';
        while (c <= 'c') {
            switch (c++) {
                case 'a':
                    num++;
                case 'b':
                    num -= 10;
                    continue;
                case 'c':
                    num += 2;
                    break;
            }
            System.out.println("执行了");
        }
        System.out.println(num);
    }

    public static void putong() {
        char c = 'A';
        int k = 0;
        do {
            switch (c++) {
                case 'A':
                    k++;
                    break;//2
                case 'B':
                    k--;//4
                case 'C':
                    k += 2;
                    break;//7
                case 'D':
                    k %= 2;
                    System.out.println("C:" + c + "K:" + k);
                    continue;//0
                case 'E':
                    k *= 10;
                    System.out.println("C:" + c + "K:" + k);
                    break;
            }
            k++;
            System.out.println("switch后C:" + c + "K:" + k);
        } while (c < 'G');
        System.out.println(k);
    }
}
