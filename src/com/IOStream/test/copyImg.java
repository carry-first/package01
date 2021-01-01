package com.IOStream.test;

import org.junit.Test;

import java.io.*;

public class copyImg {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\Tang A Biao\\OneDrive\\图片\\dlam.jpg");
        File targetPath = new File("D:\\a\\package1\\src\\com\\IOStream\\test\\dlamCopyEncrytption.jpg");
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(new FileInputStream(f));
            bos = new BufferedOutputStream(new FileOutputStream(targetPath));

            int len;
            byte []str = new byte[1024];

            while ((len = bis.read(str))!=-1){
//                加密图片（异或）
                for(int i=0;i<len;i++){
                    str[i] = (byte) (str[i] ^ 5);
                }

                bos.write(str,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(bis!=null) {
                    bis.close();
                }
                if(bos!=null)
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Test
    public void loadEncrytpion(){
        File f = new File("D:\\a\\package1\\src\\com\\IOStream\\test\\dlamCopyEncrytption.jpg");
        File targetPath = new File("D:\\a\\package1\\src\\com\\IOStream\\test\\loadEncrytpion.jpg");
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(new FileInputStream(f));
            bos = new BufferedOutputStream(new FileOutputStream(targetPath));
            int len;
            byte []str = new byte[1024];

            while ((len = bis.read(str))!=-1){
//                加密图片（异或）
                for(int i=0;i<len;i++){
                    str[i] = (byte) (str[i] ^ 5);
                }

                bos.write(str,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(bis!=null) {
                    bis.close();
                }
                if(bos!=null)
                    bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
