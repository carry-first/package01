package com.IOStream.test;

import java.io.Serializable;

public class Person01 implements Serializable {
    public static final long serialVersionUID = 2L;
    private String name;
    private int age;

    public Person01(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person01{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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
