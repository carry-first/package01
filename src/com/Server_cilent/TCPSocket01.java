package com.Server_cilent;


import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.InetAddress;

public class TCPSocket01 {
    @Test
    public void client() throws IOException {
        InetAddress ia = InetAddress.getLocalHost();
        OutputStream outputStream = null;
        Socket sc = null;
        try {
            sc = new Socket(ia, 9999);
            outputStream = sc.getOutputStream();

            outputStream.write("你好服务器，我是客户端01".getBytes());
//            关闭输出流
            sc.shutdownOutput();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (outputStream != null) {
                outputStream.close();
            }
            if (sc != null) {
                sc.close();
            }
        }
    }

    @Test
    public void Server() {
        ServerSocket ss = null;
        ByteArrayOutputStream baos = null;
        InputStream inputStream = null;
        try {
            ss = new ServerSocket(9999);
            while (true) {
                Socket accept = ss.accept();
                inputStream = accept.getInputStream();
                baos = new ByteArrayOutputStream();
                byte[] by = new byte[5];
                int len = 0;
                while ((len = inputStream.read(by)) != -1) {
                    baos.write(by, 0, len);
                }
                System.out.println(baos.toString());
                System.out.println("来自" + ss.getInetAddress().getHostAddress() + "的连接");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (baos != null) {
                try {
                    baos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
