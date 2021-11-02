package com.test1.heroAttackInterface;

public class hero {
    //    英雄名
    private String name;
    //    英雄技能
    private skillImplement skil;

    public void attack() {
        System.out.println("我是" + name + "正在使用" + skil.getSkill1() + "技能");
        skil.use();
        System.out.println("技能释放完毕");
    }

    public hero(String name, skillImplement skil) {
        this.name = name;
        this.skil = skil;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public skillImplement getSkil() {
        return skil;
    }

    public void setSkil(skillImplement skil) {
        this.skil = skil;
    }
}
