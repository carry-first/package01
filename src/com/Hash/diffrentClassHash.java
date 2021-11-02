package com.Hash;

import java.util.HashSet;

public class diffrentClassHash {
    public static void main(String[] args) {
        Person p1 = new Person("赵云", 12);
        Person p2 = new Person("赵云", 12);
        Person p3 = new Person("孙悟空", 999);
        HashSet<Person> hs = new HashSet();
        hs.add(p1);
        hs.add(p2);
        hs.add(p3);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
        System.out.println(hs);
    }
}
