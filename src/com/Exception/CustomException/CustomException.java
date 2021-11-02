package com.Exception.CustomException;

public class CustomException extends Exception {
    //    无参数的构造方法
    public CustomException() {
//        将错误信息交给父类处理
        super();
    }

    public CustomException(String s) {
        super(s);
    }
}
