package com.test2.stringBuilder.Generic;

//定义泛型，其中e表示泛型，下面的数据类型全部使用e来表示
public class use1<e> {
    private e name;
    private e age;
    private e tite;

    public e getName() {
        return name;
    }

    public void setName(e name) {
        this.name = name;
    }

    public e getAge() {
        return age;
    }

    public void setAge(e age) {
        this.age = age;
    }

    public e getTite() {
        return tite;
    }

    public void setTite(e tite) {
        this.tite = tite;
    }
}
