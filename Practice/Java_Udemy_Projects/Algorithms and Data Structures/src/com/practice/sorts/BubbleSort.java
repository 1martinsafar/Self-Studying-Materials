package com.practice.sorts;

public class BubbleSort {

    public static void bubbleSortCourse(int[] array) {
        for (int lastUnsortedIndex = array.length -1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (array[i] > array[i + 1]) {
                    Helpers.swap(array, i, i + 1);
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    // my own
    public static int[] bubbleSort(int[] myArray) {
        int lastUnsortedIndex = myArray.length - 1;
        int stepsCount = 0;
        int swapsCount = 0;
        boolean swap;

        while (lastUnsortedIndex > 0) {
            swap = false;
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (myArray[i] > myArray[i + 1]) {
                    Helpers.swap(myArray, i, i+1);

                    swapsCount++;
                    swap = true;
                }
                stepsCount++;
            }

            if (!swap) {
                break;
            }

            lastUnsortedIndex--;
        }

        System.out.println("steps count: " + stepsCount);
        System.out.println("swaps count: " + swapsCount);
        System.out.println("sorted array:");

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

        return myArray;
    }
}


