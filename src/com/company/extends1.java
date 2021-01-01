package com.company;

public class extends1 {
    public static void main(String[] args) {
        son2 s = new son2();
    }
}
class fa{
    public int a ;
    public int b ;
    public fa(){
        System.out.println("父类构造函数");
    }
    public fa(int a,int b){
        this.a =a;
        this.b =b;
        System.out.println("传递参数的父类构造函数"+a+"\t"+b);
    }
}

class son1 extends fa {
    public son1(){
//        向父类传递参数
        super(12,3);
        System.out.println("子类构造函数");
    }
}
