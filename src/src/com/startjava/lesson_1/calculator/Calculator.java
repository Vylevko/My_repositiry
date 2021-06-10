package com.startjava.lesson_1.calculator;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert first value");
        if (scan.hasNextInt()) {
            int a = scan.nextInt();
            System.out.println("Insert action value(+, -, *, /, ^, %)");
            String action = scan.next();
            System.out.println("Insert second value");
            if (scan.hasNextInt()) {
                int b = scan.nextInt();
                int result = 1;
                if (action.equals("+")) {
                    result = a + b;
                } else if (action.equals("-")) {
                    result = a - b;
                } else if (action.equals("*")) {
                    result = a * b;
                } else if (action.equals("/")) {
                    result = a / b;
                } else if (action.equals("%")) {
                    result = a % b;
                } else if (action.equals("^")) {
                    for (int i = 0; i < b; i++) {
                        result *= a;
                    }
                } else {
                    System.out.println(action + " Invalid action");
                }
                System.out.println(a + " " + action + " " + b + " = " + result );
            } else {
                System.out.println("Second value is out of the range, please retry");
            }                
        } else {
            System.out.println("Firs value is out of the range, please retry");
        }
        scan.close();
    }
}