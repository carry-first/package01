package com.review.reflex;

import java.util.Date;

/**
 * @author Tang A Biao
 * @create 2021/2/23 - 17:28
 */
public class Person {
    private String name;
    private int id;
    private Date birthday;
    public String No;

    public Person() {
    }

    public Person(String name, int id, Date birthday, String no) {
        this.name = name;
        this.id = id;
        this.birthday = birthday;
        No = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getNo() {
        return No;
    }

    public void setNo(String no) {
        No = no;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", birthday=" + birthday +
                ", No='" + No + '\'' +
                '}';
    }
}
