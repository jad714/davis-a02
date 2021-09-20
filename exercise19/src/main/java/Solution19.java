/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Davis
 */

/* Begin Pseudocode
*** Instantiate new Scanner object.
*** Instantiate new Solution19 object.
*** Define variables to store bmi, weight, and height.
*** Call method to process user input, accept no parameters and return double.
*** Call try/catch method in loop that accepts no parameters and returns boolean value based on parameter and accepts user input.
*** Process calculation in dedicated method that accepts height and weight and calculates BMI (returns double).
*** Process output in dedicated method that accepts BMI and returns nothing.
End Pseudocode */

import java.util.Scanner;

public class Solution19 {
    static final Scanner userInput = new Scanner(System.in);

    private double processInput(){
        String input = "";
        int loop = 0;
        boolean test = false;
        while(!test){
            if(loop>0){
                System.out.print("Incorrect format. Please enter a number: ");
            }
            input = userInput.nextLine();
            test = this.testInput(input);
            loop++;
        }
        return Double.parseDouble(input);
    }

    private boolean testInput(String input){
        try{
            Double.parseDouble(input);
            return true;
        }
        catch(NumberFormatException e){
            return false;
        }
    }

    private double calculateBMI(double height, double weight){
        return (weight / (height * height)) * 703;
    }

    private void processOutput(double bmi){
        System.out.printf("Your BMI is %.1f.%n", bmi);
        if(bmi >= 18.5 && bmi <= 25){
            System.out.println("You are within the ideal weight range.");
        }
        else if(bmi > 25){
            System.out.println("You are overweight. You should see your doctor.");
        }
        else{
            System.out.println("You are underweight. You should see your doctor.");
        }
    }

    public static void main(String[] args){
        Solution19 bmiCalc = new Solution19();

        double bmi;
        double height;
        double weight;
        System.out.print("Please enter your height (in inches): ");
        height = bmiCalc.processInput();
        System.out.print("Please enter your weight (in pounds): ");
        weight = bmiCalc.processInput();
        bmi = bmiCalc.calculateBMI(height, weight);
        bmiCalc.processOutput(bmi);
    }
}
