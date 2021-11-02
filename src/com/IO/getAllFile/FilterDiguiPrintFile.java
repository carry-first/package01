package com.IO.getAllFile;

import java.io.File;

public class FilterDiguiPrintFile {
    public static void main(String[] args) {
        printFile(new File("D:\\test"));
    }

    private static void printFile(File dir) {
        System.out.println(dir + "文件夹");
        System.out.println();
//        获取文件集合
        File[] list = dir.listFiles();
//        循环遍历所有文件
        for (File s : list) {
            if (s.isDirectory()) {
//            如果他是文件夹
                printFile(s);
            } else {
//                判断是否是。java结尾的
                if (s.toString().toLowerCase().endsWith(".txt")) System.out.println(s);
            }
        }

    }
}
