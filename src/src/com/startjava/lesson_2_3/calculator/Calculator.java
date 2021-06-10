package com.startjava.lesson_2_3.calculator;

public class Calculator {
    int calculate(int a, int b, char action) {
        int result = 0;
        switch (action) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            case '%':
                return a % b;
            case '^':
                result = 1;
                for (int i = 0; i < b; i++) {
                    result *= a;
                }
                break;
            default:
                System.out.println("Action is incorrect");
                break;
        }
        return result;
    }
}