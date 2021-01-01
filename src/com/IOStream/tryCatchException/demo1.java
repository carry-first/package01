package com.IOStream.tryCatchException;

import java.io.*;

public class demo1 {
    public static void main(String[] args) {
//        把定义流的位置放到try里面，流的作用域就是try中的内容，try执行完后会自动释放流
        try(
//        文件读入流
                FileInputStream fis = new FileInputStream("C:\\Users\\Tang A Biao\\OneDrive\\图片\\images\\赵丽颖.png");
//        文件写入流
                FileOutputStream fos = new FileOutputStream("src\\com\\IOStream\\readFile\\"+"copy"+"赵丽颖.png",true);
                ){
//        缓冲字节数组
            byte bytes[] = new byte[1024];
//        读取的有效个数
            int len;
//        读取和写入文件
            while ((len = fis.read(bytes)) != -1){
//            文件写入0~len读取到的有效个数
                fos.write(bytes,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
