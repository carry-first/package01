package com.test1.Object;

import java.util.Objects;

public class equals {
    public static void main(String[] args) {
        Person p1 = new Person("赵丽颖",18);
        Person p2 = new Person("赵丽颖",18);
//        比较地址值
        System.out.println(p1==p2);
//        比较地址值
        System.out.println(p1.equals(p2));
//        重写了Object类中的equals方法并比较内容是否相同
        p1.equals(p2);
//        如果是空指针那么是不允许比较内容
        boolean result = Objects.equals(p1, p2);
        System.out.println(result);
    }
}
