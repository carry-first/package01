package com.task;

import org.jsoup.select.Evaluator;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentSkipListMap;

/**
 * @author Tang A Biao
 * @create 2021/6/26 - 13:10
 */
public class simpleDateformart {
    public static void main(String[] args) throws IOException {
        String format = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        System.out.println(format);
        File f1 = new File("/");
        System.out.println("/" + f1.getPath());
        System.out.println("ab" + f1.getAbsolutePath());
        System.out.println("can" + f1.getCanonicalPath());
        System.out.println(new File("k.txt").getAbsolutePath());
        TreeMap map = new TreeMap();
        try {
            ex();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try (
                FileInputStream inputStream = new FileInputStream(new File("src/com/task/k.txt"));
        ) {

            int k;
            byte[] bytes = new byte[1024];
            while ((k = inputStream.read(bytes)) != -1) {
                System.out.println(new String(bytes, 0, k));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void ex() throws Exception {
        throw new Exception("调用异常");
    }
}
