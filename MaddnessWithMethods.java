// aV 9/5/24
//
// MaddnessWithMethods.java
//
//
//

import java.util.Scanner;

public class MaddnessWithMethods {
    public static void main(String[] args) {
        System.out.println("\nWelcome to Maddness with Methods program!\n");

        int userInputNumber = 0;
        userInputNumber = getUserInput();
        System.out.println("\nThe user input the number: " + userInputNumber);

        // Find the largest of two ints
        int myFirstNum = 8;
        int mySecondNum = 4;
        int largest = 0;

        // Call the method names compareTwoInts()
        largest = compareTwoInts(myFirstNum, mySecondNum);
        System.out.println("\nThe largest of " + myFirstNum + " and " + mySecondNum + " is: " + largest);

        // Sum two ints!
        int theSumOfTwoInts = 0;
        theSumOfTwoInts = sumTwoInt(myFirstNum, mySecondNum);
        System.out.println("\nThe sum of " + myFirstNum + " and " + mySecondNum + " is: " + theSumOfTwoInts);

    }

    // Method to get an integer from the user
    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a integer: ");
        // Read the integer input from the user
        int userInput = scanner.nextInt();
        return userInput; // Return the input to the calling method
    }

    // Method to compare two integer and return the largest
    public static int compareTwoInts(int firstInt, int secondInt) {
        int largest = 0;
        if (firstInt > secondInt){
            largest = firstInt;
        }
        else {
            largest = secondInt;
        }
        return largest;
    }

    // Method to return the sum of the two int
    public static int sumTwoInt(int num1, int num2){
        int theSum = 0;
        theSum = num1 + num2;
        return theSum;
    }
}