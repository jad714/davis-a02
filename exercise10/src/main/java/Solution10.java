/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Davis
 */

/* Begin Pseudocode
*** Define a constant for the tax rate.
*** Instantiate an instance of the Scanner class for accepting input.
*** Instantiate an instance of the Solution10 class for everything else.
*** Prompt user for input in a loop (for simplicity).
*** Call (within loop) input processing function that accepts no parameters and returns a double for each item price.
*** Call (within loop) input processing function that accepts no parameters and returns an int for quantity of items.
*** Call (outside of loop) subtotal function that accepts the price and quantity of each item as parameter and calculates the subtotal, returning it as a double.
*** Call tax function that accepts subtotal and returns the amount of tax as a double.
*** Call total function that accepts the subtotal and tax as parameters, adds the tax to the subtotal and returns the total as a double.
*** Call output function that accepts the subtotal , tax, and total as parameters and prints them to the console, and doesn't return anything.
End Pseudocode */

import java.util.Scanner;

public class Solution10 {
    static final double TAX_RATE = 0.055;
    static final Scanner userInput = new Scanner(System.in);

    private double processPrice(){
        return Double.parseDouble(userInput.nextLine());
    }

    private int processQuantity(){
        return Integer.parseInt(userInput.nextLine());
    }

    private double calculateSubtotal(double[] prices, int[] quantities) {
        double subtotal = 0;
        for (int i = 0; i < 3; i++) {
            subtotal += quantities[i] * prices[i];
        }
        return subtotal;
    }

    private double calculateTax(double subtotal){
       return subtotal * TAX_RATE;
    }

    private double calculateTotal(double subtotal, double tax){
        return subtotal + tax;
    }

    private void processOutput(double subtotal, double total, double tax) {
        System.out.printf("Subtotal: $%.2f%n", subtotal);
        System.out.printf("Tax: $%.2f%n", tax);
        System.out.printf("Total: $%.2f%n", total);
    }

    public static void main(String[] args){
        Solution10 selfCheckout = new Solution10();
        double[] prices = {0,0,0};
        int[] quantities = {0,0,0};
        double subtotal;
        double total;
        double tax;
        for(int i=0;i<3;i++){
            System.out.print("Enter the price of item " + (i+1) + ": ");
            prices[i] = selfCheckout.processPrice();
            System.out.print("Enter the quantity of item " + (i+1) + ": ");
            quantities[i] = selfCheckout.processQuantity();
            }
        subtotal = selfCheckout.calculateSubtotal(prices, quantities);
        tax = selfCheckout.calculateTax(subtotal);
        total = selfCheckout.calculateTotal(subtotal, tax);
        selfCheckout.processOutput(subtotal, total, tax);
        }
}


