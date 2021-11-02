package com.test1.heroAttackGame;

public class Hero {
    private String name;
    private int age;
    private Weapen weapen;

    public Hero(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Hero(String name, int age, Weapen weapen) {
        this.name = name;
        this.age = age;
        this.weapen = weapen;
    }

    public void attack() {
        System.out.println(this.name + "使用了" + this.weapen.getCode() + "攻击了别人");
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

    public Weapen getWeapen() {
        return weapen;
    }

    public void setWeapen(Weapen weapen) {
        this.weapen = weapen;
    }
}
