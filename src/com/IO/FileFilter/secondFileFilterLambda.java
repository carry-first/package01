package com.IO.FileFilter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class secondFileFilterLambda {
    public static void main(String[] args) {
        File f1 = new File("D:\\test");
        printFile(f1);
    }

    public static void printFile(File dir) {

        System.out.println(dir + "文件夹");
        System.out.println();
//        获取文件集合
//        并使用过滤器过滤需要的文件
        File[] list = dir.listFiles(
//                箭头函数创建第二种过滤方式
                (d, FileName) -> new File(d + FileName).isDirectory() ||
                        FileName.toString().toLowerCase().endsWith(".txt")

        );
//        循环遍历所有文件
        for (File s : list) {
            if (s.isDirectory()) {
//            如果他是文件夹
                printFile(s);
            } else {
//                判断是否是。java结尾的
//                if(s.toString().toLowerCase().endsWith(".txt")) System.out.println(s);
//                输出循环的文件
                System.out.println(s);
            }
        }
    }
}
