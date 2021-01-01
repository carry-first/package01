package com.socket.basicUse;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class use {
    public static void main(String[] args) throws IOException {
//        创建客户端soket对象
        Socket sk = new Socket();
//        获取客户端的输出流
        OutputStream os = sk.getOutputStream();
//        写入发送的数据
        os.write("弄好".getBytes());
//        关闭流对象
        os.close();
    }
}
