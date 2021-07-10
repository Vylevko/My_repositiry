package src.com.seabattle;

import java.lang.reflect.Array;
import java.util.*;

public class Game {
    private int deskSize;
    private int playesrNum;
    private int[] shipsConf;
    //private String[] initPos;
    private ArrayList<Ship> flot ;
    private Scanner  scan;
    private String alphaSample;
    public Game() {
        deskSize = 3;
        playesrNum = 1;
        shipsConf = new int[]{2, 3};
        flot = new ArrayList<Ship>();
        //initPos = new String[]{"A1","B3"};
        scan = new Scanner(System.in);
        alphaSample = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    }
    public void startGame() {
        createShips();


    }
    private int[] translatePosToArray(String pos) {
        int[] c = new int[] {alphaSample.indexOf(pos.charAt(0)),Integer.parseInt(pos.substring(1))};
        return  c;
    }
    private String translateArrayToPos(int[] pos) {
        return alphaSample.charAt(pos[0]) + String.valueOf(pos[1]);
    }

    public void showShips() {
        for (Ship k : flot) {

          //System.out.println(Array.aslist(  translateArrayToPos(k.getShipInitPos()));
        }
    }
    private boolean invalidShip(int i) {
        int[] posBow = flot.get(i).getSpace().get(0);
        int[] posStern = flot.get(i).getSpace().get(flot.get(i).getSize()-1);
        if ((Math.max(posBow[0],posStern[0]) > deskSize-1) || (Math.min(posBow[0],posStern[0]) < 0) ||
                (Math.max(posBow[1],posStern[1]) > deskSize-1) || (Math.min(posBow[1],posStern[1]) < 0)) {
            System.out.println("Ship is placed out of the board range");
            return true;
        }
        return false;
    }
    private int[] setInitPos(int i) {
        System.out.println("Insert initial Pos for " + i + " ship. Example 'A2' ");
        String pos = scan.nextLine().substring(0,2);
        return translatePosToArray(pos);
    }
    private boolean dirHorizontal(int i) {
        System.out.println("Insert direction for " + i + " ship. H or V ");
        char dir = scan.nextLine().charAt(0);
        if (dir == 'H') return true;
        return false;
    }
    private void createShips() {
        for (int i = 0; shipsConf.length > i; i++) {
            flot.add(new Ship(shipsConf[i],i));
            do {
                System.out.println("Set the conditions of the Ship N " + i);
                flot.get(i).setShipInitPos(setInitPos(i));
                System.out.println("The ship init pos is " + translateArrayToPos(flot.get(i).getShipInitPos()));
                flot.get(i).horisontal(dirHorizontal(i));
                flot.get(i).calculateFullSpace();

            } while (invalidShip(i));
            System.out.println("Создли корабль "+ i + " с такой начальной точкой " + translateArrayToPos(flot.get(i).getShipInitPos()));

        }
    }
}
