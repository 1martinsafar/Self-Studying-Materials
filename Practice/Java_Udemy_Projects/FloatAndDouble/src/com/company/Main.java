package com.company;

public class Main {

    public static void main(String[] args) {
        // width of int = 32 (4 bytes)
	    int myIntValue = 5;
	    // width of float = 32 (4 bytes)
	    float myFloatValue = 5f;
	    // width of double = 64 (8 bytes)
	    double myDoubleValue = 5d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        double pounds = 200d;
        double kilograms = pounds * 0.45359237d;
        System.out.println(pounds + " pounds = " + kilograms + " kilograms");

        double pi = 3.141_592_7d;
        double x = 1_123.456_5;
    }
}
