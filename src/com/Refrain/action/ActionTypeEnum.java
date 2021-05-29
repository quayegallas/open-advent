package com.Refrain.action;

public enum ActionTypeEnum {

    DIRECTION("direction","got to move a speed"),
    STATE("state","change your state"),
    SHOW("show","show your state and situation"),
    BATTLE("battle","just do it"),
    GAME("game","maybe save and load and exit ...");


    private  String type;
    private String   introduction;


    ActionTypeEnum(String type, String introduction) {
        this.type = type;
        this.introduction =introduction;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
}
