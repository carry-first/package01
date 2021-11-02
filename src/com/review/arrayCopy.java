package com.review;

import org.junit.Test;

/**
 * @author Tang A Biao
 * @create 2021/2/21 - 21:37
 */
public class arrayCopy {
    @Test
    public void copy01() {
        int arr1[] = {12, 43, 12, 5, 23, 61, 2, 23};
        int arr2[] = new int[9];
        System.arraycopy(arr1, 0, arr2, 0, 4);
        for (int i : arr2) {
            System.out.print(i + "\t");
        }
        String s1 = "23";
    }
}
