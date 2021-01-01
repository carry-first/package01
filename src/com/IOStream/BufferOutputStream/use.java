package com.IOStream.BufferOutputStream;

import java.io.*;

public class use {
    public static void main(String[] args) throws IOException {
//        show01();
        show02();
    }

    private static void show02() throws IOException{
//        创建文件写入流
        FileInputStream fi = new FileInputStream("src\\com\\IOStream\\BufferOutputStream\\c.txt");
//        创建文件写入缓冲流
        BufferedInputStream bis = new BufferedInputStream(fi);
//        获取读取文件的有效个数
        int len ;
//        读取字节数组
        byte bytes [] = new byte[1024];
//        读取文件
        while ((len = bis.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
//        关闭流
        bis.close();
    }

    private static void show01() throws IOException {
//        创建文件写入流
        FileOutputStream fw = new FileOutputStream("src\\com\\IOStream\\BufferOutputStream\\c.txt");
//        创建文件写入缓冲流
        BufferedOutputStream bos = new BufferedOutputStream(fw);
//        写入内容
        bos.write("写入数据到文件中".getBytes());
//       刷新文件
        bos.flush();
//        关闭流
        bos.close();
    }
}
