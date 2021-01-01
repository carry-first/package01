package com.annotation.testIsException;

public class use {

    @testData
    public void show01(){
        System.out.println("1 + 0 ="+(1 + 0));
    }

    @testData
    public void show02(){
        System.out.println("1 - 0 ="+(1 - 0));
    }

    @testData
    public void show03(){
        System.out.println("1 * 0 ="+(1 * 0));
    }

    @testData
    public void show04(){
        System.out.println("1 / 0 ="+(1 / 0));
    }

    public void show05(){
        System.out.println("没有加注解的方法");
    }
}
