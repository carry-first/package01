package com.demo02.ArrayListSort;

import java.lang.reflect.Array;

public class arrayCopy {
    public static void main(String[] args) {
        int[] oldArr = {12, 432, 64, 32, 64, 32};
        int[] newArr = new int[5];
        System.arraycopy(oldArr, 0, newArr, 0, 4);
        for (int i : newArr) {
            System.out.print(i + "\t");
        }
    }
}
