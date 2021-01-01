package com.Server_cilent;

import org.junit.Test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class copyIMG {
    @Test
    public void Client(){
        InputStream is =null;
        OutputStream outputStream = null;
        Socket sk =null;
        try {
            File f = new File("src\\com\\Server_cilent\\images");
            sk = new Socket("127.0.0.1",8888);
             is = new FileInputStream(new File(f,"dlam.jpg"));
             outputStream = sk.getOutputStream();
            byte[] byteArr = new byte[1024];
            int len;
            while((len = is.read(byteArr))!= -1){
                outputStream.write(byteArr,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(is !=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(outputStream !=null){
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(sk !=null){
                try {
                    sk.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
//

    }

    @Test
    public void Server() throws IOException {
        ServerSocket ss = ss = new ServerSocket(8888);
        InputStream inputStream =null;
        BufferedOutputStream bos = null;
        OutputStream os = null;
        Socket accept = null;
        try {
            accept = ss.accept();
            inputStream = accept.getInputStream();
            os = accept.getOutputStream();
            bos = new BufferedOutputStream(new FileOutputStream("src\\com\\Server_cilent\\images\\copyImg01.jpg"));
            byte [] byteArr = new byte[1024];
            int len = 0;
            while ( (len = inputStream.read(byteArr))!=-1){
                bos.write(byteArr,0,len);
            }
            os.write("图片接收完成".getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(inputStream != null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(bos != null){
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(os != null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
