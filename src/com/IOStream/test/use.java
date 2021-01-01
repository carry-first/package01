package com.IOStream.test;


import java.io.*;

public class use {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        定义数据存储到流中
        Person01 p1 = new Person01("迪丽热巴",12);
        Person01 p2 = new Person01("赵丽颖",18);
        Person01 p3 = new Person01("古力娜扎",20);
//        定义输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src\\com\\IOStream\\test\\a.txt"));
//        写入数据
        oos.writeObject(p1+"\n");
        oos.writeObject(p2+"\n");
        oos.writeObject(p3+"\n");
//        创建文件输入流，用来检测流中的数据是否还有内容
        FileInputStream fis = new FileInputStream("src\\com\\IOStream\\test\\a.txt");
//        反序列化流
        ObjectInputStream ois = new ObjectInputStream(fis);
//        只要文件流中还有内容，就会一直读取文件流中的数据
        while(fis.available() > 0){
            System.out.println(fis.available());
            Object o = ois.readObject();

            System.out.print(o);
        }


//      关闭流
        fis.close();
        oos.close();
        ois.close();
    }
}
