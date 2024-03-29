package com.IOStream.serialize;

import java.io.Serializable;

public class Person implements Serializable {
    //    设置序列化的版本id为2
    public static final long serialVersionUID = 2L;
    private String name;
    //    private int age;
    public int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
