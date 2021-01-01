package com.IOStream.serialize;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class UID {
    public static void main(String[] args) throws IOException,ClassNotFoundException{
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
}
