package com.ArrayListStream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionTest01 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Person("zs", 32));
        list.add(new Person("ls", 43));
        list.add(new Person("ww", 3));
        list.add(new Person("zl", 34));
//        Collections.reverse(list);
//        Collections.shuffle(list);
        Collections.swap(list, 1, 3);
        System.out.println(list);
    }
}

class Student<e, k> {
    private e age;
    private k name;

    public void method(e arg) {
        arg = this.age;

    }

}
