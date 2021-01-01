package com.ArrayListStream;

import java.util.HashSet;
import java.util.Iterator;

public class hashSet {
    public static void main(String[] args) {
        HashSet<Person> hs = new HashSet<>();
        Person p1 = new Person("张三",12);
        Person p2 = new Person("lisi",22);
        Person p3 = new Person("lisi",32);
        hs.add(p1);
        hs.add(p2);
        hs.add(p3);
        p2.setName("kkk");
        hs.remove((Person) p2);
        Iterator<Person> iterator = hs.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
