package com.test2.stringBuilder.test01;

public class demo01 {
    public static void main(String[] args) {
        String con = "jiojkl  fjdsakojoi";
        System.out.println(con.replaceAll("\\s", "*"));
        String cs = "";
        for (int i = 0; i < con.length(); i++) {
            char c = con.charAt(i);
            int i1 = cs.indexOf(c);
            int count = 0;
            if (i1 == -1) {
                cs += c;
                for (int i2 = 0; i2 < con.length(); i2++) {
                    if (c == con.charAt(i2)) count++;
                }
                System.out.println(c + "出现了：" + count + "次");
            }
        }
    }
}
