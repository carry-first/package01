package com.junit.reflex;

public class getClass extends Person{
    public static void main(String[] args) throws ClassNotFoundException {
        Class cls1 = Class.forName("com.junit.reflex.Person");
        Class cls2 = Person.class;
        Person p = new Person();
        Class cls3 = p.getClass();
        System.out.println(cls1);
        System.out.println(cls2);
        System.out.println(cls3);
          System.out.println("sdf");
    }
}
