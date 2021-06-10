package com.startjava.lesson_4;

public class Calculator {
    double calculate(int a, int b, char action) {
        int result = 0;
        switch (action) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return Math.floorDiv(a, b);
            case '%':
                return Math.floorMod(a, b);
            case '^':
                return (int) Math.pow(a, b);
            default:
                System.out.println("Action is incorrect");
                break;
        }
        return result;
    }
}