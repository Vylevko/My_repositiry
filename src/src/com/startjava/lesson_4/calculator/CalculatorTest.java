package com.startjava.lesson_4;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();
        char choise;
        do {
            System.out.println("Insert string");
            String text = scan.nextLine();
            System.out.println("You inserted " + text);
            String textArray[] = text.split(" ");
            System.out.println(textArray[1]);
            int firstValue = Integer.parseInt(textArray[0]);
            int secondValue = Integer.parseInt(textArray[2]);
            int result = calc.calculate(firstValue, secondValue, textArray[1].charAt(0));
            System.out.println("Result " + result);
            do {
                System.out.println("Do You want to continue, please answer only Y/N ");
                choise = scan.nextLine().charAt(0);
            } while (!(choise == 'Y' || choise == 'N'));
        } while (choise != 'N');
        System.out.println("End");
        scan.close();
    }
}