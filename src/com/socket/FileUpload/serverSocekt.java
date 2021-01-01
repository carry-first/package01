package com.socket.FileUpload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class serverSocekt {
    public static void main(String[] args) throws IOException {
//        创建服务器套接,并设置端口号
        ServerSocket sst = new ServerSocket(8888);
//        让服务器一直运行
        while(true){
            //     获取链接对象
            Socket socket = sst.accept();
//            开启线程来运行文件上传内容
            new Thread(new Runnable() {
                InputStream is = null;
                BufferedOutputStream bos = null;
                @Override
                public void run() {
                    try{

//        获取客户端传递的输入流
                         is = socket.getInputStream();
//        存储数据和设置有效字节数
                        int len;
                        byte bytes[] = new byte[1024];
//        定义存放数据的路劲
                        File filePath = new File("C:\\Users\\Tang A Biao\\IdeaProjects\\package1\\src\\com\\socket\\FileUpload\\images");
//       判断是否有这个路劲
                        if(!filePath.exists()){
                            filePath.mkdirs();
                            System.out.println("执行了");
                        }
//        定义存储数据流,和保存的文件名
                         bos = new BufferedOutputStream(new FileOutputStream(filePath+"\\"+System.currentTimeMillis()+".png"));
//        读取传递的数据
                        while((len = is.read(bytes))!=-1){
                            bos.write(bytes,0,len);
                        }
//        返回客户端数据
                        OutputStream is1 = socket.getOutputStream();
                        is1.write("数据接收成功".getBytes());
//        关闭流

                        is.close();
                        bos.close();
                    }catch (IOException e){
                        System.out.println(e);
                    }finally {
                        try {
                            is.close();
                            bos.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    }
                }
            }).start();

        }
//        因为一直开启服务器，所以可以不用管理服务器
      //  sst.close();

    }
}
