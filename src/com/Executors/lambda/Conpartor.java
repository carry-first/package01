package com.Executors.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Conpartor {
    public static void main(String[] args) {
        Person arr[] = {
                new Person("迪丽热巴", 18),
                new Person("古力娜扎", 10),
                new Person("马儿扎哈", 13),};
/*        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });*/
//        箭头函数代替Comparator对象
        Arrays.sort(arr, (o1, o2) -> {
            return o1.getAge() - o2.getAge();
        });
        for (Person person : arr) {
            System.out.println(person);
        }
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}