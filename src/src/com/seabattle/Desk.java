package src.com.seabattle;

public class Desk {
    private int[][] desk;
    public Desk (int x, int y) {
        this.desk = new int[x][y];
    }
    public int[][] getDesk() {
        return this.desk;
    }
    public boolean setShip(int[][] ship) {
        if (validPos(ship)) {
            for (int i = 0; i < ship.length; i++) {
                desk[ship[i][0]][ship[i][1]] = 1;
            }
            return true;
        }
        return false;
    }

    public void showDesk() {
        for (int i = desk.length-1; i >= 0; i--) {
            for (int j = 0; j < desk[i].length; j++) {
                System.out.print(desk[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean validPos (int[][] pos) {
        for (int i=0; i < pos.length; i++) {
            if (desk[pos[i][0]][pos[i][1]] != 0) {
                System.out.println("Клетка не пуста х = " + pos[i][0] + " y = " + pos[i][1] );
                return false;
            }
        }
        return true;

    }
}
