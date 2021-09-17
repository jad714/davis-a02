/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Davis
 */

/*Begin Pseudocode*/

// integer method to return retirement year
// accepts current year, current age, and desired retirement age

// integer method to return how many years until retirement
// accepts current year, current age, and desired retirement age

// import LocalDate and Scanner for use with program
// instantiate a new Solution06 object since we will need it to access methods
// instantiate scanner object
// use appropriate method call to sync system time at runtime with LocalDate variable
// declare and initialize necessary variables
// prompt user for age input and store
// prompt user for desired retirement input and store
// convert string input to integer
// print number of years to retirement, implicitly calling necessary methods
// print current year, and expected retirement year
/*End Pseudocode*/
import java.time.LocalDate;
import java.util.Scanner;



public class Solution06 {

    public int retirementArithmetic(int year, int currentAge, int retirementReference){
        return  year + (retirementReference-currentAge);

    }

    public int yearsToRetire(int year, int retirementYear){
        return retirementYear-year;
    }

    public static void main(String[] args){
        Solution06 solution = new Solution06();
        Scanner input = new Scanner(System.in);
        LocalDate today = LocalDate.now();
        int year = today.getYear();
        int currentAge;
        int retirementReference;
        System.out.print("What is your current age? ");
        String age = input.nextLine();
        currentAge = Integer.parseInt(age);
        System.out.print("At what age would you like to retire? ");
        String retirement = input.nextLine();
        retirementReference = Integer.parseInt(retirement);
        System.out.println("You have " + solution.yearsToRetire(year, solution.retirementArithmetic(year, currentAge, retirementReference)) + " years left until you can retire.");
        System.out.println("It's " + today.getYear() + ", so you can retire in " + solution.retirementArithmetic(year, currentAge, retirementReference) + ".");




    }

}
