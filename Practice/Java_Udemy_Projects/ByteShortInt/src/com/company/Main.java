package com.company;

public class Main {

    public static void main(String[] args) {

        // int has a width of 32
	    int minInt = -2147483648;
        int maxInt = 2147483647;

        // byte has a width of 8
        byte minByte = -128;
        byte maxByte = 127;

        // short has a width of 16
        short minShort = -32768;
        short maxShort = 32767;

        // long has a width of 64
        long minLong = -9_223_372_036_854_775_808L;
        long maxLong = 9_223_372_036_854_775_807L;

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longTotal = 50000 + 10 * (byteValue + shortValue + intValue);
        long longTotal2 = 50000L + 10L * (byteValue + shortValue + intValue);

        short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));

        System.out.println("longTotal = " + longTotal);
        System.out.println("shortTotal = " + shortTotal);
    }
}
