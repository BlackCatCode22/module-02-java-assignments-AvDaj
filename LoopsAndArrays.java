// aV 8/29/24
/*
* LoopsAndArrays.java
*
* This program will use the for loop to loop through
* a list of names stored in a string array.
*
*/

import java.util.Scanner;

public class LoopsAndArrays {
    public static void main(String[] args) {

        // Create a Scanner object for the user input.
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWelcome to my Friendly For Loop Program\n");

        // Create a for loops that displays 'Hello There!' five times

        // the loop control variable of this for loop
        // is names i (it means integer (whole number)).
        // this loop control variable must be: initialized, checked, and changed.
        for (int i = 0; i < 3; i++){
            System.out.println("The value of i is: " + i);

        }

        // Create a while loop that does the same thing.
        int loopControlVariable = 0;
        while (loopControlVariable < 3){
            System.out.println("The value of loopControlVariable is: " + loopControlVariable);
            // Change the loop control variable.
            loopControlVariable++;
        }

        // Create a String array of five words.
        //String[] names = new String[10];
        String[] names = {"one","two","three","four","five","six","seven","eight","nine","ten"};

        System.out.println("\nOne of our names is: " + names[4]);

        // Output the length of our array named name.
        System.out.println("\nThe length of our array 'names' is: " + names.length);

        // Create a for loop that outputs all element in the names array.
        for (int i = 0; i < (names.length); i++){
            System.out.println("names[" + i + "] = is... " + names[i]);
        }

        // Create an int array with 10 elements
        int[] myNumbers = new int[10];

        // Use a for loop to get ten whole numbers from the user.
        for (int i = 0; i < 10; i++){
        System.out.println("Please enter number " + (i+1) );
        myNumbers[i] = scanner.nextInt();
        }

        // Output the myNumbers[] array ..... with a for loop, using the length property
        for (int i = 0; i < myNumbers.length; i++){
            System.out.println("The value of myNumbers[" + i + "] is: " + myNumbers[i]);
        }

        System.out.println("\nThis is the end of our program!\n");


    }
}
