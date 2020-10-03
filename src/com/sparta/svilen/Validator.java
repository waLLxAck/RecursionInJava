package com.sparta.svilen;

public class Validator {
    public static boolean factorialInputIsValid(int factorialInput){
        if (factorialInput < 0) {
            System.err.println("Please enter values greater or equal than 0!");
            return false;
        }
        return true;
    }
}
