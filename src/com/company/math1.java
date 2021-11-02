package com.company;


public class math1 {
    public static void main(String[] args) {
        System.out.println(Math.abs(-234));
        System.out.println(Math.floor(12.9));
        System.out.println(Math.ceil(12.1));
        System.out.println(Math.round(12.5));
        son s = new son();
        s.method();
    }
}

class father {
    String name = "父类";

    public void method() {
        System.out.println(name);
    }
}

class son extends father {
    String name = "子类";

    public void method() {
        System.out.println(name);
        System.out.println(super.name);
    }
}