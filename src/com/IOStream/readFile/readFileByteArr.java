package com.IOStream.readFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class readFileByteArr {
    public static void main(String[] args) throws IOException {
        //        创建输入流对象
        FileInputStream fis = new FileInputStream(new File("src\\com\\IOStream\\writeFile\\a.txt"));
        byte bytes[] = new byte[1024];
//        存储读取到的有效个数
        int len;
//        读入文件
        while ((len = fis.read(bytes)) != -1) {
//            从0开始读取到有效的字节数
            System.out.print(new String(bytes,0,len));
        }
//      关闭流
        fis.close();
    }
}
