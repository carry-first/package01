package com.junit.reflex;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class reflexAnnocation {
    @Test
    public void test01() throws IllegalAccessException, InstantiationException {
        Class<Person> personClass = Person.class;
        Annotation[] annotations = personClass.getAnnotations();
//        类的注解
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
//        方法的注解
        System.out.println("方法的注解");
        Method[] methods = personClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.print(method.getName()+"\t");
            Annotation[] annotations1 = method.getAnnotations();
            for (Annotation annotation : annotations1) {
                System.out.print(annotation+"\t");
            }
            System.out.print("权限修饰符："+Modifier.toString(method.getModifiers())+"\t");
            System.out.println(method.getReturnType());
            Class<?>[] parameterTypes = method.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.print(parameterType+"\t");
            }
        }
    }
}
