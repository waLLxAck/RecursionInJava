package com.sparta.svilen;

import java.util.Scanner;

public class StartIteratives {
    public static void start() {
        startFactorial();
    }

    private static void startFactorial() {
        //Print method initialisation
        Printer.printTitle("Iterative Factorial");

        //Object that can be used to retrieve user input
        Scanner reader = new Scanner(System.in);

        //Print an message asking for user input
        Printer.printEnterNumber();

        //Get user input
        int factorialInput = reader.nextInt();

        //Execute factorial
        IterativeTasks.methodFactorial(factorialInput);
    }
}
