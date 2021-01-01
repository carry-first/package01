package com.FuctionalInterface.base.methodQuote;

public class calcImpl {
    public static int cal(int num,Calcable calca){
//        返回方法的调用结果，方法规则在调用的时候写入
        return calca.calc(num);
    }

    public static void main(String[] args) {
//        定义规则，传入数据，并返回内容
       int result =  cal(-10,s->Math.abs(s));
        System.out.println(result);
//        直接调用静态的Math类中的abs方法，并使用引用符：：
        System.out.println(cal(-54,Math::abs));
    }
}
