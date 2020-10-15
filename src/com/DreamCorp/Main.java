package com.DreamCorp;

import java.util.Scanner;
import java.lang.ArithmeticException;


public class Main {

    public static void main(String[] args) {

        double firstNumber;
        double secondNumber;
        double answer = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Dream Corp Calculator!");
        System.out.print("Enter first number: ");
        firstNumber = scanner.nextDouble();

        System.out.print("Enter second number: ");
        secondNumber = scanner.nextDouble();

        System.out.print("Now choose an operand: ");
        char guestOperand = scanner.next().charAt(0);

         switch (guestOperand) {

            case '+' : answer = firstNumber + secondNumber;
             System.out.print(firstNumber +" "+guestOperand +" "+secondNumber +" "+"= "+answer);
             break;
            case '-' : answer = firstNumber - secondNumber;
             System.out.print(firstNumber +" "+guestOperand +" "+secondNumber +" "+"= "+answer);
             break;
            case '*' : answer = firstNumber * secondNumber;
             System.out.print(firstNumber +" "+guestOperand +" "+secondNumber +" "+"= "+answer);
             break;
            case '/' : answer = firstNumber / secondNumber;
            if (secondNumber == 0) {
                System.out.print("Enter another integer besides 0.");
            }
             break;
            default: System.out.println("Try again!");
         }

/*
        if (guestOperand == '*') {
            answer = firstNumber * secondNumber;
        } else if (guestOperand == '+') {
            answer = firstNumber + secondNumber;
        } else if (guestOperand == '-') {
            answer = firstNumber - secondNumber;
        }
        // try {
        if
        (guestOperand == '/') {
            answer = firstNumber / secondNumber;
        }
        else if (secondNumber == 0) {
                System.err.println("Enter value greater than 0");
        }
    //}
    //catch (ArithmeticException e) {
    // System.out.println(e);
    // }

 */

    }
}


