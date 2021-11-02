package com.IOStream.DataInputStream;

//import org.junit.Test;

import java.io.*;

public class DatainputStream {
    //    @Test
    public void output() throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("D:\\a\\package1\\src\\com\\IOStream\\DataInputStream\\data.txt"));
        dos.writeUTF("赵六");
        dos.writeInt(23);
        dos.writeBoolean(true);
        dos.writeDouble(43.52);

        dos.close();
    }

    //    @Test
    public void input() throws IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream("D:\\a\\package1\\src\\com\\IOStream\\DataInputStream\\data.txt"));
        String s = dis.readUTF();
        int i = dis.readInt();
        boolean b = dis.readBoolean();
        double v = dis.readDouble();
        System.out.println(s);
        System.out.println(i);
        System.out.println(b);
        System.out.println(v);

        dis.close();
    }
}
