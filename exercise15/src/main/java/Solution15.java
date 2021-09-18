/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Davis
 */

/* Begin Pseudocode
*** Instantiate new Scanner object.
*** Instantiate new Solution15 object.
*** Define boolean variable isMatch, and String variables password and passwordInput.
*** Prompt user for input.
*** Compare strings in method that accepts scanned string and defined password as parameters, and returns a boolean value for isMatch.
*** Process output in method that accepts isMatch as a parameter and prints the welcome / rejection method to the console. Method returns nothing.
End Pseudocode */

import java.util.Scanner;

public class Solution15 {
    static final Scanner userInput = new Scanner(System.in);

    private boolean checkPassword(String password, String passwordInput){
        return passwordInput.equals(password);
    }

    private void processOutput(boolean isMatch){
        if(isMatch){
            System.out.println("Welcome!");
        }
        else{
            System.out.println("I don't know you.");
        }
    }

    public static void main(String[] args){
        Solution15 passwordValidator = new Solution15();
        boolean isMatch;
        String password = "jAd12345";
        String passwordInput;
        System.out.print("What is the password? ");
        passwordInput = userInput.nextLine();
        isMatch = passwordValidator.checkPassword(password, passwordInput);
        passwordValidator.processOutput(isMatch);
    }
}
