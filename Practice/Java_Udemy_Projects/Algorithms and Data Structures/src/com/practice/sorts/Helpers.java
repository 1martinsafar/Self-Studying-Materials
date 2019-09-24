package com.practice.sorts;

public class Helpers {

    public static void printArray(int[] array) {

        System.out.println("=======================");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\n=======================");
    }

    public static void printArray(String[] array) {

        System.out.println("=======================");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\n=======================");
    }

    public static void swap(int[] array, int i, int j) {

        if (i == j) {
            return;
        }

        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
