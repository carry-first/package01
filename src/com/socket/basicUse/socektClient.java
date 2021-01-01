package com.socket.basicUse;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class socektClient {
    public static void main(String[] args) throws IOException {
//        创建客户端soket对象
        Socket sk = new Socket("127.0.0.1",8888);
//        获取客户端的输出流
        OutputStream os = sk.getOutputStream();
//        写入发送的数据
        os.write("你好服务器".getBytes());
//        获取服务器放回的信息
//       读取客户端传递的数据
        InputStream is = sk.getInputStream();

//        创建字节数组来接收数据
        byte bytes[] = new byte[1024];
//        读取传递的数据
//        接收到的有效数据
        int len = is.read(bytes);
//        打印数据
        System.out.println(new String(bytes,0,len));
//        关闭流对象
        os.close();
    }
}
