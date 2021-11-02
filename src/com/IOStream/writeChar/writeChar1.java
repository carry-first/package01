package com.IOStream.writeChar;

import java.io.FileWriter;
import java.io.IOException;

public class writeChar1 {
    public static void main(String[] args) throws IOException {
//        创建字符写入流
        FileWriter fw = new FileWriter("src\\com\\IOStream\\writeChar\\b.txt", true);
//        创建写入的字符
        char carr[] = {'a', 'c', 'w', 't'};
//        写入字符
        fw.write(carr);
//        将字符写入到文件中
        fw.flush();
//        关闭写入流
        fw.close();
    }
}
