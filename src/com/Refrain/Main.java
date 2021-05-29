package com.Refrain;

import com.Refrain.game.Advent;

public class Main {

    public static void main(String[] args) {
        Advent advent = new Advent();
        advent.init();
        while (advent.isAdvent){
            advent.nextRound();
        }
        advent.printYourDiary();
    }
}
