package com.practice.sorts;

public class QuickSort {

    // -22, j = 6
    // 35, i = 1
    // 1, j = 5
    // 55, i = 2


    // 20 35 -15 7 55 1 -22

    // -22 1 -15 7 55 55 35

    // -22 1 -15 7 20 55 35


    public static void quickSort(int[] array, int start, int end) {
        if (end - start <= 1) {
            return;
        }

        int i = start;
        int j = end;
        int pivot = array[i];

        while (i < j) {
            while (j > i) {
                --j;
                if (array[j] < pivot) {
                    array[i] = array[j];
                    break;
                }
            }
            while (i < j) {
                i++;
                if (array[i] > pivot) {
                    array[j] = array[i];
                    break;
                }
            }
        }
        array[i] = pivot;

        quickSort(array, start, i); // 0 - 4 on first call
        quickSort(array, i + 1, end); // 5 - 7 on first call
    }

    public static void quickSortCourse(int[] array, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int pivotIndex = partitionCourse(array, start, end);
        quickSortCourse(array, start, pivotIndex);
        quickSortCourse(array, pivotIndex + 1, end);

    }

    public static int partitionCourse(int[] array, int start, int end) {
        // Using the first element as the pivot
        int pivot = array[start];
        int i = start;
        int j = end;

        while (i < j) {

            // NOTE: empty loop body
            while (i < j && array[--j] >= pivot);
            if (i < j) {
                array[i] = array[j];
            }

            // NOTE: empty loop body
            while (i < j && array[++i] <= pivot);
            if (i < j) {
                array[j] = array[i];
            }
        }

        array[j] = pivot;
        return j;
    }

    public static void quickSortComments(int[] array, int start, int end) {

        if (end - start <= 1) {
            return;
        }

        int i = start;
        int j = end;
        int pivot = array[i];

        while (i < j) {
            while (j > i) { // j going down --j, searching from RIGHT for < pivot
                --j;
                if (array[j] < pivot) {
                    System.out.println("found < pivot, array[j]: " + array[j]
                            + " moving it to position: " + i);
                    array[i] = array[j];
                    break;
                }
            }
            while (i < j) { // i going up i++, searchinf from LEFT for > pivot
                i++;
                if (array[i] > pivot) {
                    System.out.println("found > pivot, array[i]: " + array[i]
                            + " moving it to position: " + j);
                    array[j] = array[i];
                    break;
                }
            }

            System.out.println(">>> one iteration, j = " + j + ", i = " + i);

            Helpers.printArray(array);
        }

        System.out.println("Adding pivot: " + pivot + " to position: " + i + " instead of " + array[i]);
        array[i] = pivot;
        Helpers.printArray(array);

        System.out.println("#finished");
        System.out.println("i: " + i + ", j: " + j);

        quickSortComments(array, start, i); // 0 - 4 on first call
        quickSortComments(array, i + 1, end); // 5 - 7 on first call
    }
}
