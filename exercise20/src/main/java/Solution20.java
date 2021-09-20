/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Davis
 */

/* Begin Pseudocode
*** Instantiate new Scanner object.
*** Instantiate new Solution20 object.
*** Define variables for state, county, tax, amount, subtotal, price, and total.
*** Process the numeric input in a dedicated method that parses user input into int and returns int. Does not accept parameters.
*** Process the tax in a method that accepts user input as String and compares it with values according to a lookup. Returns double.
*** Process the subtotal in a dedicated method that accepts amount and price, and returns double.
*** Process the total in a dedicated method that accepts subtotal and tax and returns double.
*** Process the output in a void method that prints the tax dollar amount and the total.
End Pseudocode */

import java.util.Scanner;

public class Solution20{
    static final Scanner userInput = new Scanner(System.in);

    int processInput(){
        return Integer.parseInt(userInput.nextLine());
    }

    public double processTax(String state, String county){
        double tax = 0;
        if(state.equals("Wisconsin")){
            if(county.equals("Eau Claire")){
                tax += 0.005;
            }
            else if(county.equals("Dunn")){
                tax += 0.004;
            }
            else{
                tax += 0;
            }
            tax += 0.05;
        }
        else if(state.equals("Illinois")){
            tax = 0.08;
        }
        else{
            tax = 0;
        }
        return tax;
    }

    private double calculateSub(int amount, double price){
        return (amount * price);
    }

    private double calculateTotal(double subtotal, double tax){
        return (subtotal * tax) + subtotal;
    }

    private void processOutput(double tax, double total, double subtotal){
        System.out.printf("The tax is $%.2f%nThe total is $%.2f%n", (tax*subtotal), total);
    }

    public static void main(String[] args){
        Solution20 orderLoc = new Solution20();
        String state;
        String county;
        double price = 1.00;
        int amount;
        double tax;
        double subtotal;
        double total;
        System.out.print("What is the order amount? ");
        amount = orderLoc.processInput();
        System.out.print("What state do you live in? ");
        state = userInput.nextLine();
        System.out.print("What county do you live in? ");
        county = userInput.nextLine();
        tax = orderLoc.processTax(state, county);
        subtotal = orderLoc.calculateSub(amount, price);
        total = orderLoc.calculateTotal(subtotal, tax);
        orderLoc.processOutput(tax, total, subtotal);
    }
}
