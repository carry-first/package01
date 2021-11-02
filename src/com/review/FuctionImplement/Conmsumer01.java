package com.review.FuctionImplement;

import java.util.function.Consumer;

/**
 * @author Tang A Biao
 * @create 2021/2/23 - 15:28
 */
public class Conmsumer01 {
    public static void useConmsumer(String name, Consumer<String> consumer) {
//        消费即使用，将传递的name作为使用的对象
//        将namelambda表达式中的形参来使用
        consumer.accept(name);
    }

    public static void main(String[] args) {
//          使用具体的代码
        useConmsumer("张三丰", (String s) -> {
            System.out.println(new StringBuffer(s).reverse());
        });
//        调用两个consumer消费对象
        TwoConsumer("李斯折",
                (s -> System.out.println(1 + s)),
                (s2 -> System.out.println(2 + s2))
        );
    }

    //    可使用两个lambda表达式
    public static void TwoConsumer(String name, Consumer<String> con1, Consumer<String> con2) {
//        andThen表示先调用哪一个lambda代码
        con2.andThen(con1).accept(name);
    }
}
