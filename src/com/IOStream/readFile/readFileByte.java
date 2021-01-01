package com.IOStream.readFile;

import java.io.*;
import java.util.Arrays;

public class readFileByte {
    public static void main(String[] args) throws IOException {
        //        创建输入流对象
        FileInputStream fis = new FileInputStream(new File("src\\com\\IOStream\\writeFile\\a.txt"));
        int byteNum ;
//        读入文件
        while((byteNum = fis.read())!=-1){
            System.out.print(byteNum+"\t");
        }
//        换行的字节码
        byte  b[] = {(byte) 165, (byte) 189};
//      关闭流
        fis.close();
    }
}
