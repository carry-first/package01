package com.review.collections;

import com.ArrayListStream.Person;

import java.util.*;

/**
 * @author Tang A Biao
 * @create 2021/2/21 - 21:44
 */
public class syncList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        List<Person> list1 = Collections.synchronizedList(list);
        Person p1 = new Person("赵云", 23);
        Person p2 = new Person("张飞", 12);
        Person p3 = new Person("猴子", 20);
        list1.add(p1);
        list1.add(p2);
        list1.add(p3);
        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.getAge() - o2.getAge();
            }
        };
        Collections.sort(list1, (o1, o2) -> o2.getAge() - o1.getAge());
//        list1.
        System.out.println("排序后的集合：" + list1);
    }
}
