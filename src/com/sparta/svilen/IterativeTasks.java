package com.sparta.svilen;

public class IterativeTasks {
    public static void methodFactorial(int factorialInput) {
        if (!Validator.factorialInputIsValid(factorialInput)) {
            return;
        }

        int factorialValue = 1;
        int initialInput = factorialInput;

        while (factorialInput > 1) {
            factorialValue *= factorialInput--;
        }
        Printer.printFactorialValue(initialInput, factorialValue);
    }
}
