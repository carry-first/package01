package com.review.Exception;

/**
 * @author Tang A Biao
 * @create 2021/2/22 - 9:31
 */
public class ExceptionTest01 {
    public static void main(String[] args) {

    }

    public void method01(int arr[]) {
        if (arr == null) {
            throw new NullPointerException("空指针异常");
        }
        try {
            int a;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
