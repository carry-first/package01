package com.IOStream.writeFile;

import java.io.FileOutputStream;
import java.io.IOException;

public class write {
    public static void main(String[] args) throws IOException {
//        创建输出流对象
        FileOutputStream fos = new FileOutputStream("src\\com\\IOStream\\writeFile\\a.txt");
//        写入文件
        fos.write(42);
//        关闭流
        fos.close();
    }
}
