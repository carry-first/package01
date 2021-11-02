package com.company;

public class Function<S, I extends Number> {
    //    数组的追加数值
    public static int[] arrayPush(int[] arr, int s) {
        int temp[] = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        ;
        temp[arr.length] = s;
        return temp;
    }
}
