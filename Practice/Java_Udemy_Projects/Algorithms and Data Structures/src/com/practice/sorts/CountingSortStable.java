package com.practice.sorts;

public class CountingSortStable {

    public static void countingSortStable(int[] array, int min, int max, int position, int radix) {

        // Extract the digits at the currently processed position
        int[] digitArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            digitArray[i] = (array[i] / position) % 10;
        }

        // Regular Counting Sort countArray
        int[] countArray = new int[(max - min) + 1];
        for (int i = 0; i < digitArray.length; i++) {
            countArray[digitArray[i] - min]++;
        }

        // Adjust the Counting Sort countArray for a STABLE sort - each value represents how many <= values there are
        for (int i = 1; i < countArray.length; i++) {
            countArray[i] += countArray[i - 1];
        }

        // Sort the array values based on the currently processed position
        int n = array.length;
        int[] tmp = new int[n];

        for (int k = n - 1; k >= 0; k--) {
            tmp[--countArray[getDigit(position, array[k], radix)]] = array[k];
        }

        // Copy the sorted array back to the original array
        for (int i = 0; i < tmp.length; i++) {
            array[i] = tmp[i];
        }
    }

    // input = array
    // 1330 8792 1594 4725 4586 5729
    public static void countingSortStableComments(int[] array, int min, int max, int position, int radix) {
        int[] digitArray = new int[array.length];
        // 3 9 9 2 8 2
        for (int i = 0; i < array.length; i++) {
            System.out.println((array[i] / position) % 10);
            digitArray[i] = (array[i] / position) % 10;
        }
        System.out.println("digitArray: ");
        Helpers.printArray(digitArray);


        int[] countArray = new int[(max - min) + 1];
        // 0 0 2 1 0 0 0 0 1 2
        for (int i = 0; i < digitArray.length; i++) {
            countArray[digitArray[i] - min]++;
        }
        System.out.println("countArray: ");
        Helpers.printArray(countArray);


        // Adjust the countArray to contain how many values <= the value
        // 0 0 2 3 3 3 3 3 4 6
        for (int i = 1; i < countArray.length; i++) {
            countArray[i] += countArray[i - 1];
        }
        System.out.println("Adjusted countArray: ");
        Helpers.printArray(countArray);

        int n = array.length;

        int[] tmp = new int[n];

        System.out.println("\n\n ===> Starting countingSortStable:");
        System.out.println("array:");
        Helpers.printArray(array);
        System.out.println("countArray:");
        Helpers.printArray(countArray);
        System.out.println("position: " + position + ", radix: " + radix);
        System.out.println("\n---------------------\n");

        for (int k = n - 1; k >= 0; k--) {
        System.out.println("k: " + k);
        System.out.println("array[k]: " + array[k]);
        System.out.println("getDigit(" + position + ", array[" + k + "], " + radix + ")");
        System.out.println("> getDigit: " + getDigit(position, array[k], radix));
        System.out.println("countArray[getDigit]: " + countArray[getDigit(position, array[k], radix)]);
            System.out.println("countArray: ");
            Helpers.printArray(countArray);
            tmp[--countArray[getDigit(position, array[k], radix)]] = array[k];
            System.out.println("tmp: ");
            Helpers.printArray(tmp);
        }

        System.out.println("tmp array:");
        Helpers.printArray(tmp);

        System.out.println("original array:");
        Helpers.printArray(array);

        for (int i = 0; i < tmp.length; i++) {
            array[i] = tmp[i];
        }

        System.out.println("changed array:");
        Helpers.printArray(array);
    }

    public static int getDigit(int position, int number, int radix) {
        return (number / position) % radix;
    }


}
