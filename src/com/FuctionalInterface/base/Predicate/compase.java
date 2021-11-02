package com.FuctionalInterface.base.Predicate;

import java.util.function.Predicate;

public class compase {
    public static boolean compaseTwoNumber(String s, Predicate<String> a) {
        return a.test(s);
    }

    public static void main(String[] args) {
        boolean b = compaseTwoNumber("j国防大厦lsf", s -> s.length() > 5);
        if (b) {
            System.out.println("长度大于5");
        } else
            System.out.println("长度小于5");
    }
}
