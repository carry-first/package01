package com.Server_cilent;

public class InetAddress {
    public static void main(String[] args) {
        try {
//            获取域名对应的IP地址
            java.net.InetAddress ias2 = java.net.InetAddress.getByName("www.baidu.com");
//            获取本机地址
            java.net.InetAddress ias3 = java.net.InetAddress.getLocalHost();
//
            System.out.println(ias2);
            System.out.println(ias3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
