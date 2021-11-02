package com.IO.FileStaticMethod;

import java.io.File;

public class demo1 {
    public static void main(String[] args) {
//        路劲分割符
        String ps = File.pathSeparator;
        System.out.println(ps);
//      文件分割符
        System.out.println(File.separator);

        File f1 = new File("D:\\test");

        File f2 = new File(f1, "test.txt");

        File f3 = new File("D:\\test", "test.txt");

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
    }
}
