package com.test2.stringBuilder.encapsulation;

public class demo1 {
    public static void main(String[] args) {
        Integer in1 = new Integer(12);
        System.out.println(in1);
        Integer in2 = new Integer("32");
        System.out.println(in2);
        System.out.println(in1.intValue());
        Integer in3 = Integer.valueOf(22);
        System.out.println(in3);
        Integer in4 = new Integer(12);
        System.out.println(in4 + 4);
        int num = Integer.parseInt("23");
        System.out.println(num);
    }
}
