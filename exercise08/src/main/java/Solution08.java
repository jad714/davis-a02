/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Davis
 */

/* Begin pseudocode
*** Instantiate new Solution08 object for accessing non-static methods.
*** Create variables to store user input people / pizzas / slices per pizza.
*** Confirm input with user.
*** Pass pies, slices to pizzaMultiplier function that accepts pies and slices and returns total slices.
*** Pass people, slices to a calculator function that returns how many slices per person.
*** Pass people, slices to a calculator function that returns how many leftover pieces (mod operator) will be left over.
*** Pass same information to a separate function that determines whether there is a remainder or not and returns remainder.
*** Print results and leftover pizzas to the console.
End pseudocode */

import java.util.Scanner;

public class Solution08 {
    public int pizzaMultiplier(int pies, int slices){
        return pies * slices;
    }

    public int pizzaDivider(int slices, int people){
        return slices / people;
    }

    public int pizzaLeftovers(int slices, int people){
        return slices % people;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Solution08 pizza = new Solution08();
        int people;
        int pies;
        int slices;
        int totalSlices;
        String userInput;
        System.out.print("How many people? ");
        userInput = input.nextLine();
        people = Integer.parseInt(userInput);
        System.out.print("How many pizzas do you have? ");
        userInput = input.nextLine();
        pies = Integer.parseInt(userInput);
        System.out.print("How many slices per pizza? ");
        userInput = input.nextLine();
        slices = Integer.parseInt(userInput);
        totalSlices = pizza.pizzaMultiplier(pies, slices);
        System.out.println(people + " people with " + pies + " pizzas (" + totalSlices + " slices)");
        System.out.println("Each person gets " + pizza.pizzaDivider(totalSlices, people) + " pieces of pizza.");
        System.out.println("There are " + pizza.pizzaLeftovers(totalSlices, people) + " leftover pieces.");
    }
}
