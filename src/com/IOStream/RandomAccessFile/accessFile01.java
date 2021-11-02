package com.IOStream.RandomAccessFile;

//import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class accessFile01 {
    //    @Test
    public void readImg() {
        RandomAccessFile raf = null;
        try {
            raf = new RandomAccessFile(new File("src\\com\\IOStream\\RandomAccessFile\\data.txt"), "rw");

            raf.write("fewjioahf".getBytes());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (raf != null) {
                try {
                    raf.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    //    @Test
    public void coverFile() {
        RandomAccessFile raf = null;
        try {
            raf = new RandomAccessFile(new File("src\\com\\IOStream\\RandomAccessFile\\data.txt"), "rw");
//          修改指针指向，从第二个字符开始
            raf.seek(2);
            raf.write("kkk".getBytes());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (raf != null) {
                try {
                    raf.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
