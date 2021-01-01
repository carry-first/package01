package com.Executors.lambda;

public class calculator {
    public static void main(String[] args) {
        intvator(12, 42, new calculatorItf() {
            @Override
            public int cal(int a, int b) {
                return a+b;
            }
        });
        intvator(14,43,(int a,int b)->{
            return a+b;
        });
    }
    public static void intvator(int a,int b,calculatorItf c){
        System.out.println(c.cal(a,b));
    }
}
