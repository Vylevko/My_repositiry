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
        createCheckShips();

    }
    public void showShips() {
        for (Ship k : flot) {
           k.showSpace();
           // System.out.println(k.getShipinitPos());
        }
    }
    private String setInitPos(int i) {
        System.out.println("Insert initial Pos for " + i + " ship. Example 'A2' ");
        String pos = scan.nextLine();
        return pos.substring(0,2);

    }
    private void createCheckShips() {
        for (int i = 0; shipsConf.length > i; i++) {
            flot.add(new Ship(shipsConf[i],setInitPos(i), true));
            System.out.println("Создвли корабль "+ i + " с такой начальной точкой" + flot.get(i).getShipinitPos());
            flot.get(i).calculateFullSpace();
        }
    }
}
