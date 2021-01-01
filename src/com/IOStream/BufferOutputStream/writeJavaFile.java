package com.IOStream.BufferOutputStream;

import java.io.*;

public class writeJavaFile {
    public static void main(String[] args) throws IOException{
        show01();
        System.out.println("content");
    }

    private static void show01() throws IOException {
//        创建写入流
        BufferedWriter bos = new BufferedWriter(new FileWriter("src\\com\\IOStream\\BufferOutputStream\\prin.java"));
//         写入数据
        String s = "public class prin{" +
                "public static void main(String[] args){" +
                "System.out.println(\"content\");}" +
                "}";
//        写入文件内容
        bos.write(s);
//        关闭流
        bos.close();
    }
}
