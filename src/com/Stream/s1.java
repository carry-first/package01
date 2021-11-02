package com.Stream;

import com.Hash.Person;
import jdk.dynalink.beans.StaticClass;
import org.junit.Assert;
import org.junit.Test;

import javax.lang.model.element.AnnotationValue;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Tang A Biao
 * @create 2021/6/26 - 14:52
 */
public class s1 {
    public static void main(String[] args) throws IOException {
        List<String> list = Arrays.asList("张三", "李四", "王五", "赵六", "田七", "王八", "李九");
        Stream<String> stream = list.stream();
        Stream<String> limit = stream.limit(2);
        limit.forEach(System.out::println);
        System.out.println(limit);
        Person person = new Person();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/k.txt"));
            objectOutputStream.writeObject(person);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test01() {
        int add = s1.add(13, 2);
        Assert.assertEquals(12, add);
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
