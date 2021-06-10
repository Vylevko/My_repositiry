package com.startjava.lesson_2_3.game;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int generatedNumber;
    private Player player1;
    private Player player2;
    Random random = new Random();
    Scanner scan = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        generatedNumber = random.nextInt(100) + 1;
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        System.out.println("Computer generated valie from the range (0,100]");
        do { 
            System.out.println(player1.getName() + ", Your turn, insert value from the range (0,100]");
            inputNumber(player1);
            if (guessNumber(player1)) {
                break;
            } 
            
            System.out.println(player2.getName() + ", Your turn, insert value from the range (0,100]");
            inputNumber(player2);
            if (guessNumber(player2)) {
                break;
            }
            System.out.println(generatedNumber);
        } while (true);
        
    }

    private boolean guessNumber(Player player) {
        if (player.getNumber() != 0) {
            if (player.getNumber() > generatedNumber) {
                System.out.println("Generated number is less than yourth");
            } else if (player.getNumber() < generatedNumber) {
                System.out.println("Generated number is greater than yourth");
            } else {
                System.out.println("Correct " + player.getName() + " Won!!!! GZ");
                return true;
            }
        }
        return false;
    }
    
    private void inputNumber(Player player) {
        if (scan.hasNextInt()) {
            player.setNumber(scan.nextInt());
            scan.nextLine();
        } else {
            player.setNumber(0);
            scan.nextLine();
        }
        if(!(player.getNumber() > 0 && player.getNumber()  <= 100)) {
            System.out.println("Inserted value is out the range (0,100]");
        }
    }   
}