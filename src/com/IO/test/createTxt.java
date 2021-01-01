package com.IO.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class createTxt {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("helo.txt");
        boolean directory = f.isDirectory();
        System.out.println(directory);
//        FileInputStream fis = new FileInputStream("hello.txt");
        System.out.println(f.getPath());
        System.out.println(f.getAbsolutePath());
    }


}
