package com.test2.stringBuilder.Generic;

import org.junit.Test;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericMethodTest01 {
    //    定义将传递任何数据的数组转化为List元素的泛型方法
    public <E> List<E> toList(E[] arr) {
//        定义泛型集合
        ArrayList<E> list = new ArrayList<>();
//        循环遍历数组中的所有元素，将这些元素添加到集合当中
        for (E e : list) {
            list.add(e);
        }
//        返回泛型集合
        return list;
    }

    public void test01() {
        List<String> list = null;
        ArrayList<String> arrlist = new ArrayList();
        LinkedList<String> linke = new LinkedList();
        AbstractList<String> absL = null;

        list = arrlist;
//        arrlist = linke;
        absL = linke;
    }

    @Test
    public void test02() {
        List<?> list = null;
        ArrayList<String> arrlist = new ArrayList<>();
        arrlist.add("sss");
        arrlist.add("gg");
        arrlist.add("hh");
        list = arrlist;
        Object o = list.get(2);
        System.out.println(o);
//        list.add("kkk");
    }

    @Test
    public void test03() {
        List<? extends Person> list1 = null;
        List<? super Person> list2 = null;

        List<Student> list3 = null;
        List<Person> list4 = null;
        List<Object> list5 = null;

        list1 = list3;
        list1 = list4;
//        只有子类才能赋值给list1
//        list1 = list5;

//        super只有父类才能赋值给list2
//        list2 = list3;
        list2 = list4;
        list2 = list5;

//        list1.add(new Person());
        list2.add(new Person());
    }
}
