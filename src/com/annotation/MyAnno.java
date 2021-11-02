package com.annotation;


import java.lang.annotation.*;

//设置该注解的作用域
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD})
//设置注解是否可以被保存到JVM中,运行时
@Retention(RetentionPolicy.RUNTIME)
//设置可被保存到doc文档中
@Documented
//设置可被继承
@Inherited
public @interface MyAnno {
    //    定义属性
    String value() default "hi";
}
