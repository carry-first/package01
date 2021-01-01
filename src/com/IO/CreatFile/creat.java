package com.IO.CreatFile;

import java.io.File;
import java.io.IOException;

public class creat {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:\\test\\creat1.txt");
//       是否创建成功
        Boolean b1 = f1.createNewFile();
        System.out.println(b1);

//        创建文件夹
        File f2 = new File("ccc\\ddd\\fff");
        boolean b2 = f2.mkdirs();
        System.out.println(b2);

//        删除文件或文件夹
        File f3 = new File("ccc\\ddd\\fff");
        Boolean b3 = f3.delete();
        System.out.println(b3);
    }
}
