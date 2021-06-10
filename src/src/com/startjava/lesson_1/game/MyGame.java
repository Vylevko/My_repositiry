package com.startjava.lesson_1.game;
import java.util.Scanner;

public class MyGame {
    public static void main(String[] args) {
        int gameNumber = 78;
        //System.out.println(number);
        Scanner scan = new Scanner(System.in);
        int myNumber = 0;
        System.out.println("Try to guess the number from 0 to 100");
        do {
            if (!scan.hasNextInt()) {
                System.out.println("Your variant is not a number, try from the very begining");
                break;
            }
            myNumber = scan.nextInt();
            if (myNumber > 100 || myNumber <= 0 ) {
                System.out.println("Your variant is out of the range (0,100], try again");
                continue;
            } 
            if (myNumber < gameNumber) {
                System.out.println("My number is greater, try again");
            } else if (myNumber > gameNumber) {
                System.out.println("My number is smaller, try again");
            }
        } while (gameNumber != myNumber);
        System.out.println("You guessed, my number was " + gameNumber);
        scan.close();
    }
}
