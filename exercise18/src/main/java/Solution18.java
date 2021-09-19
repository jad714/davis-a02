/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Davis
 */

/* Begin Pseudocode
*** Instantiate new Scanner object.
*** Instantiate new Solution18 object.
*** Define variables for initialScale, finalScale, initialTemp, and finalTemp.
*** Call a method that accepts choice as a parameter and converts the passed String to lowercase for case insensitivity.
*** Call two methods to choose Strings for initialScale and finalScale based on the choice of the user.
*** Call a method that processes userInput and converts given temperature to double for return. Accepts no parameters.
*** Call a method that performs one of two calculations (depending on user choice, a parameter along with fahrenheit and celsius) which returns a double.
*** Call a method that processes the output statement to the user.
End Pseudocode */

import java.util.Scanner;

public class Solution18 {
    static final Scanner userInput = new Scanner(System.in);

    private String processChoiceInput(){
        String userChoice = "";
        int loop=0;
        while(!userChoice.equals("c")&&!userChoice.equals("f")){
            if(loop>0){
                System.out.print("Invalid choice. Please enter C or F: ");
                userChoice = "";
            }
            userChoice = userInput.nextLine();
            userChoice = userChoice.toLowerCase();
            loop++;
        }
        return userChoice.toLowerCase();
    }

    private String processInitialScale(String choice){
        if(choice.equals("c")){
            return "Fahrenheit";
        }
        else if(choice.equals("f")){
            return "Celsius";
        }
        else{
            return "Something went wrong!!!";
        }
    }

    private double processTempInput(){
        return userInput.nextDouble();
    }

    private double convertTemp(String choice, double initialTemp){
        if(choice.equals("c")){
            return (initialTemp - 32) * 5 / 9;
        }
        else if(choice.equals("f")){
            return (initialTemp * 9 / 5) + 32;
        }
        else{
            return 0;
        }
    }

    private String processFinalScale(String choice){
        if(choice.equals("c")){
            return "Celsius";
        }
        else if(choice.equals("f")){
            return "Fahrenheit";
        }
        else{
            return "Huh?";
        }
    }

    public static void main(String[] args){
        Solution18 tempCalculator = new Solution18();
        String finalScale;
        String initialScale;
        String choice;
        double initialTemp;
        double finalTemp;
        System.out.print("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.\n");
        System.out.print("Your choice: ");
        choice = tempCalculator.processChoiceInput();
        initialScale = tempCalculator.processInitialScale(choice);
        finalScale = tempCalculator.processFinalScale(choice);
        System.out.print("Please enter the temperature in " + initialScale + ": ");
        initialTemp = tempCalculator.processTempInput();
        finalTemp = tempCalculator.convertTemp(choice, initialTemp);
        System.out.printf("The temperature in %s is %.1f.%n", finalScale, finalTemp);

    }

}
