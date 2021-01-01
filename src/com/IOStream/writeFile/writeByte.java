package com.IOStream.writeFile;

import java.io.FileOutputStream;
import java.io.IOException;

public class writeByte {
    public static void main(String[] args) throws IOException {
//        创建输出流对象,并设置写入文件类型为追加
        FileOutputStream fos = new FileOutputStream("src\\com\\IOStream\\writeFile\\a.txt",true);
//        创建字节数组
        byte bytes[] = {-28,-67,-96,-27,-91,-67};
        for (int i = 0; i < 5; i++) {
//        写入文件
            fos.write(bytes);
//            写如换行
            fos.write("\n".getBytes());
        }
//        关闭流
        fos.close();
    }
}
