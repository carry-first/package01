package com.IO.getAllFile;

import java.io.File;

public class getAllFile {
    public static void main(String[] args) {
        File f1 = new File("D:\\test");
        String[] list = f1.list();
//        输出该目录的所有文件名
        for (String s : list) {
            System.out.println(s);
        }
//        遍历文件返回的是封装好的文件
        File[] files = f1.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }
}
