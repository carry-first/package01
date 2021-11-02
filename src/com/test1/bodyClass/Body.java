package com.test1.bodyClass;

public class Body {
    int num = 10;

    public class heart {
        int num = 20;

        //        内部方法
        public void beat() {
            int num = 30;
            System.out.println("方法内部值num" + num);
            System.out.println("类中的变量值this.num" + this.num);
            System.out.println("主类中的变量值Body.this.num" + Body.this.num);
        }
    }

    public void method() {
        System.out.println("成员方法");
//        匿名对象调用方法
        new heart().beat();
    }
}
