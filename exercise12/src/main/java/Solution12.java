/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Davis
 */

/* Begin Pseudocode
*** Instantiate new Scanner object.
*** Instantiate new Solution12 object called interestCalculator.
*** Define variables for everything (double for all but time).
*** Process user input through dedicated method that parses to int and returns int.
*** Process user input through dedicated method that parses to double and returns double.
*** Call method that accepts principal, rate, and time and returns double to calculateInterest.
*** Process output in processOutput method that accepts rate and time and finalAmount and doesn't return anything.
 End Pseudocode */

import java.util.Scanner;

public class Solution12 {
    static final Scanner userInput = new Scanner(System.in);

    private int processInputInt(){
        return Integer.parseInt(userInput.nextLine());
    }

    private double processInputDouble(){
        return Double.parseDouble(userInput.nextLine());
    }

    private double calculateInterest(double principal, double rate, int time){
        return principal * (1 + rate * time);
    }

    private void processOutput(double rate, int time, double finalAmount){
        System.out.printf("After %d years at %.1f%%, the investment will be worth $%.2f%n", time, (rate*100), finalAmount);
    }

    public static void main(String[] args){
        Solution12 interestCalculator = new Solution12();
        double principal;
        double rate;
        double finalAmount;
        int time;
        System.out.print("Enter the principal: ");
        principal = interestCalculator.processInputDouble();
        System.out.print("Enter the rate of interest: ");
        rate = interestCalculator.processInputDouble() / 100; //Convert to percent form.
        System.out.print("Enter the number of years: ");
        time = interestCalculator.processInputInt();
        finalAmount = interestCalculator.calculateInterest(principal, rate, time);
        interestCalculator.processOutput(rate, time, finalAmount);
    }
}
