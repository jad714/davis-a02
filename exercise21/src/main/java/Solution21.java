/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Davis
 */

/* Begin Pseudocode
*** Instantiate new Scanner object.
*** Instantiate new Solution21 object.
*** Define int variable for userInput and String variable for the month.
*** Process input using dedicated int method.
*** Choose correct month corresponding to the correct value in a switch statement, return String in dedicated method that accepts an int parameter.
*** Process output in dedicated void method that accepts string parameter.
End Pseudocode */

import java.util.Scanner;

public class Solution21 {
    static final Scanner userInput = new Scanner(System.in);

    private int processInput(){
        int result = -1;
        int loop = 0;
        while(result < 1 || result > 12){
            if(loop > 0){
                System.out.print("Invalid selection. Please enter a number from 1 to 12: ");
            }
            result = Integer.parseInt(userInput.nextLine());
            loop++;
        }
        return result;
    }

    private String chooseMonth(int input){
        String month = "";
        switch(input){
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                System.out.println("!!! OUT OF RANGE ERROR !!!");
                System.exit(-1);
        }
        return month;
    }

    private void processOutput(String month){
        System.out.println("The name of the month is " + month + ".");
    }

    public static void main(String[] args){
        Solution21 monthSelect = new Solution21();
        int input;
        String month;
        System.out.print("Please enter the number of the month: ");
        input = monthSelect.processInput();
        month = monthSelect.chooseMonth(input);
        monthSelect.processOutput(month);
    }
}
