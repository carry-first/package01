package com.socket.FileAccess;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class serverSocekt {
    public static void main(String[] args) throws IOException {
        ServerSocket sst = new ServerSocket(8080);
//        使用循环开启服务器
        while(true){
            Socket socket = sst.accept();
//            使用线程来开启运算
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try{
//        客户端输入输出流
                        InputStream sis = socket.getInputStream();
                        OutputStream sos = socket.getOutputStream();
                        byte bytes [] = new byte[1024];
                        int len ;
//        while((len = is.read(bytes))!=-1){
//            System.out.println(new String(bytes,0,len));
//        }

//        创建BufferedOUtput读取一行文本
                        BufferedReader br = new BufferedReader(new InputStreamReader(sis));
//        读取一行
                        String line = br.readLine();
//        截取读取的访问地址
                        String accesePath = line.split(" ")[1].substring(1);
                        System.out.println(accesePath);
//        写入头部信息
                        sos.write("HTTP/1.1 200 OK \r\n".getBytes());
//                        判断访问的后缀
                        if(accesePath.endsWith(".css")){
                            sos.write("Content-type:css/css\r\n".getBytes());
                        }else if(accesePath.endsWith((".js"))){
                            sos.write("Content-type:text/javaScript\r\n".getBytes());
                        }else{
                            sos.write("Content-type:text/html\r\n".getBytes());
                        }
                        sos.write("\b".getBytes());
//        服务器本地的输入流
                        FileInputStream fis = new FileInputStream(accesePath);
//        写入返回的主体信息
                        while((len = fis.read(bytes))!=-1){
                            sos.write(bytes,0,len);
                        }
//        关闭流
                        fis.close();
                        br.close();
                    }catch (IOException e){
                        System.out.println(e);
                    }
                }
            }).start();
        }
//        服务器关闭流
//        sst.close();
    }
}
