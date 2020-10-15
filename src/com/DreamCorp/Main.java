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

        System.out.print("Choose an operand: ");
        char guestOperand = scanner.next().charAt(0);

    /*   switch (guestOperand) {

            case '+':
                answer = firstNumber + secondNumber;
            case '-':
                answer = firstNumber - secondNumber;
            case '*':
                answer = firstNumber * secondNumber;

            case '/':
                answer = firstNumber / secondNumber;

            default: System.out.println("Try again!");
    }
    System.out.println(firstNumber + " " + guestOperand + " " + secondNumber + " = " + answer);
*/
        if (guestOperand == '*') {
            answer = firstNumber * secondNumber;
            System.out.println(firstNumber + " " + guestOperand + " " + secondNumber + " = " + answer);
            System.out.println("Total: " + answer);

        } else if (guestOperand == '+') {
            answer = firstNumber + secondNumber;
            System.out.println(firstNumber + " " + guestOperand + " " + secondNumber + " = " + answer);
            System.out.println("Total: " + answer);

        } else if (guestOperand == '-') {
            answer = firstNumber - secondNumber;
            System.out.println(firstNumber + " " + guestOperand + " " + secondNumber + " = " + answer);
            System.out.println("Total: " + answer);

        } else if (secondNumber == 0 && guestOperand == '/') {
            System.err.println("Enter value greater than 0.");
        }
        else if (guestOperand == '/' && secondNumber != 0) {
            answer = firstNumber / secondNumber;
            System.out.println(firstNumber + " " + guestOperand + " " + secondNumber + " = " + answer);
            System.out.println("Total: " + answer);
        }
    }
}

/*
        if (guestOperand == '*') {
            answer = firstNumber * secondNumber;
        } else if (guestOperand == '+') {
            answer = firstNumber + secondNumber;
        } else if (guestOperand == '-') {
            answer = firstNumber - secondNumber;
        }
     try {
        if
        (guestOperand == '/') {
            answer = firstNumber / secondNumber;
        }
        else if (secondNumber == 0) {
                System.err.println("Enter value greater than 0");
        }
    }catch (ArithmeticException e) {
           System.out.println(e);
       }

 */




