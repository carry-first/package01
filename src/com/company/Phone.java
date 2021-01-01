package com.company;

public class Phone {
    String name ="手机";
    private String type = "xiaomi";
    public void call(){
        System.out.println("我会打电话");
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

