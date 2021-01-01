package com.test1.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class demo1 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String format = sdf.format(new Date());
        System.out.println(format);

    }
}
