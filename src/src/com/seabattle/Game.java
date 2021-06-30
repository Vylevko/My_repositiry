package src.com.seabattle;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private int deskSize;
    private int playesrNum;
    private int[] shipsConf;
    private String[] initPos;
    private ArrayList<Ship> flot ;
    private Scanner  scan;
    public Game() {
        deskSize = 3;
        playesrNum = 1;
        shipsConf = new int[]{2, 1};
        flot = new ArrayList<Ship>();
        initPos = new String[]{"A1","B3"};
        scan = new Scanner(System.in);
    }
    public void startGame() {
        for (int i = 0; shipsConf.length > i; i++) {
        flot.add(new Ship(shipsConf[i],initPos[i], true));
        }
    }
    public void showShips() {
        for (Ship k : flot) {
            System.out.println(k.getShipPos());
        }
    }
    private String setInitPos() {
        System.out.println("Insert initial Pos for a ship. Example 'A2' ");
        String pos = scan.nextLine();
        return "ZZZ";

    }
}
