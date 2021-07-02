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
        shipsConf = new int[]{2, 3};
        flot = new ArrayList<Ship>();
        initPos = new String[]{"A1","B3"};
        scan = new Scanner(System.in);
    }
    public void startGame() {
        createShips();

    }
    public void showShips() {
        for (Ship k : flot) {
           k.showSpace();
           // System.out.println(k.getShipinitPos());
        }
    }
    private boolean invalidShip(int i) {
        return true;
    }
    private String setInitPos(int i) {
        System.out.println("Insert initial Pos for " + i + " ship. Example 'A2' ");
        String pos = scan.nextLine();
        return pos.substring(0,2);
    }
    private boolean dirHorizontal(int i) {
        System.out.println("Insert direction for " + i + " ship. H or V ");
        char dir = scan.nextLine().charAt(0);
        if (dir == 'H') return true;
        return false;
    }
    private void createShips() {
        for (int i = 0; shipsConf.length > i; i++) {
            flot.add(new Ship(shipsConf[i]));
            do {
                flot.get(i).setShipInitPos(setInitPos(i));
                flot.get(i).horisontal(dirHorizontal(i));
                flot.get(i).calculateFullSpace();


            } while (invalidShip(i));
            System.out.println("Создли корабль "+ i + " с такой начальной точкой" + flot.get(i).getShipInitPos());

        }
    }
}
