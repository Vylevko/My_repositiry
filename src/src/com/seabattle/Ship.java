package src.com.seabattle;

import src.com.seabattle.Desk;

import java.util.ArrayList;

public class Ship {
    private int size;
    private String initPos;
    private ArrayList<String> deck;
    private boolean isHorisontal;
    public Ship (int size, String initPos, boolean isHorisontal) {
        this.size = size;
        this.initPos = initPos;
        this.isHorisontal = isHorisontal;
    }
    public String getShipPos() {
        return this.initPos;
    }

}
