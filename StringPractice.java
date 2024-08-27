// dH 8/27/24
// StringPractice.java


public class StringPractice {
    public static void main(String[] args) {

        System.out.println("\nWelcome to My String Practice Program !\n");

        // Creates a String object
        String myPracticeStr;
        myPracticeStr = "Hello from my string practice program !";

        System.out.println("\nmyPracticeStr is : " + myPracticeStr);

        // Use a few String methods
        // a method is a object-oriented language name for a function\
        // methods always have a pair of () attached to them
        //
        // Use the toLowerCase()
        String myNewStr = "";

        myNewStr = myPracticeStr.toUpperCase();

        // Prove it...
        System.out.println("myNewStr is: " + myNewStr);

        // toLowerCase
        myNewStr = myPracticeStr.toLowerCase();
        System.out.println("myNewStr is: " + myNewStr);

        // Use the length method
        // Create an int variable. because the length() method returns an int.
        int myInt = 0;

        // Find the length of our string object.

        myInt = myPracticeStr.length();
        // Prove it!
        System.out.println("\nThe length of " + myPracticeStr + "is " + myInt);

        // .contains()
        boolean isItThere;
        isItThere = myPracticeStr.contains("str");
        System.out.println("\nThe value of isItThere is:  " + isItThere);

        // charAt
        char myChar;
        int anotherInt = 4;
        myChar = myPracticeStr.charAt(5);
        // Output the result
        System.out.println("\nThe char at index " + anotherInt + " is " + myChar);

        // .indexOf
        int mySecondInt;

        mySecondInt = myPracticeStr.indexOf("str");
        System.out.println("\nThe index of Str is: " + mySecondInt);

        // .lastIndexOf
        int oneMoreInt;

        oneMoreInt = myPracticeStr.lastIndexOf("m");
        System.out.println("\noneMoreInt is: " + oneMoreInt);

        // SubString!!
        String myLastStringObject;

        myLastStringObject = myPracticeStr.substring(0,myPracticeStr.indexOf("str"));

        // Output that!
        System.out.println("\nmyLastStrObject is : " + myLastStringObject);


    }
}