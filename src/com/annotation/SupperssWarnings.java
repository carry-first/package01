package com.annotation;

//压制警告
@SuppressWarnings("all")
public class SupperssWarnings {
    private String s;
//    已过时注解
    @Deprecated
    public void show01(){
        System.out.println("jkl");
    };

    @MyAnno("all")
    public void show02(){};

    @Override
    public String toString() {
        return "SupperssWarnings{" +
                "s='" + s + '\'' +
                '}';
    }
}
