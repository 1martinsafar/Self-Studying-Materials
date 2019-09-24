package com.company;

public class Main {

    public static void main(String[] args) {
	    // 1. byte
        // 2. short
        // 3. int
        // 4. long

        // 5. float
        // 6. double

        // 7. char

        // 8. boolean

        // 9. String

        String myString = "This is a string";
        System.out.println("myString is equal to: " + myString);

        myString = myString + ", and this is more.";
        System.out.println("myString is equal to: " + myString);

        myString = myString + "\u00A9 2019";
        System.out.println("myString is equal to: " + myString);

        String numberSting = "250.55";
        numberSting = numberSting + "49.95";
        System.out.println("numberSting is equal to: " + numberSting);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("lastString is equal to: " + lastString);

        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("lastString is equal to: " + lastString);
    }
}
