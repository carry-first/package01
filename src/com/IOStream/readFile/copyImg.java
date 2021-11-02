package com.IOStream.readFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class copyImg {
    public static void main(String[] args) throws IOException {
//        文件写入目标
        File target = new File("C:\\Users\\Tang A Biao\\OneDrive\\图片\\images\\赵丽颖.png");
//        文件读入流
        FileInputStream fis = new FileInputStream(target);
//        文件写入流
        FileOutputStream fos = new FileOutputStream("src\\com\\IOStream\\readFile\\" + "copy" + target.getName(), true);
//        缓冲字节数组
        byte bytes[] = new byte[1024];
//        读取的有效个数
        int len;
//        读取和写入文件
        while ((len = fis.read(bytes)) != -1) {
//            文件写入0~len读取到的有效个数
            fos.write(bytes, 0, len);
        }
//        关闭流
        fos.close();
        fis.close();
    }
}
