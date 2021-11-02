package com.IOStream.BufferOutputStream;

import java.io.*;
import java.util.HashMap;

public class sortFile {
    public static void main(String[] args) throws IOException {
        sort();
    }

    private static void sort() throws IOException {
//        创建字符缓冲流
        BufferedReader br = new BufferedReader(new FileReader("D:\\baidudiskDownload\\02-Java语言进阶\\day10_缓冲流、转换流、序列化流、Files\\code\\10_IO\\in.txt"));
//        创建字符写入缓冲流
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Tang A Biao\\IdeaProjects\\package1\\src\\com\\IOStream\\BufferOutputStream\\copyIn.txt"));
//   创建hashmap集合
        HashMap<String, String> map = new HashMap<>();
        String line;
//        读取文件
        while ((line = br.readLine()) != null) {
//            字符串分割,以。分割，。是转义字符
            String[] split = line.split("\\.");
//            将内容添加到集合中
            map.put(split[0], split[1]);
        }
//         遍历集合
        for (String s : map.keySet()) {
//            将取出的内容写入到文件中
//            获取value
            String value = map.get(s);
//            写入到指定的文件中
            bw.write(s + "." + value);
//            换行
            bw.newLine();
        }
//        关闭流
        br.close();
        bw.close();
    }
}
