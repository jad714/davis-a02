/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Davis
 */

/* Begin Pseudocode
*** Instantiate a new Scanner object.
*** Instantiate a new Solution17 object.
*** Define constants for r values (female and male), variables for gender, amount, weight, hours, and baContent.
*** Prompt the user for input.
*** Process input in dedicated method to convert to int or double (two methods) that accepts no parameters, and returns int or double (depending on the method).
*** Test input for numeric input in a dedicated method that will not allow the program to continue running if invalid input is provided. Returns int or double to the caller (depending).
*** Calculate BAC in dedicated method that accepts gender, amount, weight, and hours and returns double.
*** Process output in dedicated method that accepts blood alcohol level (calculated) as a parameter, and prints to console depending on value.
 */

import java.util.Scanner;

public class Solution17 {
    static final Scanner userInput = new Scanner(System.in);
    static final double R_WOMEN = 0.66;
    static final double R_MEN = 0.73;

    private int processInputInt(){
        String input = userInput.nextLine();
        return checkOutputInt(input);
    }

    private double processInputDouble(){
        String input = userInput.nextLine();
        return checkOutputDouble(input);
    }

    private int checkOutputInt(String input){
        int result;
        try{
            result = Integer.parseInt(input);
        }
        catch(NumberFormatException e){
            System.out.print("Incorrect format for input. (Must be int)");
            result = 0;
            System.exit(0);
        }
        return result;
    }

    private double checkOutputDouble(String input){
        double result;
        try{
            result = Double.parseDouble(input);
        }
        catch(NumberFormatException e){
            System.out.print("Incorrect format for input. (Must be double)");
            result = 0;
            System.exit(0);
        }
        return result;
    }

    private double calculateBAC(int gender, double amount, double weight, double hours){
        if(gender == 1){
            return ((amount * 5.14 / weight * R_MEN) - .015 * hours);
        }
        else{
            return ((amount * 5.14 / weight * R_WOMEN) - .015 * hours);
        }
    }

    private void processOutput(double baContent){
        if(baContent>0.08){
            System.out.printf("%nYour BAC is %f%nIt is not legal for you to drive.%n", baContent);
        }
        else{
            System.out.printf("%nYour BAC is %f%nIt is legal for you to drive.%n", baContent);
        }
    }

    public static void main(String[] args){
        Solution17 bloodAlcoholCalc = new Solution17();
        int gender;
        double amount;
        double weight;
        double hours;
        double baContent;
        System.out.print("Enter a 1 if you are a male and a 2 if you are a female: ");
        gender = bloodAlcoholCalc.processInputInt();
        System.out.print("How many ounces of alcohol did you have? ");
        amount = bloodAlcoholCalc.processInputDouble();
        System.out.print("What is your weight, in pounds? ");
        weight = bloodAlcoholCalc.processInputDouble();
        System.out.print("How many hours has it been since your last drink? ");
        hours = bloodAlcoholCalc.processInputDouble();
        baContent = bloodAlcoholCalc.calculateBAC(gender, amount, weight, hours);
        bloodAlcoholCalc.processOutput(baContent);
    }

}
