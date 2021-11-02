package com.review;

import java.util.ArrayList;
import java.util.List;

public class revi01 {
    public static void main(String[] args) {
        /*fa f = new zi();
        f.method01();
        f.method02();
        zi z = (zi) f;
        z.play();*/
        revi01.heart h = new revi01().new heart();
        h.method01();
        System.out.println(h.num);
        revi01 r = new revi01();
        r.main("ds");
        Testinterface01 t = new Testinterface01() {
            @Override
            public void eat() {
                System.out.println("eat!");
            }

            @Override
            public void sleep() {
                System.out.println("sleep!");
            }
        };
        t.eat();
        t.sleep();
        StringBuffer sb = new StringBuffer(12);
        sb.append(12);

    }

    public void main(String ar) {
        System.out.println("main");
    }

    class heart {
        int num = 10;

        public void method01() {
            System.out.println("内部类方法");
        }
    }
}

class fa {
    public void method01() {
        System.out.println("父类me01");
    }

    public void method02() {
        System.out.println("me02");
    }
}

class zi extends fa {
    @Override
    public void method01() {
        System.out.println("子类方法");
    }

    @Override
    public void method02() {
        super.method01();
    }

    public void play() {
        System.out.println("子类特有的方法");
    }
}
