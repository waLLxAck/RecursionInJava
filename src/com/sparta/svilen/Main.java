package com.sparta.svilen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        chooseOptionStart();
    }

    private static void chooseOptionStart() {
        Printer.printOptionsHome();
        Scanner reader = new Scanner(System.in);

        Printer.printEnterNumber();
        int option = reader.nextInt();

        switch (option) {
            case 1:
                StartRecursions.start();
                break;

            case 2:
                StartIteratives.start();
                break;

            case 3:
                Printer.print(Fun.generateRandomListEngineering72());
                break;

            default:
                break;
        }
    }
}
