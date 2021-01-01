package com.junit.reflex;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class reflexApply {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
//        定义属性对象
        Properties pt = new Properties();
        //        获取当前文件中的类加载器,这个类加载器可以访问该src里面的内容
        ClassLoader classLoader = reflexApply.class.getClassLoader();
        //        通过类加载器，获取资源流
        InputStream resourceAsStream = classLoader.getResourceAsStream("pro.properties");
        //        通过属性集合来加载properties里面的文件，里面的内容以“=”或空格分割
        pt.load(resourceAsStream);
        //        获取自定义的方法和名称
        String className = pt.getProperty("className");
        String methodName = pt.getProperty("methodName");
        //        通过反射来执行我们传递的内容
        //        加载类进内存
        Class<?> aClass = Class.forName(className);
        //        创建对象
        Object o = aClass.newInstance();
        //        让获取到的这个对象创建一个方法
        Method method = aClass.getMethod(methodName);
        //        执行该方法
        method.invoke(o);

    }
}
