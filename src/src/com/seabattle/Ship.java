package src.com.seabattle;

import src.com.seabattle.Desk;

import java.util.ArrayList;

public class Ship {
    private int size;
    private String initPos;
    private ArrayList<String> space;
    private boolean isHorisontal;
    private String alphaSample = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public Ship (int size, String initPos, boolean isHorisontal) {
        this.size = size;
        this.initPos = initPos;
        this.isHorisontal = isHorisontal;
        space = new ArrayList<String>(size);
    }
    public String getShipinitPos() {
        return this.initPos;
    }
    public void calculateFullSpace() {
        space.add(initPos);
        if (isHorisontal) {
           String alph = alphaSample.substring(alphaSample.indexOf(initPos.substring(0,1))+1);
           // System.out.println(alph);
            for (int i = 1; i < size; i++) {
                space.add(alph.substring(i-1,i)+initPos.substring(1));
            }
        } else {
            for (int i = 1; i < size; i++) {
                //System.out.println(i + " DEBUG " + initPos.substring(0,1));
               // System.out.println("DEBUG " + String.valueOf(Integer.parseInt(initPos.substring(1))+1));
                space.add(initPos.substring(0,1)+String.valueOf(Integer.parseInt(initPos.substring(1))+i));
            }
        }
    }
    public void showSpace() {
        for (String a : space) {
            System.out.print(a + " ");
        }
        System.out.println("");
    }

}
