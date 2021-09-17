/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Davis
 */

/* Begin Pseudocode
*** Instantiate new instance of Solution09 class.
*** Instantiate new instance of Scanner class.
*** Declare constant for conversion factor (1 gallon = 350ft^2).
*** Prompt user for length and width of room to be painted.
*** Pass empty String variable to a method that returns the double value of the scanned information.
*** Pass length and width of the room to an area calculator method that returns a double for the area.
*** Pass the area to a method that converts this to the number of cans of paint that need to be bought (rounded up to the nearest can).
*** Return information to the user through the console.
End Pseudocode */

import java.util.Scanner;

public class Solution09 {
    static final double CONVERSION_FACTOR = 350;
    static final Scanner userInput = new Scanner(System.in);

    private double scanParse(){
        return Double.parseDouble(userInput.nextLine());
    }

    private double areaCalculator(double length, double width){
        return length * width;
    }

    private int paintGallons(double area){
        return (int) Math.ceil(area / CONVERSION_FACTOR);
    }

    public static void main(String[] args){

        Solution09 paintCalculator = new Solution09();
        int paintCans;
        double area;
        System.out.print("What is the length of the room? ");
        double length = paintCalculator.scanParse();
        System.out.print("What is the width of the room? ");
        double width = paintCalculator.scanParse();
        area = paintCalculator.areaCalculator(length, width);
        paintCans = paintCalculator.paintGallons(area);
        System.out.printf("You will need to purchase %d gallons of paint to cover %.2f square feet.", paintCans, area);
    }

}
