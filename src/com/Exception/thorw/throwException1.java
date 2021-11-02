package com.Exception.thorw;

public class throwException1 {
    public static void main(String[] args) {
        int arr[] = {12, 32};
        IsException(null, 0);
    }

    public static void IsException(int arr[], int index) {
//        如果数组是空的话
        if (arr == null) {
//            抛出异常,因为nullPointException是RunTime的子类所以JVM会处理
            throw new NullPointerException("空指针异常");
        }
//        如果索引错误
        if (index < 0 || index > arr.length - 1) {
//            抛出索引错误
            throw new ArrayIndexOutOfBoundsException("索引错误");
        }
    }
}
