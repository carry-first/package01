package com.IOStream.BufferOutputStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class readLine {
    public static void main(String[] args) throws IOException{
        show01();
    }

    private static void show01() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Tang A Biao\\IdeaProjects\\package1\\src\\com\\IOStream\\BufferOutputStream\\c.txt"));

        System.out.println(br.readLine());

        br.close();
    }
}
