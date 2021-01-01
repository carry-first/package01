package com.IOStream.properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;

public class use {
    public static void main(String[] args) throws IOException {
//        show01();
//        show02();
        show03();
    }

//    读取文件
    private static void show03() throws IOException {
        Properties prop = new Properties();
//        读取文件
        prop.load(new FileReader("src\\com\\IOStream\\properties\\a.txt"));
//        循环输出读取到的内容
        Set<String> strings = prop.stringPropertyNames();
//        获取所有key值
        for (String key : strings) {
//            循环打印读取到的内容
            System.out.println(key+"="+prop.getProperty(key));
        }
    }

    //    写入数据
    private static void show02() throws IOException {
//        创建properties集合
        Properties prop = new Properties();
//        添加数据
        prop.setProperty("赵丽颖","168");
        prop.setProperty("迪丽热巴","165");
        prop.setProperty("马儿扎哈","169");
//        创建写入文件流
        FileWriter fw = new FileWriter("src\\com\\IOStream\\properties\\a.txt");
//        将数据写入到文件中
        prop.store(fw,"sava Data");
//        关闭流
        fw.close();
    }

//    基本使用
    private static void show01() {
//        创建properties集合
        Properties prop = new Properties();
//        添加数据
        prop.setProperty("赵丽颖","168");
        prop.setProperty("迪丽热巴","165");
        prop.setProperty("马儿扎哈","169");
//        获取所有键
        Set<String> strings = prop.stringPropertyNames();
//        循环遍历并输出获取到的值
        for (String value : strings) {
            System.out.println(value+"="+prop.getProperty(value));
        }
    }
}
