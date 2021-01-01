package com.junit.reflex;

import java.lang.reflect.Field;

public class getMethodsName {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
//        定义类
        Class<Person> ps = Person.class;
//        获取所有public修饰的成员变量
            Field[] fls = ps.getFields();
    //        循环输出

    //        for (Field fl : fls) {
    //            System.out.println(fl);
    //        }
    //        获取单个成员变量
        Field f = ps.getDeclaredField("name");
//        拷贝成员变量age的值
                    Person p  = new Person();
            //        忽略安全问题,暴力反射
                    f.setAccessible(true);
//        设置p的Pname值为张无忌
        f.set(p,"张无忌");
//        获取p的值
        Object value = f.get(p);
                    System.out.println(value);
                    System.out.println(p);
    }
}
