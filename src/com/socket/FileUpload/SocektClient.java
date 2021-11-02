package com.socket.FileUpload;

import java.io.*;
import java.net.Socket;

public class SocektClient {
    public static void main(String[] args) throws IOException {
//        创建文件读取流
        FileInputStream fis = new FileInputStream("D:\\baidudiskDownload\\壁纸\\wallpaper_02.png");
//        创建socekt客户端插座
        Socket socket = new Socket("127.0.0.1", 8888);
//        获取网络参数中的写入流
        OutputStream os = socket.getOutputStream();
//        保存读取到的有效数据
        int len;
//        保存读取到的字节
        byte bytes[] = new byte[1024];
        while ((len = fis.read(bytes)) != -1) {
//            写入数据
            os.write(bytes, 0, len);
        }
//        设置套接字的关闭，结束标记符
        socket.shutdownOutput();
//        获取返回的数据
        InputStream is = socket.getInputStream();
//        读取数据
        while ((len = is.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }

//        关闭流
        fis.close();
        socket.close();

    }
}
