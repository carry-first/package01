package com.test2.stringBuilder.Generic;

public class implementsGeneric2<e> implements GenericInterface<e>{
    @Override
    public void method(e s) {
        System.out.println("第二种方法："+s);
    }

    @Override
    public void method1(e s) {
        System.out.println(s);
    }

    @Override
    public void method2(e s) {
        System.out.println(s);
    }
}
