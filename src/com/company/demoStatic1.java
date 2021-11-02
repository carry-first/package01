package com.company;

public class demoStatic1 {
    public static void main(String[] args) {
        student3 one = new student3("郭靖", 324);
        one.setRoom("物联01");
        student3 two = new student3("黄蓉", 24);
        System.out.println("姓名:" + one.getName() + "age:" + one.getAge() + "id:" + one.getId());
        System.out.println("姓名:" + two.getName() + "age:" + two.getAge() + "id:" + two.getId());
    }
}

class student3 {
    private int id;
    private String name;
    private int age;
    private String room;
    private static int idCountor = 0;

    public student3(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idCountor;
    }

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

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
