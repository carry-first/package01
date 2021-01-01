package com.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@pro(className = "com.annotation.Student",methodName = "dance")
public class implFrame {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class<implFrame> implFrameClass = implFrame.class;
//        生成注解接口的子类实现对象
        pro annotation = implFrameClass.getAnnotation(pro.class);
//        调用注解接口的方法返回注解传递的内容
        String className = annotation.className();
        String methodName = annotation.methodName();
//        反射加载内容
        Class<?> aClass = Class.forName(className);
//        创建对象
        Object o = aClass.newInstance();
//        获取方法
        Method method = aClass.getMethod(methodName);
//        抵用方法
        method.invoke(o);
    }
}
