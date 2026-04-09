package com.java.exceptions.unchecked_exception;

import java.util.Scanner;

public class MathCalculation {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = scn.nextInt();

        System.out.print("Enter second number: ");
        int number2 = scn.nextInt();

        int addition = Calculator.add(number1, number2);
        int substraction = Calculator.subtraction(number1, number2);
        int multiplication = Calculator.multiple(number1, number2);

        System.out.println(number1+"+"+number2+"="+addition);
        System.out.println(number1+"-"+number2+"="+substraction);
        System.out.println(number1+"*"+number2+"="+multiplication);
        try {
            int division = Calculator.division(number1, number2);
            System.out.println(number1+"/"+number2+"="+division);
        }
        catch(ArithmeticException a) {
            if(number1 == 0 || number2 == 0) {
                System.out.println("Cannot divided by zero");
            }
        }
    }
}
