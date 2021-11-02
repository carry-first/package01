package com.IO.getAllFile;

import java.io.File;
import java.nio.file.Files;
import java.util.Arrays;

public class Field {

    public static void main(String[] args) {
        File f = new File("D:\\a\\111111");
        //region Description
        printFile(f);
        //endregion
        printArr();
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("java.home"));
        System.out.println(System.getProperty("os.version"));
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("user.home"));
    }

    public static void printFile(File f) {
        System.out.println(f.getName() + "文件夹");
        File[] list = f.listFiles();
        for (File s : list) {
            if (s.isDirectory()) {
                printFile(s);
            } else {
                System.out.println(s.getName());
            }
        }
    }

    public static void printArr() {
        System.out.println(Arrays.toString(new int[]{1, 3, 4, 5, 25, 83, 5, 88, 91}).replaceAll("[,]|[]],[]]", ""));
        Object o;
        System.out.println(o = true ? new Integer(1) : new Double(2.0));
    }
}
