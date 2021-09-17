/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Davis
 */

/* Begin Pseudocode
*** Instantiate new instance of Scanner class.
*** Instantiate new instance of Solution10 class.
*** Prompt the user for amount they have in euros.
*** Declare necessary variables in main method.
*** Process user input in dedicated method that accepts no parameters, and returns an int (for c_from).
*** Process user input in dedicated method that accepts no parameters, and returns a double (for exchange rate).
*** Call this method for c_from and for the exchange rate separately.
*** Call a calculateDollars method that accepts c_from and the exchange rate and returns a double.
*** Process output in a dedicated method that accepts c_from, c_to and the exchange rate, and prints to console. Returns nothing.
End Pseudocode */

import java.util.Scanner;

public class Solution11 {
static final Scanner userInput = new Scanner(System.in);

    private int processInputInt(){
        return Integer.parseInt(userInput.nextLine());
    }

    private double processInputDouble(){
        return Double.parseDouble(userInput.nextLine());
    }

    private double calculateDollars(int cFrom, double rate){
        return cFrom * rate;
    }

    private void processOutput(int cFrom, double cTo, double rate){
        System.out.printf("%d euros at an exchange rate of %f is %.2f%nU.S. dollars.", cFrom, rate, cTo);
    }

    public static void main(String[] args){
        Solution11 currencyExchange = new Solution11();
        int cFrom;
        double cTo;
        double rate;
        System.out.print("How many euros are you exchanging? ");
        cFrom = currencyExchange.processInputInt();
        System.out.print("What is the exchange rate? ");
        rate = currencyExchange.processInputDouble();
        cTo = currencyExchange.calculateDollars(cFrom, rate);
        currencyExchange.processOutput(cFrom, cTo, rate);
    }
}
