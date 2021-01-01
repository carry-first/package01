package com.test2.stringBuilder.Generic;

public class demoMain {
    public static void main(String[] args) {
//        将泛型设置为Integer
        use1<Integer> u = new use1<>();
        u.setAge(12);
        System.out.println(u.getAge());
//        定义第二个泛型
        use1<String> u1 = new use1<>();
        u1.setName("赵云");
        System.out.println(u1.getName());
    }
}
