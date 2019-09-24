package com.practice.sorts;

public class SelectionSort {

    // my own
    public static int[] selectionSort(int[] array) {

        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;

            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (array[i] > array[largest]) {
                    largest = i;
                }
            }

            Helpers.swap(array, largest, lastUnsortedIndex);
        }

        Helpers.printArray(array);

        return array;
    }
}
