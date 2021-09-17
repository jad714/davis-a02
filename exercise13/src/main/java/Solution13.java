/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Davis
 */

/* Begin Pseudocode
*** Instantiate new Scanner object.
*** Instantiate new Solution12 object called interestCalculator.
*** Define variables for everything (double for all but time and n).
*** Prompt user for input.
*** Process user input through dedicated method that parses to int and returns int.
*** Process user input through dedicated method that parses to double and returns double.
*** Call method that accepts principal, rate, and time and n, and returns double to calculateInterest.
*** Process output in processOutput method that accepts principal, n, rate, time and finalAmount and doesn't return anything.
 End Pseudocode */

import java.util.Scanner;

public class Solution13{
    static final Scanner userInput = new Scanner(System.in);

    private int processInputInt(){
        return Integer.parseInt(userInput.nextLine());
    }

    private double processInputDouble(){
        return Double.parseDouble(userInput.nextLine());
    }

    private double calculateInterest(double principal, double rate, int time, int n){
        return principal * Math.pow((1 + rate/n), (n * time));
    }

    private void processOutput(double principal, double rate, int time, int n, double finalAmount){
        System.out.printf("$%.2f invested at %.1f%% for %d years compounded %d times per year is $%.2f", principal, (rate*100), time, n, finalAmount);
    }

    public static void main(String[] args){
        Solution13 compoundInterest = new Solution13();
        int n;
        int time;
        double principal;
        double rate;
        double finalAmount;
        System.out.print("What is the principal amount? ");
        principal = compoundInterest.processInputDouble();
        System.out.print("What is the rate? ");
        rate = (compoundInterest.processInputDouble())/100; // Convert to decimal form for calculation.
        System.out.print("What is the number of years? ");
        time = compoundInterest.processInputInt();
        System.out.print("What is the number of times the interest compounds per year? ");
        n = compoundInterest.processInputInt();
        finalAmount = compoundInterest.calculateInterest(principal, rate, time, n);
        compoundInterest.processOutput(principal, rate, time, n, finalAmount);
    }
}
