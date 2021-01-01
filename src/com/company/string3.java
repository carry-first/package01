package com.company;

public class string3 {
    public static void main(String[] args) {
        int nums[] = {1,4,86,43};
        String s = fromArrayToString(nums);
        System.out.println(s);
    }
    public static String fromArrayToString(int [] arr){
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length -1){
                result += arr[i];
            }else{
                result += arr[i] + "#";
            }

        }
        return result + "]";
    }
}
