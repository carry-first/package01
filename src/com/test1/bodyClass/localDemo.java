package com.test1.bodyClass;

class localDemo {

    public void methodLocalDemo() {
        final int num = 12;
//        局部内部类
        class inner {
            public void methodInner() {
                System.out.println("局部内部类" + num);
            }
        }
//        方法内定义局部类
        inner in = new inner();
//        调用局部类
        in.methodInner();
    }
}
