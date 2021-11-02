package com.annotation.testIsException;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class testUse {
    public static void main(String[] args) throws IOException, InvocationTargetException, IllegalAccessException {
//        创建对象
        use col = new use();
//        获取字节码文件
        Class<? extends use> aClass = col.getClass();
//        获取字节码中的方法
        Method[] methods = aClass.getMethods();
//        定义出现错误的次数
        int number = 0;
//        创建文件流，用来写入错误的信息
        BufferedWriter bw = new BufferedWriter(new FileWriter("bug.txt"));

//        循环方法，看是否有错误
        for (Method method : methods) {
//            判断当前方法是否有注解
            if (method.isAnnotationPresent(testData.class)) {
//                尝试运行当前方法
                try {
                    method.invoke(col);
                } catch (Exception e) {
//                    如果该方法运行错误
                    number++;
//                    写入文件信息
                    bw.write(method.getName() + "方法出错了");
                    bw.newLine();
//                    错误的原因
                    bw.write("出错的原因：" + e.getCause().getMessage());
                }
            }
        }
    }
}
