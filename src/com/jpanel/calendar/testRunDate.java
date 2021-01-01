package com.jpanel.calendar;

public class testRunDate {
    public static void main(String[] args) {
        long startDate = System.currentTimeMillis();
        for (int i = 0; i < 9999; i++) {
            System.out.println(i);
        }
        long endDate = System.currentTimeMillis();
        System.out.println(endDate - startDate);
    }
}
