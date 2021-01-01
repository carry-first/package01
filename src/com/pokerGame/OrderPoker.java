package com.pokerGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class OrderPoker {
    public static void main(String[] args) {
        play();
    }
    public static void play(){
//        定义集合
        int index = 0;
        ArrayList<Integer> pokerIndex = new ArrayList<>();
//        定义map集合
        HashMap<Integer,String> poker = new HashMap<>();
//        定义花色
        List<String> colors = List.of("♠","♥","♣","♦");
//        定义数字
        List<String> numbers = List.of("2","A","K","Q","J","10","9","8","7","6","5","4","3");
//        添加大小王和指定的key
        pokerIndex.add(index);
        poker.put(index,"大王");
        index++;
//        小王
        pokerIndex.add(index);
        poker.put(index,"大王");
        index++;
//        循环添加牌
        for (String number : numbers) {
            for (String color : colors) {
//                添加索引值
                pokerIndex.add(index);
//                添加扑克牌
                poker.put(index,color+number);
//                索引值增加
                index++;
            }
        }
//        System.out.println(pokerIndex);
//        System.out.println(poker);
//        定义玩家和底牌
        ArrayList<Integer> play1 = new ArrayList<>();
        ArrayList<Integer> play2 = new ArrayList<>();
        ArrayList<Integer> play3 = new ArrayList<>();
        ArrayList<Integer> dipai = new ArrayList<>();
//        打乱牌
        Collections.shuffle(pokerIndex);
//        发牌
        for (int i = 0; i < pokerIndex.size(); i++) {
//            取出当前打乱牌的扑克值
            int in = pokerIndex.get(i);
            if(i>=51){
//                将打乱的牌添加到底牌中
                dipai.add(in);
            }else if(i%3==0){
                play1.add(in);
            }else if(i%3==1){
                play2.add(in);
            }else if(i%3==2){
                play3.add(in);
            }
        }
//        对发完牌的扑克值进行排序
        Collections.sort(play1);
        Collections.sort(play2);
        Collections.sort(play3);
//        进行输出
        showPoker("刘备",poker,play1);
        showPoker("关羽",poker,play2);
        showPoker("张飞",poker,play3);
        showPoker("底牌",poker,dipai);
    }
    public static void showPoker(String name,HashMap poker,ArrayList<Integer> list){
        System.out.print(name+":  ");
        for (Integer in : list) {
            System.out.print(poker.get(in)+"   ");
        }
        System.out.println();
    }
}
