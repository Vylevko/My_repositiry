package src.com.seabattle;

import src.com.seabattle.Desk;

import java.util.ArrayList;

public class Ship {
    private int size;
    private int[] initPos;
    private ArrayList<int[]> space;
    private ArrayList<int[]> extSpace;
    private boolean isHorisontal;
    private int num;
    public Ship (int size, int num) {
        this.size = size;
        this.initPos = new int[]{0,0};
        this.isHorisontal = true;
        this.space = new ArrayList<int[]>(size);
        this.extSpace = new ArrayList<int[]>();
        this.num = num;
    }


    public ArrayList<int[]> getSpace() {
        return this.space;
    }

    public int[] getShipInitPos() {
        return this.initPos;
    }

    public int getSize() { return this.size;}

    public void setShipInitPos(int[] initPos) {
        this.initPos = initPos;
    }

    public void horisontal(boolean isHorisontal) {
        this.isHorisontal = isHorisontal;
    }

    public void calculateFullSpace() {
       // space.add(initPos);
        if (isHorisontal) {
           // System.out.println(alph);
            for (int i = initPos[0]; i < initPos[0] + size; i++) {
                space.add(new int[] {i,initPos[1]});
            }
        } else {
            for (int i = initPos[1]; i < initPos[1] + size; i++) {
                //System.out.println(i + " DEBUG " + initPos.substring(0,1));
               // System.out.println("DEBUG " + String.valueOf(Integer.parseInt(initPos.substring(1))+1));
                space.add(new int[]{initPos[0],i});
            }
        }
    }
    private void calculateExtSpace() {
        for (int i = 0; i < size; i ++) {

        }

    }

}
