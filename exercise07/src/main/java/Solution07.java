/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Davis
 */

import java.util.Scanner;

/* Begin Pseudocode
*** Declare constant to store the conversion formula.
*** Declare variables to store intermediate information.
*** Prompt user for dimensions of room.
*** Pass dimensions to calculation method that returns area in square feet.
*** Pass the area of the room in square feet to conversion method that returns the area in square meters.
*** Print information to console.
End Pseudocode */

public class Solution07 {

    static final double CONVERSION_FACTOR = 0.09290304;

    public double areaCalculation(double length, double width){
        return length * width;
    }

    public double areaConversion(double area){
        return area*CONVERSION_FACTOR;
    }

    public static void main(String[] args){
        double area;
        double length;
        double width;
        String userInput;
        Scanner input = new Scanner(System.in);
        Solution07 calculator = new Solution07();
        System.out.print("What is the length of the room in feet? ");
        userInput = input.nextLine();
        length = Double.parseDouble(userInput);
        System.out.print("What is the width of the room in feet? ");
        userInput = input.nextLine();
        width = Double.parseDouble(userInput);
        area = calculator.areaCalculation(length, width);
        System.out.println("You entered dimensions of " + length + " feet by " + width + " feet.");
        System.out.printf("The area is%n%.2f square feet%n%.2f square meters", area, calculator.areaConversion(area));
    }

}
