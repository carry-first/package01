package com.IO.isExits;

import java.io.File;

public class demo1 {
    public static void main(String[] args) {
        File f1 = new File("D:\\test\\test.txt");
        File f2 = new File("D:\\test");
//        判断文件或文件夹是否存在
        if(f1.exists()){
            if(f1.isDirectory()) System.out.println("该路径是一个文件夹");
            else System.out.println("该路劲是一个文件");
        }
    }
}
