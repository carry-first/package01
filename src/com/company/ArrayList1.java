package com.company;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
//        ArrayList<String> strArray = new ArrayList<>();
//        strArray.add("邓超");
//        strArray.add("李晨");
//        strArray.add("郑凯");
//        strArray.add("boby");
//        strArray.add("王祖蓝");
//        strArray.remove(3);
//        System.out.println(strArray.size());
//        System.out.println(strArray.get(2));
//        System.out.println(strArray);
//        ArrayList<Integer> intArray = new ArrayList<>();
//        intArray.add(12);
//        intArray.add(423);
//        intArray.add(53);
//        System.out.println(intArray);
        ArrayList<student2> stuArray = new ArrayList<>();
        student2 one = new student2("洪七公",123);
        student2 two = new student2("黄小邪",433);
        student2 three = new student2("段誉",653);
        stuArray.add(one);
        stuArray.add(two);
        stuArray.add(three);
        for (int i = 0; i < stuArray.size(); i++) {
            System.out.println(stuArray.get(i).getName());
            System.out.println(stuArray.get(i).getAge());
        }
    }
}
class student2{
    private String name;
    private int age;

    public student2(String name, int age) {
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