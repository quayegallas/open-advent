package com.Refrain.game;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Advent {
    private int rows = 1024;
    private int cols = 1024;
    public boolean isAdvent;
    public boolean isGameOver;
    public List<List<Map<String,Object>>> map = null;

    public void init(){
        isAdvent = false;
        isGameOver = false;
        initMap();
    }

    public void gameover(){
        this.isAdvent = true;
        isGameOver = false;
    }

    private void initMap() {
        map = new ArrayList<>(cols);
        for (int i = 0; i < cols; i++) {
            List<Map<String,Object>> rowList = new ArrayList<>(rows);
            for (int j = 0; j < rows; j++) {
                Map<String,Object> attrs = new HashMap<>();
                rowList.add(attrs);
            }
            map.add(rowList);
        }
    }
}
