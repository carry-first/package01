package com.IOStream.OutStreamWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class write {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("C:\\Users\\Tang A Biao\\IdeaProjects\\package1\\src\\com\\IOStream\\OutStreamWriter\\d.txt"),"GBK");

        osw.write("你好");

        osw.close();
    }
}
