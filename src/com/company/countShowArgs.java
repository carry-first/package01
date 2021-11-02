package com.company;

import java.util.Scanner;

public class countShowArgs {
    public static void main(String[] args) {
        String s = "";
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        char ch[] = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            String temp = "";
            char c = ch[i];
//            如果再temp找不到字符则表示该字符没有查询过
            if (temp.indexOf(c) == -1) {
                findArgs(c, s);
                System.out.println(c);
                System.out.println(temp);
                System.out.println("执行了");
                temp += c;
            } else {
                continue;
            }
        }
    }

    public static void findArgs(char c, String ch) {
        int count = 0;
        int index = 0;
        while (ch.indexOf(c, index) == -1) {
            count++;
            index = ch.indexOf(c, index);
            System.out.println("执行了");
        }
        System.out.println(c + "出现" + count + "次");
    }
}
