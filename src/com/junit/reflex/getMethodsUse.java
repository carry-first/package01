package com.junit.reflex;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class getMethodsUse {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        定义类
        Class ps = Person.class;
//        获取构造方法
        Constructor ct = ps.getConstructor(String.class, int.class);
//        创建内容
        Object person = ct.newInstance("赵丽颖",12);
        Person person1 = (Person) ct.newInstance("赵丽颖",12);
        System.out.println(person);
        System.out.println(person1);
    }
}
