package com.sparta.svilen;

import java.util.Scanner;

public class StartRecursions {

    public static void start() {
        chooseOptionRecursion();
    }

    private static void chooseOptionRecursion() {
        //Print method initialisation
        Printer.printOptionsRecursion();

        //Object that can be used to retrieve user input
        Scanner reader = new Scanner(System.in);

        //Print an message asking for user input
        Printer.printEnterNumber();

        //Get user input
        int input = reader.nextInt();

        switch (input) {
            case 1:
                startMethodRecursion();
                break;
            case 2:
                startFactorial();
                break;
            case 3:
                startFibonacci();
                break;
            case 4:
                startInvertMessage();
                break;
            default:
                break;
        }
    }

    private static void startMethodRecursion() {
        //Print method initialisation
        Printer.printTitle("Method Recursion");

        //Object that can be used to retrieve user input
        Scanner reader = new Scanner(System.in);

        //Print an message asking for user input
        Printer.printEnterNumber();

        //Get user input
        int input = reader.nextInt();

        Recursions.methodRecursion(input);
    }

    private static void startInvertMessage() {
        //Print method initialisation
        Printer.printTitle("Invert Message");

        //Object that can be used to retrieve user input
        Scanner reader = new Scanner(System.in);

        //Print an message asking for user input
        Printer.printEnterText();

        //Get user input
        String messageInput = reader.nextLine();

        System.out.println(Recursions.invertMessage(messageInput));
    }

    private static void startFactorial() {
        //Print method initialisation
        Printer.printTitle("Recursive Factorial");

        //Object that can be used to retrieve user input
        Scanner reader = new Scanner(System.in);

        //Print an message asking for user input
        Printer.printEnterNumber();

        //Get user input
        int factorialInput = reader.nextInt();

        Recursions.methodFactorial(factorialInput);
    }

    private static void startFibonacci() {
        //Print method initialisation
        Printer.printTitle("Recursive Fibonacci");

        //Object that can be used to retrieve user input
        Scanner reader = new Scanner(System.in);

        //Print an message asking for user input
        Printer.printEnterNumber();

        //Get user input
        int factorialInput = reader.nextInt();

        Printer.print(Recursions.methodFibonacci(factorialInput));
    }
}
