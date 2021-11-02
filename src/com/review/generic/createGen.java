package com.review.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tang A Biao
 * @create 2021/2/21 - 22:12
 */
public class createGen<e> {
    private e name;

    public e method01() {
        return name;
    }

    //    将多个相同的数据传递进来返回一个参数的集合
    public <M> List<M> method(M... age) {
        List<M> list = new ArrayList<>();
        for (M m : age) {
            list.add(m);
        }
        return list;
    }
}
