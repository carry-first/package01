package com.review.File;

import org.junit.Test;

import java.io.*;

/**
 * @author Tang A Biao
 * @create 2021/2/22 - 21:43
 */
public class pathSeparator implements Serializable {
    public static void main(String[] args) {

        String pathSeparator = File.pathSeparator;
        System.out.println("分号：" + pathSeparator);
        System.out.println("分隔符：" + File.separator);
        File f1 = new File("D:\\a\\package1\\src\\com\\review\\File\\a.txt");
        System.out.println(f1.getAbsolutePath());
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(f1);
            int read = fileReader.read();
            System.out.println(read);
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        File f2 = new File("src\\uy.txt");
        File f3 = new File("c.txt");
        System.out.println("Junit绝对路径：" + f2.getAbsolutePath());
        System.out.println("Junit绝对路径：" + f3.getAbsolutePath());
    }

    @Test
    public void methodTest() {
        File f1 = new File("src\\uy.txt");
        File f2 = new File("c.txt");
        System.out.println("Junit绝对路径：" + f1.getAbsolutePath());
        System.out.println("Junit绝对路径：" + f2.getAbsolutePath());
    }

    @Test
    public void methodTest02() {
        File f1 = new File("src\\k.txt");

        if (f1.exists()) {
//            如果存在就删除
            f1.delete();
            System.out.println("删除成功");
        } else {
            try {
                f1.createNewFile();
                System.out.println("创建成功");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void methodTest03() {
        File f1 = new File("src\\k.txt");
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(f1, true);
            fos.write("你好".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * @param fileURL   要复制文件的源地址，需要文件名和后缀
     * @param targetURL 要拷贝文件的目标地址，不需要文件名和后缀只要文件存放的目录
     */
    @Test
    public void copyField(File fileURL, File targetURL) {
//        定义目标地址
        File targetDir = new File(targetURL, fileURL.getName());
//        有异常需要定义try包裹
        try (
//                创建文件读取流
                FileInputStream fis = new FileInputStream(fileURL);
//                创建文件输出流
                FileOutputStream fos = new FileOutputStream(targetDir);
        ) {
//            读取到数据的有效位数
            int len;
//            缓冲字节数组
            byte bytes[] = new byte[1024];
//            循环读取文件
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void BufferCopyField(File fileURL, File targetURL) {
//        定义目标地址
        File targetDir = new File(targetURL, fileURL.getName());
//        使用try包裹
        try (
//                创建缓冲输入流
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fileURL));
//                创建缓冲输出流
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(targetDir));
        ) {
//            读取到数据的有效位数
            int len;
//            缓冲字节数组8兆
            byte bytes[] = new byte[8196];
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void readline01() {

    }
}
