package com.IOStream.ObjectOutputStream;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class objOut {
    @Test
    public void output() {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("src\\com\\IOStream\\ObjectOutputStream\\data.txt"));
            oos.writeObject(new Person("张三",32));
            oos.writeObject(new Person("李四",23));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(oos !=null){
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
