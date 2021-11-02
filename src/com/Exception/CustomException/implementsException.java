package com.Exception.CustomException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class implementsException {
    //    定义集合
    static Collection<String> cl = new ArrayList();

    public static void main(String[] args) {
        cl.add("张三");
        cl.add("李四");
        cl.add("王五");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要添加的名字");
        String s = sc.next();
//        如果编译出错的话，触发catch自定义的错误类型
        try {
            isExis(s);
        } catch (CustomException e) {
            System.out.println(e);
        }
//        打印所有元素
        System.out.println(cl);
    }

    public static void isExis(String s) throws CustomException {
        if (cl.contains(s)) {
            throw new CustomException("用户名已存在");
        } else {
//            如果没有该元素就添加元素
            cl.add(s);
            System.out.println(s + "：添加成功");
        }
    }
}
