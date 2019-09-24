package com.practice.sorts;

public class InsertionSort {

    public static void insertionSort(int[] array) {
        int shifts = 0;

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
            int current = array[firstUnsortedIndex];
            int i;

            for (i = firstUnsortedIndex; i > 0 && current <= array[i - 1]; i--) {
                array[i] = array[i - 1];

                shifts++;
            }

            array[i] = current;
        }

        System.out.println("shifts: " + shifts);
        Helpers.printArray(array);
    }


    public static void insertionSortRecursive(int[] array, int firstUnsortedIndex) {
        System.out.println("firstUnsortedIndex: " + firstUnsortedIndex);

        if (firstUnsortedIndex >= array.length) {
            System.out.println("Returning, firstUnsortedIndex: " + firstUnsortedIndex);
            return;
        }

        int current = array[firstUnsortedIndex];
        int i;

        for (i = firstUnsortedIndex; i > 0 && current <= array[i - 1]; i--) {
            array[i] = array[i - 1];

        }

        array[i] = current;

        Helpers.printArray(array);

        insertionSortRecursive(array, firstUnsortedIndex + 1);
    }

    public static void insertionSortRecursiveCourse(int[] array, int numItems) {

        if (numItems < 2) { // 1 item is sorted by definition
            return;
        }

        insertionSortRecursiveCourse(array, numItems - 1);

        int newElement = array[numItems - 1];

        int i;

        for (i = numItems - 1; i > 0 && array[i - 1] > newElement; i--) {
            array[i] = array[i - 1];
        }

        array[i] = newElement;


    }




    public static void insertionSortSwapAsc(int[] array) {

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
            int current = array[firstUnsortedIndex];

            for (int i = firstUnsortedIndex - 1; i >= 0; i--) {
                if (current < array[i]) {
                    Helpers.swap(array, i, i + 1);
                }
            }
        }
        Helpers.printArray(array);
    }

    public static void insertionSortSwapDesc(int[] array) {

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
            int current = array[firstUnsortedIndex];

            for (int i = firstUnsortedIndex - 1; i >= 0; i--) {
                if (current > array[i]) {
                    Helpers.swap(array, i, i + 1);
                }
            }
        }
        Helpers.printArray(array);
    }

}
