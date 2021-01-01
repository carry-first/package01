package com.FuctionalInterface.base.Supplier;

import java.util.function.Supplier;

public class MaxNumber {
    public static int getMaxNumber(Supplier<Integer> sup){
        return sup.get();
    }
    public static void main(String[] args) {
        int arr[] = {10,43,12,75,3233,111,753};
        int max = getMaxNumber(()->{
            int maxN= arr[0];

            for (int i=0;i<arr.length;i++) {
                maxN = arr[i] > maxN ? arr[i] : maxN;
            }

            return maxN;
        });
        System.out.println(max);
    }
}
