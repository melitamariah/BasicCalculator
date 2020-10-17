package com.DreamCorp;

import java.util.Scanner;
import java.lang.ArithmeticException;


public class Main {

    public static void main(String[] args) {

        double firstNumber;
        double secondNumber;
        double answer;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Dream Corp Calculator!");

        System.out.print("Choose an operand: ");
        char guestOperand = scanner.next().charAt(0);
        if (guestOperand == '!') {
            System.out.print("Enter a number: ");
            firstNumber = scanner.nextDouble();
            secondNumber = 0;
        } else {

            System.out.print("Enter first number: ");
            firstNumber = scanner.nextDouble();

            System.out.print("Enter second number: ");
            secondNumber = scanner.nextDouble();
        }


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

        }
        else if (guestOperand == '+') {
            answer = firstNumber + secondNumber;
            System.out.println(firstNumber + " " + guestOperand + " " + secondNumber + " = " + answer);
            System.out.println("Total: " + answer);

        }
        else if (guestOperand == '-') {
            answer = firstNumber - secondNumber;
            System.out.println(firstNumber + " " + guestOperand + " " + secondNumber + " = " + answer);
            System.out.println("Total: " + answer);

        }
        else if (secondNumber == 0 && guestOperand == '/') {
            System.err.println("Cannot divide by 0. Enter a value greater than zero.");
        }
        else if (guestOperand == '/' && secondNumber != 0) {
            answer = firstNumber / secondNumber;
            System.out.println(firstNumber + " " + guestOperand + " " + secondNumber + " = " + answer);
            System.out.println("Total: " + answer);
        }
        else if (guestOperand == '^') {
            answer = (Math.pow(firstNumber, secondNumber));
            System.out.println(answer);
        } else if (guestOperand == '!') {
            answer = 1;
            for(int i = 1; i <= firstNumber; ++i) {
                answer *= i;
            }
                System.out.println(answer);

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




