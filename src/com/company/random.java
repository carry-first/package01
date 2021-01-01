package com.company;

import java.util.Random;

public class random {
    public static void main(String[] args) {
        Random rm = new Random();
        long l = 3;
        rm.setSeed(l);
        System.out.println(rm.nextInt());
    }

}
