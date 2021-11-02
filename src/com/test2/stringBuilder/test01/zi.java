package com.test2.stringBuilder.test01;

public class zi extends fu {
    @Override
    public void method01() {
        System.out.println("子类method01");
    }

    @Override
    public void method02() {
        System.out.println("子类method02");
    }

    int name = 999;

    @Override
    public int getName() {
        return this.name;
    }
}
