// aV 9/3/24
//
// ForEachArrays.java
//
class ForEachArrays {
    public static void main(String[] args) {

        System.out.println("\nWelcome to me For : Each practice problem!\n");

        // Create and array of cars. Do this two different wats and be able to explain to
        // your lab partner.

        // Create a cars[] array using initialization
        String[] cars = {"NISSAN R34", "HONDA CIVIC", "PORSCHE 911"};

        // Output the cars array using a for each loop.

        for (int i = 0; i <= 2; i++){
            System.out.println(cars[i]);
        }
        System.out.println("\nMy for loop is done.\n");

        // Use a for : each loop to do the same thing.
        for (String dreamCars : cars){
            System.out.println(dreamCars);
        }

        // Create a String array using the new operator.
        // Create a 4 element String arrays named myCars.
        String[] myCars = new String[4];

        // myCars[0], myCars[1], myCars[2], myCars[3]

        // Fill the new ly created String[] array with data.
        myCars[0] = "\nHONDA CIVIC";
        myCars[1] = "\nNISSAN R34";
        myCars[2] = "\nPORSCHE 911";
        myCars[3] = "\nTOYOTA SUPRA\n";

        // Use a for : each loop to output the myCars[] each array
        for(String myDreamCar : myCars){
            System.out.println("\nThis is my dream cars: " + myDreamCar);
        }

        String[] myStrings = new String[6];


        // Use a for loop to fill the array with some strings
        for (int i = 0; i < 6; i++){
            // fill my array with string
            myStrings[i] = "this is string number: " + i;
        }


//        int aNum = 1;
//        for (String aStr : myStrings) {
//            // fill my array with strings
//            myStrings[aNum] = "this is a string number: " + (aNum + 1);
//            aNum++;
//        }

        // Now... use a for : each loop to output the myString[] array
        for (String aStr : myStrings){
            System.out.println("An element in myStrings[] is: " + aStr);
        }

        // Lets reverse a string.
        String myStrToReverse = "abcdefg";

        // Output the chars of myStrToReverse
        for (int i = 0; i < 7; i++){
            System.out.println("myStrToReverse[" + i + "] is; " + myStrToReverse.charAt(i));
        }
        System.out.println("End of initial output.");

        // Create the reverse string.
        String reverseStr = "";
        // Output reversedStr
        System.out.println("reveredStr before reversion loop is: " + reverseStr);

        for (int i = 6; i >= 0; i--){
            char charToAdd = myStrToReverse.charAt(i);
            reverseStr = reverseStr.concat(Character.toString(charToAdd));
        }
        // Output reversedStr
        System.out.println("reversedStr after reversion loop is: " + reverseStr);
    }
}