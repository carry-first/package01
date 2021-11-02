package com.test2.stringBuilder.Generic;

import java.util.ArrayList;

public class demoUpper {
    public static void main(String[] args) {
        ArrayList<Integer> intArr = new ArrayList<>();
        ArrayList<Number> numArr = new ArrayList<>();
        ArrayList<String> strArr = new ArrayList<>();
        ArrayList<Object> objArr = new ArrayList<>();

//        Integer、Number继承了Number类
        getElement1(intArr);
        getElement1(numArr);
//        getElement1(strArr);
//        getElement1(objArr);

//        Number、Object集合是Number类的父类
//        getElement2(intArr);
        getElement2(numArr);
//        getElement2(strArr);
        getElement2(objArr);

    }

    public static void getElement1(ArrayList<? extends Number> list) {
    }

    public static void getElement2(ArrayList<? super Number> list) {
    }
}
