package com.company;
public class demo1 {
    public static void main(String[] args) {
        student s = new student("zhangsan",19);
        student [] stuArray = new student[3];
        stuArray[0] = new student("lise", 12);
        stuArray[1] = new student("wanger",32);
        stuArray[2] = new student("mazi",32);
        System.out.println(stuArray[0]);
        System.out.println(stuArray[1]);
        System.out.println(stuArray[2]);
    }
public static Phone getPhone(){
        Phone p = new Phone();
    return p;
    }
}

