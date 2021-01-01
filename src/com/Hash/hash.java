package com.Hash;

import java.util.HashSet;
import java.util.Iterator;

public class hash {
    public static void main(String[] args) {
        HashSet s = new HashSet();
        HashSet s1 = new HashSet();
        String k = "种地";
        String k2 = "种地";
        k.hashCode();
        k2.hashCode();
        s.add("周润发");
        s.add(k);
        s.add(k2);
        s1.add("周润发");
        s.add("周星驰");
        s.add("周润发");
        s.add(12);
        s.add(43);
        Iterator it = s.iterator();
        Iterator it1 = s1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
