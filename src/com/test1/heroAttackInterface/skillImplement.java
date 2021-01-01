package com.test1.heroAttackInterface;

public class skillImplement implements skill{
    private String skill1;
    private String skillEffect;
    public skillImplement(String skill1) {
        this.skill1 = skill1;
    }

    public skillImplement(String skill1, String skillEffect) {
        this.skill1 = skill1;
        this.skillEffect = skillEffect;
    }

    public void use(){
//        如果为空，则默认biu biu biu 攻击方式
        if(this.skillEffect==null) this.skillEffect = "biu ~ biu ~ biu ~ " ;
//        输出技能的效果内容
        System.out.println(skillEffect);

    }

    public String getSkill1() {
        return skill1;
    }

    public void setSkill1(String skill1) {
        this.skill1 = skill1;
    }

    public String getSkillEffect() {
        return skillEffect;
    }

    public void setSkillEffect(String skillEffect) {
        this.skillEffect = skillEffect;
    }
}
