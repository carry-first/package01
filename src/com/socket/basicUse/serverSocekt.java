package com.socket.basicUse;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class serverSocekt {
    public static void main(String[] args) throws IOException {
//        创建服务器
        ServerSocket server = new ServerSocket(8888);
//        获取输入流
        Socket accept = server.accept();
//       读取客户端传递的数据
        InputStream is = accept.getInputStream();

//        创建字节数组来接收数据
        byte bytes[] = new byte[1024];
//        读取传递的数据
//        接收到的有效数据
        int len = is.read(bytes);
//        打印数据
        System.out.println(new String(bytes, 0, len));
//        返回给客户端数据,获取数据流
        OutputStream os = accept.getOutputStream();
//        返回内容
        os.write("接收到了信息，谢谢".getBytes());
//        关闭数据流
        server.close();
        accept.close();
    }
}
