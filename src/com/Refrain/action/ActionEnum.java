package com.Refrain.action;

public enum ActionEnum {
    NORTH("north", "move(y+$speed)", ActionTypeEnum.DIRECTION.getType()),
    SOUTH("south", "move(y-$speed)", ActionTypeEnum.DIRECTION.getType()),
    WEST("west", "move(x-$speed)", ActionTypeEnum.DIRECTION.getType()),
    EAST("east", "move(x+$speed)", ActionTypeEnum.DIRECTION.getType()),
    EAT("eat", "eat($1)", ActionTypeEnum.STATE.getType()),
    SLEEP("sleep", "sleep()", ActionTypeEnum.STATE.getType()),
    RUN("run", "speed(2*$speed)", ActionTypeEnum.STATE.getType()),
    STEALTH("stealth", "speed(1/2*$speed)", ActionTypeEnum.STATE.getType()),
    HOWAREYOU("state", "show()", ActionTypeEnum.SHOW.getType()),
    ATTACK("attack", "attack()", ActionTypeEnum.BATTLE.getType()),
    DEFENSE("defense", "defense()", ActionTypeEnum.BATTLE.getType()),
    RETREAT("retreat", "retreat()", ActionTypeEnum.BATTLE.getType());

    private String word;
    private String function;
    private String type;

    ActionEnum(String word, String function, String type) {
        this.word = word;
        this.function = function;
        this.type = type;
    }

    public ActionEnum findAction(String word){
        ActionEnum[] actionEnums = ActionEnum.values();
        for(ActionEnum actionEnum:actionEnums){
            if(actionEnum.word.equals(word)){
                return actionEnum;
            }
        }
        return null;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
