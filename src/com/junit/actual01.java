package com.junit;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Tang A Biao
 * @create 2021/2/23 - 17:10
 */
public class actual01 {
    @Test
    public void TestMethod01() {
        method01 me = new method01();
        int i = me.method01(1, 4);
//        断言，期望得到的值
        Assert.assertEquals(i, 4);
    }
}
