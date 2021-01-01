package com.IOStream.readChar;

import java.io.FileReader;
import java.io.IOException;

public class readTxt {
    public static void main(String[] args) throws IOException {
//        创建字符流
        FileReader fr = new FileReader("src\\com\\IOStream\\writeFile\\a.txt");
//        创建缓冲字符数组
        char chars[] = new char[1024];
//        创建正确读取到的数据
        int len ;
        while((len = fr.read(chars))!=-1){
//            将读取到的数据转换成字符串
            System.out.println(new String(chars));
            System.out.println(len);
        }

//        关闭流
        fr.close();
    }
}
