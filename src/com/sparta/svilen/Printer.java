package com.sparta.svilen;

public class Printer {
    public static void print(Object object) {
        System.out.println(object);
    }

    public static void printBeforeRecursion(int number) {
        System.out.println("Before recursion: " + number);
    }

    public static void printAfterRecursion(int number) {
        System.out.println("After recursion: " + number);
    }

    public static void printFactorialValue(int factorialInput, int factorialValue) {
        System.out.println("Factorial Value of " + factorialInput + " is: " + factorialValue);
    }

    public static void printTitle(String title) {
        System.out.println("----- " + title + " -----");
    }

    public static void printOptionsHome() {
        printTitle("Options Selection");
        System.out.println("Please choose from the following" +
                "\n1 - Start Recursion Methods" +
                "\n2 - Start Iterative Methods" +
                "\n3 - Print randomized class list");
    }

    public static void printEnterNumber() {
        System.out.print("Enter a number: ");
    }

    public static void printEnterText() {
        System.out.print("Enter some text: ");
    }

    public static void printOptionsRecursion() {
        printTitle("Recursion Options Selection");
        System.out.println("Please choose from the following" +
                "\n1 - Start Method Recursion" +
                "\n2 - Start Factorial" +
                "\n3 - Start Fibonacci" +
                "\n4 - Start Invert Message");
    }
}
