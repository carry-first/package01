package com.test2.stringBuilder.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Iterator1 {
    public static void main(String[] args) {
        Collection ct = new ArrayList();
        ct.add("赵云");
        ct.add("姜子牙");
        ct.add("孙悟空");
        ct.add("猪八戒");
        ct.add(12);
//        定义迭代器
        Iterator it = ct.iterator();
//        循环判断是否还有元素
        while (it.hasNext()) {
//            如果有则输出
            System.out.print(it.next() + "\t");
        }

    }
}
