/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Davis
 */

/* Begin Pseudocode
*** Instantiate new Scanner object.
*** Instantiate new Solution16 object.
*** Define variables to store legal driving age, user age (both ints), response (String) and isEqual boolean.
*** Prompt user for input.
*** Process user input in dedicated method that accepts no parameters and returns an int.
*** Compare user input and legal driving age for equality in dedicated method that accepts user input and legal driving age as parameters and returns bool.
*** Create message in dedicated method that uses ternary to generate the appropriate message according to the value of isEquals (returns String, accepts isEquals).
*** Process output in dedicated method that prints to console and returns nothing (void).
End Pseudocode */

import java.util.Scanner;

public class Solution16 {
    static final Scanner userInput = new Scanner(System.in);

    private int processInput(){
        return Integer.parseInt(userInput.nextLine());
    }

    private boolean compareValues(int age, int legalAge){
        return (age == legalAge);
    }

    private String generateMessage(boolean isEqual){
        return (isEqual ? "You are old enough to legally drive." : "You are not old enough to legally drive.");
    }

    private void processOutput(String response){
        System.out.println(response);
    }

    public static void main(String[] args){
        Solution16 canDrive = new Solution16();
        int age;
        int legalAge = 16;
        boolean isEqual;
        String response;
        System.out.print("What is your age? ");
        age = canDrive.processInput();
        isEqual = canDrive.compareValues(age, legalAge);
        response = canDrive.generateMessage(isEqual);
        canDrive.processOutput(response);
    }
}
