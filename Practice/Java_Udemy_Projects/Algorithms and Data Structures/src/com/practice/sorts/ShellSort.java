package com.practice.sorts;

public class ShellSort {

    // course
    public static int[] shellSortInsertionCourse(int[] array) {
        int shifts = 0;
        int newElementPositioned = 0;

        for (int gap = array.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < array.length ; i++) {
                int newElement = array[i];
                int j = i;

                while (j >= gap && array[j - gap] > newElement) {
                    array[j] = array[j - gap];
                    shifts++;
                    j -= gap;
                }

                newElementPositioned++;
                array[j] = newElement;
            }
        }

        System.out.println("newElementPositioned: " + newElementPositioned);
        System.out.println("course shell shifts: " + shifts);
        return array;
    }

    public static int[] shellSortInsertion(int[] array) {
        int shifts = 0;

        for (int gap = array.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < array.length; i++) {
                int newElement = array[i];
                int j;

                for (j = i; j >= gap && array[j - gap] > newElement; j -= gap) {
                    array[j] = array[j - gap];
                    shifts++;
                }

                array[j] = newElement;
            }
        }

        System.out.println("my shell shifts: " + shifts);
        return array;
    }

    public static int[] shellSortInsertionImproved2(int[] array) {
        int shifts = 0;
        int newElementPositioned = 0;

        for (int gap = array.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < array.length; i++) {
                int newElement = array[i];
                int j;

                for (j = i; j >= gap && array[j - gap] > newElement; j -= gap) {
                    array[j] = array[j - gap];
                    shifts++;
                }

                if (array[j] != newElement) {
                    array[j] = newElement;
                    newElementPositioned++;
                }
            }
        }

        System.out.println("newElementPositioned: " + newElementPositioned);
        System.out.println("my shell shifts: " + shifts);
        return array;
    }

    public static int[] shellSortInsertionComments(int[] array) {
        int shifts = 0;

        for (int gap = array.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < array.length; i++) {
                int newElement = array[i];

                int j;

                for (j = i; j >= gap && array[j - gap] > newElement; j -= gap) {
                    System.out.println("j: " + j + ", array[j]: " + array[j]);
                    System.out.println("j - gap: " + (j - gap) + ", array[j - gap]: " + array[j - gap]);
                    System.out.println("Putting: " + array[j - gap] + " instead of " + array[j]);
                    array[j] = array[j - gap];
                    shifts++;
                }

                System.out.println("Placing newElement: " + newElement + " instead of " + array[j] + " index: " + j);
                array[j] = newElement;
            }
        }

        Helpers.printArray(array);

        System.out.println("my shell shifts: " + shifts);
        return array;
    }

    // not replacing newElement when nothing shifts
    public static int[] shellSortInsertionImproved(int[] array) {
        int shifts = 0;
        int newElementPositioned = 0;

        for (int gap = array.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < array.length; i++) {
                int newElement = array[i];
                int j = i;

                int finalIndex = -1;

                for (j = j - gap; j >= 0 && array[j] > newElement; j = j - gap) {
                    finalIndex = j;
                    array[j + gap] = array[j];
                    shifts++;
                }

                if (finalIndex >= 0) {
                    newElementPositioned++;
                    array[finalIndex] = newElement;
                }
            }
        }

        System.out.println("newElementPositioned: " + newElementPositioned);
        System.out.println("my shell shifts: " + shifts);
        return array;
    }

    public static int[] shellSortInsertionImprovedComments(int[] array) {

        for (int gap = array.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < array.length; i++) {
                int j = i;
                int newElement = array[i];
                System.out.println("newElement: " + newElement);
                System.out.println("i: " + i);
                System.out.println("j: " + j);

                int finalIndex = -1;

                for (j = j - gap; j >= 0 && array[j] > newElement; j = j - gap) {
                    finalIndex = j;
                    System.out.println(">>> j: " + j);
                    System.out.println("array[j]: " + array[j]);
                    System.out.println("array[j + gap]: " + array[j + gap]);
                    System.out.println("Adding " + array[j] + " instead of " + array[j + gap]);
                    array[j + gap] = array[j];
                }

                if (finalIndex >= 0) {
                    System.out.println("finalIndex: " + finalIndex);
                    System.out.println("array[finalIndex]: " + array[finalIndex]);
                    array[finalIndex] = newElement;
                }


                Helpers.printArray(array);
            }

        }

        // gap = 1, performing an Insertion Sort
        InsertionSort.insertionSort(array);

        return array;
    }

    public static int[] shellSortInsertionTest(int[] array) {

        for (int gap = array.length / 2; gap > 1; gap /= 2) {

            for (int i = gap; i < array.length; i++) {
                int j = i;
                int newElement = array[i];
                System.out.println("newElement: " + newElement);
                System.out.println("i: " + i);
                System.out.println("j: " + j);

                System.out.println("j - gap: " + (j - gap));

                System.out.println("comparing index: " + (j - gap) + " with " + "newElement");

                if (array[j - gap] > newElement) {
                    System.out.println(array[j - gap] + " > " + newElement);
                    System.out.println("putting " + array[i] + " instead of " + array[j - gap]);
                    array[i] = array[j - gap];

                    if (j - gap > 0 && array[j - gap] > newElement) {
                        array[j] = array[j - gap];
                        array[j - gap] = newElement;
                        System.out.println("placing newElement instead of " + array[j - gap]);
                    } else {
                        array[j] = newElement;
                        System.out.println("placing newElement instead of " + array[j]);
                    }
                } else {
                    System.out.println("NOT doing anything, " + array[j - gap] + " <= " + newElement);
                }

                Helpers.printArray(array);
            }

        }

        // gap = 1, performing an Insertion Sort
        InsertionSort.insertionSort(array);

        return array;
    }

    public static int[] shellSortInsertionTest0(int[] array) {

        for (int gap = array.length / 2; gap > 1; gap /= 2) {

            for (int i = gap; i < array.length; i++) {
                int j = i;
                int newElement = array[i];

                if (array[j - gap] > newElement) {
                    array[i] = array[j - gap];

                    if (j - gap > 0 && array[j - gap] > newElement) {
                        array[j] = array[j - gap];
                        array[j - gap] = newElement;
                    } else {
                        array[j] = newElement;
                    }
                }

                Helpers.printArray(array);
            }

        }

        // gap = 1, performing an Insertion Sort
        InsertionSort.insertionSort(array);

        return array;
    }
}
