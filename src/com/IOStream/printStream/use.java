package com.IOStream.printStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class use {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("C:\\Users\\Tang A Biao\\IdeaProjects\\package1\\src\\com\\IOStream\\printStream\\target.txt");

        System.out.println("原打印目的地");
        ps.println("fjdskl");
        ps.print(12);
        ps.print('e');
        ps.print(true);

//         更改数据的输出目的
        System.setOut(ps);

        System.out.println("更改后的打印目的地");

        ps.close();
    }
}
