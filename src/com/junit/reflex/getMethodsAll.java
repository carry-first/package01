package com.junit.reflex;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class getMethodsAll {
    public static void main(String[] args) throws Exception {
        //        定义类
        Class ps = Person.class;
//        获取Person类中的方法
        Method[] methods = ps.getMethods();
//        打印Person类中的所有方法
/*        for (Method method : methods) {
            System.out.println(method);
        }*/
//        创建Person对象
        Person p = new Person();
//        通过反射获取方法
        Method getAge = ps.getMethod("getAge");
//        使用反射中定义的方法执行该方法
        Object value = getAge.invoke(p);
        System.out.println(value);
        System.out.println(getAge.getName());
        System.out.println(ps.getName());

    }
}
