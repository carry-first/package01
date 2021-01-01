package com.demo02.ArrayListSort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class sort {
    public static void main(String[] args) {
        Person p1 = new Person("赵云",22);
        Person p2 = new Person("猴子",999);
        Person p3 = new Person("猪八戒",333);
        ArrayList<Person> arrP = new ArrayList<>();
        arrP.add(p1);
        arrP.add(p2);
        arrP.add(p3);
        Collections.sort(arrP);
//        System.out.println(arrP);
        Student s1 = new Student("刘备",33);
        Student s2 = new Student("关羽",31);
        Student s3 = new Student("张飞",22);
        ArrayList<Student> arrS = new ArrayList<>();
        Collections.addAll(arrS,s1,s2,s3);
        Collections.sort(arrS, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
//                return 0;
//                定义返回规则---升序
                return o1.getAge() - o2.getAge();
//                降序
//                return o2.getAge() - o2.getAge();
            }
        });
        System.out.println(arrS);
    }
}
