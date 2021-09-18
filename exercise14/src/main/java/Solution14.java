/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Davis
 */

/* Begin Pseudocode
*** Instantiate new instance of the Scanner class.
*** Instantiate new instance of the Solution14 class.
*** Define variables for order amount, price, subtotal, and a constant for Wisconsin's tax.
*** Prompt user for all inputs.
*** Call processInputInt method, which accepts no parameters and returns an int result.
*** Process state in the main method (one short line).
*** Call calculateSubtotal method which accepts the order amount as an int parameter, and the price and returns a double.
*** calculateTotal method (to be called from processOutput) which accepts the subtotal as double parameter and returns total *  TAX_WI.
*** Call processOutput method which accepts the order amount, subtotal, total, and isWisconsin and prints different output depending on the value of isWisconsin. Returns nothing.
End Pseudocode */

import java.util.Scanner;

public class Solution14 {
    static final double TAX_WI = 0.055;
    static final Scanner userInput = new Scanner(System.in);

    private int processInputInt(){
        return Integer.parseInt(userInput.nextLine());
    }

    private double calculateSubtotal(double price, int orderAmount){
        return price * orderAmount;
    }

    private double calculateTotal(double total){
        return total + (TAX_WI*total);
    }

    private void processOutput(double subtotal, String state){
        double total = subtotal;
        if(state.equals("WI")){
            total = this.calculateTotal(total);
            System.out.printf("The subtotal is $%.2f.%nThe tax is $%.2f.%n", subtotal, (TAX_WI*100));
        }
            System.out.printf("The total is $%.2f.%n", total);
    }

    public static void main(String[] args){
        Solution14 orderCalculator = new Solution14();
        double price = 1.00;
        int orderAmount;
        String state;
        double subtotal;
        System.out.print("What is the order amount? ");
        orderAmount = orderCalculator.processInputInt();
        System.out.print("What is the state? ");
        state = userInput.nextLine();
        subtotal = orderCalculator.calculateSubtotal(price, orderAmount);
        orderCalculator.processOutput(subtotal, state);
    }
}
