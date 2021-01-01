package com.test1.sendHongbao;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class demonMain {
    public static void main(String[] args) {
//        int b = JOptionPane.showOptionDialog(null,"是否退出","确认框",JOptionPane.PLAIN_MESSAGE);
//        int b = JOptionPane.showConfirmDialog(null, "内容", "标题",JOptionPane.YES_OPTION);
//        System.out.println(b);
//        if(b == 0){
//            JOptionPane.showMessageDialog(null,"点击了是","tok",JOptionPane.PLAIN_MESSAGE);
//        }else{
//            JOptionPane.showMessageDialog(null,"点击了是","tok",JOptionPane.PLAIN_MESSAGE);
//        }
        int totalMoney = 0;
        int totalPerple = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入金额");
        totalMoney = sc.nextInt();
        System.out.println("请输入人数");
        totalPerple = sc.nextInt();

        ArrayList<Integer> result = new ArrayList<>();
        result = RandomCompleted(totalMoney,totalPerple);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
//    随机分配红包
    public static ArrayList<Integer> RandomCompleted(int totalMoney,int totalCount){
        ArrayList<Integer> arr = new ArrayList<>();

//        定义数值和人数
        int leftMoney = totalMoney;
        int leftCount = totalCount;

//        随机红包最后一个不需要随机发放
        for (int i = 0; i < totalCount-1; i++) {
            Random rm = new Random();
//            随机金额
            int randomMoney = rm.nextInt(leftMoney - leftCount * 2) + 1;
//            金额大小-剩下的人数*2
            arr.add(randomMoney);
//            减少金额和人数
            leftMoney -= randomMoney;
//            减少人数
            leftCount--;
        }
//        最后一个
        arr.add(leftMoney);

        return arr;
    }
//    平均分配红包
    public static ArrayList<Integer> AverageCompleted(int money,int perple){
        ArrayList<Integer> arr = new ArrayList();
//        平均分配
        for (int i = 0; i < money / perple-1; i++) {
            arr.add(money / perple);
        }
//        最后一个余数分配
        arr.add(money%perple);
        return arr;
    }
}
