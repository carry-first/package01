package com.junit.test;

import com.junit.junit.Caluctor;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class testAdd {
    //    Before
    @Before
    public void init() {
        System.out.println("init...");
    }

    //      注解内容，方便测试方法的可运行性
    @Test
    public void testadd() {
//        创建测试运行的对象
        Caluctor ct = new Caluctor();
//        获取运行的结果
        int result = ct.add(12, 543);
//        断言，实际值的比较
        Assert.assertEquals(32, result);
    }

    //    After
    @After
    public void close() {
        System.out.println("close");
    }
}
