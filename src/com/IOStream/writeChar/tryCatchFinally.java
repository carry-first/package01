package com.IOStream.writeChar;

import java.io.FileWriter;
import java.io.IOException;

public class tryCatchFinally {
    public static void main(String[] args) {
        FileWriter fw = null;
        //        创建字符写入流
        try {
            fw = new FileWriter("src\\com\\IOStream\\writeChar\\b.txt", true);
            //        创建写入的字符
            char carr[] = {'a', 'c', 'w', 't'};
//        写入字符
            fw.write(carr);
//        将字符写入到文件中
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
//            如果流不等于空
            if (fw != null) {
//        关闭写入流
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
