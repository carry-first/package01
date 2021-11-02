package com.test1.heroAttackGame;

public class DemoMain {
    public static void main(String[] args) {
        Hero hero = new Hero("狄仁杰", 122);
        hero.setWeapen(new Weapen("红色令牌"));
        hero.attack();
    }
}
