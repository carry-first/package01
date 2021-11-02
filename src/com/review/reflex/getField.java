package com.review.reflex;

import com.junit.reflex.MyAnnocation;
import org.junit.Test;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author Tang A Biao
 * @create 2021/2/23 - 17:28
 */
public class getField implements Serializable {
    public static void main(String[] args) {
        Class<Person> personClass = Person.class;
        try {
            Field name = personClass.getDeclaredField("name");
            name.setAccessible(true);
            Person person = personClass.newInstance();
            name.set(person, "张三");
            System.out.println(person);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void method01() {
        try {
            Method method02 = this.getClass().getDeclaredMethod("method02");
            Package aPackage = getClass().getPackage();
            Class<?> superclass = getClass().getSuperclass();
            System.out.println("父类class：" + superclass);
            Class<?>[] interfaces = getClass().getInterfaces();
            for (Class<?> anInterface : interfaces) {
                System.out.println("该类实现的接口：" + anInterface);
            }

            MyAnnocation annotation = method02.getAnnotation(MyAnnocation.class);
            System.out.print("注解类型：" + annotation.annotationType() + "\t");
            System.out.println(annotation);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @MyAnnocation(value = "参数1")
    public void method02() {

    }
}
