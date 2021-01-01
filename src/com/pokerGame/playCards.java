package com.pokerGame;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class playCards {
    public static void main(String[] args) {
//        创建打牌类
        playCards pc = new playCards();
    }
    public playCards(){
        ArrayList<String> poker = new ArrayList<>();
//       花色集合
        String fllor[] = {"♠","♥","♣","♦"};
//        点数
        String Point[] ={"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
//        大小王
        poker.add("大王");
        poker.add("小王");
//        循环发牌
        for (int i = 0; i < Point.length; i++) {
            for (int i1 = 0; i1 < fllor.length; i1++) {
                poker.add(fllor[i1]+Point[i]);
            }
        }
//        洗牌
        Collections.shuffle(poker);
//        定义玩家
        ArrayList<String> players1 =new ArrayList<>();
        ArrayList<String> players2 =new ArrayList<>();
        ArrayList<String> players3 =new ArrayList<>();
        ArrayList<String> dipai =new ArrayList<>();
//        循环发牌
        for (int i = 0; i < poker.size(); i++) {
//            当前牌
            String current = poker.get(i);
//            底牌
            if(i>=51){
//                将底牌添加到底牌集合中
                dipai.add(current);
//                如果是第一个玩家
            }else if(i%3==0){
//                将牌添加到第一个玩家中
                players1.add(current);
            }else if(i%3==1){
//                将牌添加到第二个玩家中
                players2.add(current);
            }else if(i%3==2){
//                将牌添加到第三个玩家中
                players3.add(current);
            }
        }
        System.out.println("刘德华："+players1);
        System.out.println("周润发："+players2);
        System.out.println("黎明："+players3);
        System.out.println("底牌："+dipai);
    }
}
