package com.practice.sorts;

public class RadixSort {

    // 4725 4586 1330 8792 1594 5729    // start    done
    // 1330 8792 1594 4725 4586 5729    // 1's      done
    // 4725 5729 1330 4586 8792 1594    // 10's     done
    // 1330 4586 1594 4725 5729 8792    // 100's    done
    // 1330 1594 4586 4725 5729 8792    // 1000's   done

    public static void radixSort(int[] array, int min, int max, int radix) {
        int width = String.valueOf(array[0]).length();
        int position = 1;

        for (int i = 0; i < width; i++) {
            CountingSortStable.countingSortStable(array, min, max, position, radix);
            position *= 10;
        }
    }

    public static void radixSortCourse(int[] input, int radix, int width) {
        for (int i = 0; i < width; i++) {
            radixSingleSort(input, i, radix);
        }
    }

    public static void radixSingleSort(int[] input, int position, int radix) {

        int numItems = input.length;
        int[] countArray = new int[radix];

        for (int value: input) {
            countArray[getDigit(position, value, radix)]++;
        }
        // Adjust the count array
        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }

        int[] temp = new int[numItems];
        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
            temp[--countArray[getDigit(position, input[tempIndex], radix)]] =
                    input[tempIndex];
        }

        for (int tempIndex = 0; tempIndex < numItems; tempIndex++) {
            input[tempIndex] = temp[tempIndex];
        }
    }

    public static void radixSortStrings(String[] input, int radix, int width) {
        for (int i = 0; i < width; i++) {
            radixSingleSortStrings(input, i, radix);
        }
    }

    public static void radixSingleSortStrings(String[] input, int position, int radix) {
        int numItems = input.length;
        int[] countArray = new int[radix];

        for (String value : input) {
            countArray[getLetterIndex(position, value)]++;
        }

        // Adjust the countArray
        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }

        String[] temp = new String[numItems];

        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
            int letterIndex = getLetterIndex(position, input[tempIndex]);
            temp[--countArray[letterIndex]] = input[tempIndex];
        }

        for (int tempIndex = 0; tempIndex < numItems; tempIndex++) {
            input[tempIndex] = temp[tempIndex];
        }
    }

    public static void radixSingleSortStringsComments(String[] input, int position, int radix) {
//        System.out.println("\nposition: " + position + "\n");

        int numItems = input.length;
        int[] countArray = new int[radix];

        for (String value : input) {
            countArray[getLetterIndex(position, value)]++;
        }
//        System.out.println("countArray initial:");
//        Helpers.printArray(countArray);

        // Adjust the countArray
        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }

//        System.out.println("countArray adjusted:");
//        Helpers.printArray(countArray);


        // bcdef dbaqc abcde omadd bbbbb    // start    done
        // bbbbb dbaqc omadd abcde bcdef    // 1's      done
        // bbbbb omadd abcde bcdef dbaqc    // 10's
        // omadd dbaqc bbbbb abcde bcdef    // 100's
        // dbaqc bbbbb abcde bcdef omadd    // 1000's
        // abcde bbbbb bcdef dbaqc omadd    // 10000's


        String[] temp = new String[numItems];
        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
            System.out.println("\n--------------------------------------------");
            System.out.println("tempIndex: " + tempIndex);
            int letterIndex = getLetterIndex(position, input[tempIndex]);
            System.out.println("letterIndex: " + letterIndex);
            int count = countArray[letterIndex];
            System.out.println("count: " + count + ", --count: " + (count - 1));
            temp[--countArray[letterIndex]] = input[tempIndex];

            System.out.println("> position: " + position + " temp:");
            Helpers.printArray(temp);

//          temp[--countArray[getDigit(position, input[tempIndex], radix)]] = input[tempIndex];
        }

        for (int tempIndex = 0; tempIndex < numItems; tempIndex++) {
            input[tempIndex] = temp[tempIndex];
        }
    }


    public static int getDigit(int position, int value, int radix) {
        return value / (int) Math.pow(radix, position) % radix;
    }

    // characters are actually numeric values under the covers
    // 'a' = 97 'A' = 65  // int ascii = (int) letter;
    public static int getLetterIndex(int position, String value) {
        // instead, we could change the singleSort call to start from position 4 so the charAt would take just the position
        char letter = value.charAt(value.length() - 1 - position);
        return letter - 'a';
    }


    public static void radixSortStringCourse(String[] input, int radix, int width) {
        for (int i = width - 1; i >= 0; i--) {
            radixSingleSortStringCourse(input, i, radix);
        }
    }

    public static void radixSingleSortStringCourse(String[] input, int position, int radix) {

        int numItems = input.length;
        int[] countArray = new int[radix];

        for (String value: input) {
            countArray[getIndex(position, value)]++;
        }
        // Adjust the count array
        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }

        String[] temp = new String[numItems];
        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
            temp[--countArray[getIndex(position, input[tempIndex])]] =
                    input[tempIndex];
        }

        for (int tempIndex = 0; tempIndex < numItems; tempIndex++) {
            input[tempIndex] = temp[tempIndex];
        }

    }

    // characters are actually numeric values under the covers
    public static int getIndex(int position, String value) {
        return value.charAt(position) - 'a';
    }


    public static void radixSortComments(int[] array, int min, int max, int radix) {
        int width = String.valueOf(array[0]).length();
        int position = 1;

        for (int i = 0; i < width; i++) {
            System.out.println("i: " + i + ", position: " + position);
            CountingSortStable.countingSortStableComments(array, min, max, position, radix);

            position *= 10;
        }
    }
}