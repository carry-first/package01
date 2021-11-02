package com.Server_cilent;

import org.junit.Test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDP {
    @Test
//    发送端
    public void sender() throws IOException {
//        定义脚手架
        DatagramSocket ds = new DatagramSocket();
//        将字符串转化为字节数组
        byte[] bytes = "你好，我是发送端".getBytes();
        java.net.InetAddress is = java.net.InetAddress.getLocalHost();
//        将数据写入dp中，并定义接收方
        DatagramPacket dp = new DatagramPacket(bytes, 0, bytes.length, is, 9999);
//          发送数据
        ds.send(dp);
//          关闭流
        ds.close();
    }

    @Test
//    接收端
    public void receiver() throws IOException {
//        定义UDP的接收端口
        DatagramSocket ds = new DatagramSocket(9999);
//        定义存放数据的字节数组
        byte[] bytes = new byte[1024];
//         定义接收的长度和字节数组
        DatagramPacket dp = new DatagramPacket(bytes, 0, bytes.length);
//      定义该接口为接受端，接收数据，数据都封装在dp中
        ds.receive(dp);
//        获取dp中的数据，取0~字节数组最终接收到的长度
        System.out.println(new String(dp.getData(), 0, bytes.length));

    }
}
