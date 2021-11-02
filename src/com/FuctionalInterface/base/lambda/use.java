package com.FuctionalInterface.base.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class use {
    public static void main(String[] args) {
        String arr[] = {"fsd", "3232", "323", "4353434f", "4231fef2r"};
        Arrays.sort(arr, getComparator());
        System.out.println(Arrays.toString(arr));
    }

    //    创建排序规则
    public static Comparator<String> getComparator() {
//        使用lambda作为返回规则
        return (o1, o2) -> o1.length() - o2.length();
    }
}
