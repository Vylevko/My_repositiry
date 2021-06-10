package com.startjava.lesson_2_3.calculator;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();
        char choise;
        do {
            System.out.println("Insert first value");
            if (scan.hasNextInt()) {
                int a = scan.nextInt();
                scan.nextLine();
                System.out.println("Insert action value(+, -, *, /, ^, %)");
                char action = scan.next().charAt(0);

                System.out.println("Insert second value");
                if (scan.hasNextInt()) {
                    int b = scan.nextInt();
                    scan.nextLine();
                    int result = calc.calculate(a, b, action);
                    System.out.println(a + " " + action + " " + b + " = " + result);
                } else {
                    scan.nextLine();
                    System.out.println("Your Second value is out of the range");
                }
            } else {
                scan.nextLine();
                System.out.println("Your First value is out of the range");
            }
            do {
                System.out.println("Do You want to continue, please answer only Y/N ");
                choise = scan.next().charAt(0);
            } while (!(choise == 'Y' || choise == 'N'));
        } while (choise != 'N');
        System.out.println("End");
        scan.close();
    }
}