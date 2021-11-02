package com.FuctionalInterface.base.methodQuote;


public class argsUse {
    //        使用自定义的函数接口来实现lambda表达式
    public static void printUpperCase(String s, Fuction2 p) {
//         使用自定义的方法来实现需求，这里的函数体可以处理我们所需要的内容
        p.pri(s);
    }

    public static void main(String[] args) {
//        调用自定义的方法
        printUpperCase("hello", s -> {
//            箭头函数中的替代p。pri（s）里面函数方法体，s表示我们使用方法传递的内容
//            新建一个类可以在类里面处理我们所需要的内容
            String result = new methodUpper().Upper(s);
            System.out.println(result);
        });

    }
}
