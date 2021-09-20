/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Davis
 */

/* Begin Pseudocode
*** Instantiate new Scanner object.
*** Instantiate new Solution23 object.
*** Define input String variable (for response character).
*** Send this input to a method that processes correct output based on user input according to the given logic tree (refactored into a tree of methods).
End Pseudocode */

import java.util.Scanner;

public class Solution23{
    static final Scanner userInput = new Scanner(System.in);

    private void logicStarter(){
        System.out.print("Is the car silent when you turn the key? ");
        if((userInput.nextLine()).equals("y")){
            this.batteryQ();
        }
        else{
            this.logicSlicking();
        }
    }

    private void batteryQ(){
        System.out.print("Are the battery terminals corroded? ");
        if((userInput.nextLine()).equals("y")){
            System.out.println("Clean terminals and try starting again.");
            System.exit(0);
        }
        else{
            System.out.println("Replace cables and try again. ");
            System.exit(0);
        }
    }

    private void logicSlicking(){
        System.out.print("Does the car make a slicking noise? ");
        if((userInput.nextLine()).equals("y")){
            System.out.println("Replace the battery.");
            System.exit(0);
        }
        else{
            this.sparkPlugs();
        }
    }

    private void sparkPlugs(){
        System.out.print("Does the car crank up but fail to start? ");
        if((userInput.nextLine()).equals("y")){
            System.out.println("Check spark plug connections.");
            System.exit(0);
        }
        else{
            this.logicInjection();
        }
    }

    private void logicInjection(){
        System.out.print("Does the engine start and then die? ");
        if((userInput.nextLine()).equals("y")){
            System.out.print("Does your car have fuel injection? ");
            if((userInput.nextLine()).equals("y")){
                System.out.println("Get it in for service.");
                System.exit(0);
            }
            else{
                System.out.println("Check to ensure the choke is opening and closing.");
                System.exit(0);
            }
        }
        else{
            System.out.println("This should not be possible.");
            System.exit(0);
        }
    }

    public static void main(String[] args){
        Solution23 virtualMechanic = new Solution23();
        virtualMechanic.logicStarter();
    }
}
