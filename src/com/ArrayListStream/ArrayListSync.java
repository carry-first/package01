package com.ArrayListStream;

import java.lang.reflect.Array;
import java.util.*;

public class ArrayListSync {
    public static void main(String[] args) {
        Comparator c = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Person && o2 instanceof Person){
                    Person p1 = (Person) o1;
                    Person p2 = (Person) o2;
                    return Integer.compare(p1.getAge(),p2.getAge());
                }else{
                    throw new RuntimeException("内省布奇佩");
                }
            }
        };
        TreeSet<Person> t = new TreeSet<>(c);
        t.add(new Person("zs",12));
        t.add(new Person("zs",32));
        t.add(new Person("zs",23));
        t.add(new Person("zs",6));
        t.add(new Person("zs",30));

        Iterator<Person> iterator = t.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(Integer.compare(12,43));
    }
}
