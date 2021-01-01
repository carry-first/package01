package com.jpanel.calendar;

public class arrcopy {
    public static void main(String[] args) {
        int oldArr[] = {12,43,54,39,43};
        int newArr[] = {54,12,73,91,55,23};
        System.arraycopy(oldArr,2,newArr,3,2);
        for (int item:
             newArr) {
            System.out.print(item+"\t");
        }
        String s = "jj";
    }
}
