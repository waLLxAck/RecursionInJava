package com.sparta.svilen;

public class Recursions {

    public static void methodRecursion(int number) {
        if (number > 0) {
            Printer.printBeforeRecursion(number);
            methodRecursion(number - 1);
            Printer.printAfterRecursion(number);
        }
    }

    //Tail recursion method
    public static int methodFactorial(int factorialInput) {

        if (!Validator.factorialInputIsValid(factorialInput)) {
            return 0;
        }

        int factorialOutput = 1;

        //Stopping condition
        if(factorialInput == 0) {
            return 1;
        } else {
            factorialOutput = factorialInput * methodFactorial(factorialInput-1);
        }

        Printer.printFactorialValue(factorialInput, factorialOutput);
        return factorialOutput;
    }

    public static int methodFibonacci(int initialNumber) {
        if (initialNumber <= 1) {
            return initialNumber;
        }
        return methodFibonacci(initialNumber-1) + methodFibonacci(initialNumber-2);
    }

    //Head recursion method
    public static String invertMessage(String message) {
        if (message.isEmpty()) {
            return message;
        }
        System.out.println(message);
        return invertMessage(message.substring(1)) + message.charAt(0);
    }
}
