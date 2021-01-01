package com.test1.heroAttackInterface;

public class demoMain {
    public static void main(String[] args) {
//        寒冰射手
        hero h = new hero("寒冰射手",new skillImplement("射箭"));
        h.attack();
//        将英雄重置为盲僧
        h.setName("盲僧");
        h.setSkil(new skillImplement("踢人","pen ~ pen ~ pen ~ "));
//        释放技能
        h.attack();

    }
}
