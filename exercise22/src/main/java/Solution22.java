/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Davis
 */

/* Begin Pseudocode
*** Instantiate a new Scanner object.
*** Instantiate a new Solution22 object.
*** Define an integer array that stores 3 values.
*** Call a function to fill up the array with 3 user defined values.
*** Pass the array to a method which checks each value for the max value and returns the max value.
*** Process the output in a dedicated method.
End Pseudocode */

import java.util.Scanner;

public class Solution22 {
    static final Scanner userInput = new Scanner(System.in);

    private void fillArray(int[] arr){
        for(int i=0;i<3;i++){
            if(i==0){
                System.out.print("Enter the first number: ");
            }
            else if(i==1){
                System.out.print("Enter the second number: ");
            }
            else{
                System.out.print("Enter the third number: ");
            }
            arr[i] = Integer.parseInt(userInput.nextLine());
        }
    }

    private int findMax(int[] arr){
        int max = arr[0];
        for(int i=0;i<3;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    private void processOutput(int max){
        System.out.println("The largest number is " + max + ".");
    }

    public static void main(String[] args){
        Solution22 compareNums = new Solution22();
        int[] arr;
        arr = new int[3];
        int max;
        compareNums.fillArray(arr);
        max = compareNums.findMax(arr);
        compareNums.processOutput(max);
    }
}
