package com.test1.implement;

public interface MyFirstInterface2 {
    public abstract void ab();

    //    默认方法
    default void dm() {
        System.out.println("接口1中的default2");
    }
}
