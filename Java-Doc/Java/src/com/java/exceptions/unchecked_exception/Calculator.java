package com.java.exceptions.unchecked_exception;

public class Calculator {
    // Addition
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    // Substraction
    public static int subtraction(int num1, int num2) {
        if(num1 > num2) return num1 - num2;
        return num2 - num1;
    }

    // Multiplication
    public static int multiple(int num1, int num2) {
        return num1 * num2;
    }

    // Division
    public static int division(int num1, int num2) {
        if(num1 > num2) return num1 / num2;
        return num2 / num1;
    }

}
