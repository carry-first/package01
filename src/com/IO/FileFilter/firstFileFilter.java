package com.IO.FileFilter;

import java.io.File;
import java.io.FileFilter;

public class firstFileFilter {
    public static void main(String[] args) {
        File f1 = new File("D:\\test");
        printFile(f1);
    }

    public static void printFile(File dir) {

        System.out.println(dir + "文件夹");
        System.out.println();
//        获取文件集合
//        并使用过滤器过滤需要的文件
        File[] list = dir.listFiles(new FilterImpl());
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

class FilterImpl implements FileFilter {

    @Override
    public boolean accept(File pathname) {
//        如果当前循环的是文件夹，则让它返回true
        if (pathname.isDirectory()) return true;
//        如果是以。txt文件结尾的则返回true（该条文件）
        if (pathname.toString().toLowerCase().endsWith(".txt")) {
            return true;
        }

        return false;
    }
}