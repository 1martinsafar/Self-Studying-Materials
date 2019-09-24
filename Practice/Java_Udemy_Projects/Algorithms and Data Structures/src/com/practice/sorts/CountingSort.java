package com.practice.sorts;

public class CountingSort {

    public static void countingSort(int[] array, int min, int max) {
        int[] countArray = new int[(max - min) + 1];

        for (int i = 0; i < array.length; i++) {
            countArray[array[i] - min]++;
        }

        int sortedIndex = 0;
        for (int i = 0; i < countArray.length; i++) {
            int number = (i + min);
            int count = countArray[i];

            for (int j = 0; j < count; j++) {
                array[sortedIndex++] = number;
            }
        }
    }

    public static void countingSortCourse(int[] array, int min, int max) {

        int[] countArray = new int[(max - min) + 1];

        for (int i = 0; i < array.length; i++) {
            countArray[array[i] - min]++;
        }

        int j = 0;
        for (int i = min; i <= max; i++) {
            while (countArray[i - min] > 0) {
                array[j++] = i;
                countArray[i - min]--;
            }
        }
    }





    public static void countingSortConcise(int[] array, int min, int max) {
        int[] countArray = new int[(max - min) + 1];

        for (int i = 0; i < array.length; i++) {
            countArray[array[i] - min]++;
        }

        int sortedIndex = 0;
        for (int i = 0; i < countArray.length; i++) {
            for (int j = 0; j < countArray[i]; j++) {
                array[sortedIndex++] = i + min;
            }
        }
    }

    // range 1 - 10 => 10
    // 0 1 2 3 4 5 6 7  8 9
    // 2 5 9 8 2 8 7 10 4 3
    public static void countingSortComments(int[] array, int min, int max) {
        int[] countArray = new int[(max - min) + 1];

        for (int i = 0; i < array.length; i++) {
            System.out.println("i: " + i + ", array[i] - min: " + (array[i] - min));
            System.out.println("number: array[i]: " + array[i]);
            System.out.println("incrementing position: " + (array[i] - min));
            countArray[array[i] - min]++;
        }

        System.out.println("Counting array: ");
        Helpers.printArray(countArray);

        int sortedIndex = 0;
        for (int i = 0; i < countArray.length; i++) {
            int number = (i + min);
            int count = countArray[i];
            System.out.println("there are: " + count + " of " + number);
            for (int j = 0; j < count; j++) {
                System.out.println("> adding " + number + " #" + (j + 1));
                array[sortedIndex++] = number;
            }
            Helpers.printArray(array);
            System.out.println("sortedIndex after for: " + sortedIndex);
        }

        System.out.println("Sorted array: ");
        Helpers.printArray(array);
    }
}
