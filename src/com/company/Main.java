package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int arr1[] = {12,32,21,23};
        int arr2[] = arrayPush(arr1,3212);
        Arrays.fill(arr1,0,3,21);
        printArray(arr1);
        printArray(arr2);
    }
    public  static  void   printArray(int [] arr){
        for (int item: arr) {
            System.out.print(item + "\t");
        }
        System.out.println();
    }
//    数组的追加数值
    public  static int[] arrayPush(int [] arr,int s){
        int temp[] = new int [arr.length+1];
        for(int i=0;i<arr.length;i++){
            temp[i] = arr[i];
        };
        temp[arr.length] = s;
        return temp;
    }
}
