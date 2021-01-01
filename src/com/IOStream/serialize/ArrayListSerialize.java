package com.IOStream.serialize;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayListSerialize {
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        saveArraylist();
    }

    private static void saveArraylist() throws IOException,ClassNotFoundException {
//        创建集合
        LinkedList<Person> list = new LinkedList<>();
//        创建对象
        list.add(new Person("赵丽颖",18));
        list.add(new Person("迪丽热巴",20));
        list.add(new Person("古力娜扎",21));
        list.add(new Person("马儿扎哈",10));
        try(
                //        创建输出反序列流
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src\\com\\IOStream\\serialize\\ObjArr1.txt"));
        ){
//            将list转化成数组
            Person [] ps = list.toArray(Person[]::new);
//        写入反序列数据
            oos.writeObject(ps);
        }catch(Exception e){
            e.printStackTrace();
        }
        try(
            //        创建读取反序列流
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\com\\IOStream\\serialize\\ObjArr1.txt"));
        ){
//        读取反序列数据
            Person [] ps =(Person []) ois.readObject();
            List<Person> ps1 = Arrays.asList(ps);
            System.out.println(ps1);

        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
