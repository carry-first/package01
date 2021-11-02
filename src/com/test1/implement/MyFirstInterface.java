package com.test1.implement;

public interface MyFirstInterface {
    public abstract void ab();

    //    默认方法
    default void dm() {
        System.out.println("接口1中的default1");
    }

    //    接口中定义常量定义常量
    public static final int NUM = 12;

    public void eat();

    abstract void look();

    void write();

    public default void test() {
        System.out.println("fdsa");
    }

    void aa(int a);

    public static void methodStatic() {
        System.out.println("这是一个接口中的静态方法");
    }

    default void methodDefault1() {
        System.out.println("default1");
        defaultCommon();
    }

    default void methodDefault2() {
        System.out.println(NUM);
        System.out.println("default2");
        defaultCommon();
    }

    private void defaultCommon() {
        System.out.println("AAAA");
        System.out.println("BBBB");
        System.out.println("CCCC");
    }
}
