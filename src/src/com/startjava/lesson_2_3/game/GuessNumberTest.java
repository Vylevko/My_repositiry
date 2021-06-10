package com.startjava.lesson_2_3.game;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char choise;

        do {
            System.out.println("Insert first player's name");
            Player player1 = new Player(scan.next());
            System.out.println("Insert second player's name");
            Player player2 = new Player(scan.next());
            System.out.println("First player " + player1.getName());
            System.out.println("Second player " + player2.getName());
            GuessNumber game = new GuessNumber(player1, player2);
            game.start();
            do {
                System.out.println("Do You want to continue this game? Y/N");
                choise = scan.next().charAt(0);
            } while (!(choise == 'Y' || choise == 'N') );
        } while (choise == 'Y');
        scan.close();
    }
}