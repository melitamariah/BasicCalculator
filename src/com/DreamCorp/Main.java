package com.DreamCorp;

import java.util.Scanner;
import java.lang.ArithmeticException;


public class Main {

    public static void main(String[] args) {

        int firstNumber;
        int secondNumber;
        int answer;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Dream Corp Calculator!");

        System.out.print("Choose an operand: ");
        char guestOperand = scanner.next().charAt(0);
        if (guestOperand == '!') {
            System.out.print("Enter a number: ");
            firstNumber = scanner.nextInt();
            secondNumber = 0;
        } else {

            System.out.print("Enter first number: ");
            firstNumber = scanner.nextInt();

            System.out.print("Enter second number: ");
            secondNumber = scanner.nextInt();
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
        else if (guestOperand == '/') {
            try {
                answer = firstNumber / secondNumber;
                System.out.println(firstNumber + " " + guestOperand + " " + secondNumber + " = " + answer);
                System.out.println("Total: " + answer);
                } catch(Exception e) {
                System.out.println("Cannot divide by 0");
            }
        }

      else if (guestOperand == '^') {
            answer = (int) Math.pow(firstNumber, secondNumber);
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






