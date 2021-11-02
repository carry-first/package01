package com.IOStream.serialize;

import java.io.*;
import java.util.LinkedList;

public class ArrayListSerialize02 {
    public static void main(String[] args) {

    }

    private static void saveArraylist() throws IOException, ClassNotFoundException {
//        创建输出反序列流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Tang A Biao\\IdeaProjects\\package1\\src\\com\\IOStream\\serialize\\ObjArr.txt"));
//        创建读取反序列流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Tang A Biao\\IdeaProjects\\package1\\src\\com\\IOStream\\serialize\\obj.txt"));
//        创建集合
        LinkedList<Person> list = new LinkedList<>();
//        创建对象
        list.add(new Person("赵丽颖", 18));
        list.add(new Person("迪丽热巴", 20));
        list.add(new Person("古力娜扎", 21));
        list.add(new Person("马儿扎哈", 10));
    }
}
