package com.IOStream.serialize;

import java.io.*;

public class use {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        show01();
        show02();
    }
//读数据
    private static void show02() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Tang A Biao\\IdeaProjects\\package1\\src\\com\\IOStream\\serialize\\obj.txt"));

//        读取数据
        Object obj ;
        Object o =  ois.readObject();
        System.out.println(o);
        o =  ois.readObject();
        System.out.println(o);
/*        while((obj = ois.readObject())!=null){
            System.out.println(obj);
        }*/

        ois.close();
    }

    //    写数据
    private static void show01() throws IOException{
//        创建序列化流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Tang A Biao\\IdeaProjects\\package1\\src\\com\\IOStream\\serialize\\obj.txt"));

        oos.writeObject(new Person("赵丽颖",18));
        oos.writeObject(new Person("迪丽热巴",20));

        oos.close();
    }
}
