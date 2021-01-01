package com.test2.stringBuilder.Generic;

import com.alibaba.druid.sql.visitor.functions.Char;

public class properties {
    public static void main(String[] args) {
        gen01<Integer> g = new gen01<>(12);
        g.method();
    }
}

class gen01 <e>{
    e tag;
    public void method(){
        if(tag instanceof Integer){
            System.out.println("Integer");
        }else{
            System.out.println("Not Integer");

        }
    }

    public gen01(e tag) {
        this.tag = tag;
    }

    public e getTag() {
        return tag;
    }

    public void setTag(e tag) {
        this.tag = tag;
    }
}