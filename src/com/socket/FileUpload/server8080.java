package com.socket.FileUpload;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server8080 {
    public static void main(String[] args) throws IOException {
        ServerSocket sst = new ServerSocket(8080);
        Socket socket = sst.accept();
        InputStream is = socket.getInputStream();
        byte bytes[] = new byte[1024];
        int len;
        while ((len = is.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }
    }
}
