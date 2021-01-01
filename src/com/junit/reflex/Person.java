package com.junit.reflex;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

@MyAnnocation("classAnno")
public class Person {
    @MyAnnocation("field public")
    public String Pname;
    public int Page;
    @MyAnnocation("private field")
    private String name;
    private int age;

    public Person() {
    }

    @MyAnnocation("public constranct")
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @MyAnnocation("private constranct")
    private Person(String pname, int page, String name, int age) {
        Pname = pname;
        Page = page;
        this.name = name;
        this.age = age;
    }

    @MyAnnocation("public toString")
    @Override
    public String toString() {
        return "Person{" +
                "Pname='" + Pname + '\'' +
                ", Page=" + Page +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    @MyAnnocation("public method getName")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @MyAnnocation("private method")
    private int getAge01(){
        return age;
    }
    @MyAnnocation("method002")
    public String Method002(String name, int age){
        return "hello kkk";
    }
}
