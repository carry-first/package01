package com.IO.getPath;

import java.io.File;

public class demo1 {
    public static void main(String[] args) {
        File f1 = new File("D:\\test\\test.txt");
        File f2 = new File("a.txt");

        System.out.println(f1.getPath());
        System.out.println(f2.getPath());

        System.out.println(f1.getName());
        System.out.println(f2.getName());

        System.out.println(f2.getAbsolutePath());

        System.out.println(f2.length());
//        文件夹和不存在的文件的大小为0
        System.out.println("不存在" + new File("D:\\fdas").length());
    }
}
