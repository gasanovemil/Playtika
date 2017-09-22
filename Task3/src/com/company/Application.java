package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Application {

    public static void main(String[] args) {
        int number1, number2, result;
        String operation;
        Scanner num1 = new Scanner(System.in);

        System.out.println("Enter first number ");
        number1 = num1.nextInt();

        System.out.println("Enter operation + or - ");
        operation = num1.next();

        System.out.println("Enter second number ");
        number2 = num1.nextInt();

        if (operation.equals("+")) {
            result = number1 + number2;
            System.out.println("result is " + result);
        }
        else if (operation.equals("-"))
        {
            result = number1 - number2;
            System.out.println("Result is " + result);
        }
        else
            System.out.println("Incorrect operation was used. Please try again" );
    }
}