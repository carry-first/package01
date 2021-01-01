package com.Exception.thorw;

import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class throwsException {
    public static void main(String[] args){
        try {
            readFile("C:\\a.bat");
        }catch (IOException e){
//            打印错误信息
            System.out.println(e.getMessage());
//            打印错误的异常
            System.out.println(e);
//            打印所有的错误信息
            e.printStackTrace();
        }catch(IndexOutOfBoundsException e){
            System.out.println("数组下标越界异常");
        }
        finally{
            System.out.println("finally代码块");
        }
        System.out.println("后续代码");
    }

    private static void readFile(String path) throws IOException,FileNotFoundException{
        if(path!="C:\\a.bat"){
//           如果文件没有找到
            throw new FileNotFoundException("文件没有找到");
        }
//        如果文件后缀名不对
        if(!path.endsWith(".txt")){
            throw new IOException("文件后缀错误");
        }
    }
}
