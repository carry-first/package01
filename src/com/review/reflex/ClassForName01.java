package com.review.reflex;

/**
 * @author Tang A Biao
 * @create 2021/2/23 - 21:17
 */
@myAnnotation(value = "1", name = "not", ClassName = "com.review.reflex.Person", methodk = "toString")
public class ClassForName01 {
    public static void main(String[] args) {
        printArg();
    }

    private static void printArg() {
        System.out.println("kkk");
    }
}
