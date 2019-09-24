package com.practice.sorts;

import com.practice.heaps.MaxHeap;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array1 = {20, 35, -15, 7, 55, 1, -22};
        int[] array2 = {2, 1, 3, 4, 5, 6, 7};
        int[] array3 = {1, 2, 3, 4, 5, 6, 7};

        int[] array4 = new int[100];

        int j = 0;
        for (int i = 99; i >= 0; i--) {
            array4[j] = i;
            j++;
        }

        int[] array5 = new int[100];

        int x = 0;
        for (int i = 99; i >= 0; i--) {
            array5[x] = i;
            x++;
        }

        int[] array6 = new int[100];

        for (int i = 99; i >= 0; i--) {
            array6[i] = i;
        }

        int[] array7 = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};

        int[] array8 = {4725, 4586, 1330, 8792, 1594, 5729};

        String[] array9 = {"bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};
        String[] array10 = {"g", "f", "e", "d", "a", "b", "c", "x", "a"};

        int[] array11 = {54, 46, 83, 66, 95, 92, 43};

//        int[] x = {10,20,30,40,50};
//        System.out.println("test");
//        Helpers.printArray(test);
//
//        int temp;
//        for (int i = 0; i < input.length; i++) {
//            if (i == (input.length - 1 - i)) {
//            input[i] = input[input.length - 1 - i];
//            input[input.length - 1 - i] = temp;
//        }
//        System.out.println("done:");
//        Helpers.printArray(input);


//        // Heap Sort
//
//        MaxHeap heap = new MaxHeap(10);
//
//        heap.insert(80);
//        heap.insert(75);
//        heap.insert(60);
//        heap.insert(68);
//        heap.insert(55);
//        heap.insert(40);
//        heap.insert(52);
//        heap.insert(67);
//
//        heap.sort();
//        heap.printHeap();


        // Bucket Sort Course
//        BucketSort.bucketSortCourse(array11);
//        Helpers.printArray(array11);


        // Bucket Sort
//        BucketSort.bucketSort(array11);



        // Challenges //////////////////////////////////////////////////////////

//        RadixSort.radixSortStrings(array9, 26, 5);
//        Helpers.printArray(array9);
        //RadixSort.radixSortStrings(array10, 26, 1);

//        InsertionSort.insertionSortRecursiveCourse(array1, array1.length);
//        Helpers.printArray(array1);
//        InsertionSort.insertionSortRecursive(array1, 1);

//        MergeSort.mergeSortDesc(array1, 0, array1.length);
//        Helpers.printArray(array1);

        // Challenges //////////////////////////////////////////////////////////



//        Arrays.sort(array8);
//        Arrays.parallelSort(array8);

//        RadixSort.radixSortComments(array8, 0, 9, 10);

//        CountingSort.countingSortCourse(array7, 1, 10);
//        Helpers.printArray(array7);
//        CountingSort.countingSortComments(array4, 0, 99);
//        Helpers.printArray(array8);
//        CountingSort.countingSortComments(array7, 1, 10);
//        Helpers.printArray(array7);

//        QuickSort.quickSortCourse(array1, 0, array1.length);
//        QuickSort.quickSortCourse(array4, 0, array4.length);
//        Helpers.printArray(array1);
//        Helpers.printArray(array4);
//        QuickSort.quickSort(array1, 0, array1.length);
//        QuickSort.quickSort(array4, 0, array4.length);
//        Helpers.printArray(array1);
//        Helpers.printArray(array4);

//        MergeSort.mergeSort(array4, 0, array4.length);
//        System.out.println("DONE, sorted:");
//        Helpers.printArray(array4);
//
//        MergeSort.mergeSort(array1, 0, array1.length);
//        System.out.println("DONE, sorted:");
//        Helpers.printArray(array1);

//        int factorial5 = Factorial.factorialRecursive(5);
//        System.out.println("factorial 5: " + factorial5);
//
//        System.out.println(Factorial.factorialRecursive(0));
//        System.out.println(Factorial.factorialRecursive(1));
//        System.out.println(Factorial.factorialRecursive(2));
//        System.out.println(Factorial.factorialRecursive(3));
//        System.out.println(Factorial.factorialRecursive(-99));
//
//        System.out.println(Factorial.factorialIterative(0));
//        System.out.println(Factorial.factorialIterative(1));
//        System.out.println(Factorial.factorialIterative(2));
//        System.out.println(Factorial.factorialIterative(3));
//        System.out.println(Factorial.factorialIterative(-99));

//        ShellSort.shellSortInsertionImproved2(array4);
//        ShellSort.shellSortInsertionImproved(array4);     // shifts: 228 + 32 = 260 total
//        ShellSort.shellSortInsertionCourse(array5);       // shifts: 260 total
//
//        InsertionSort.insertionSortSwapAsc(array1);
//        InsertionSort.insertionSortSwapDesc(array1);
//        InsertionSort.insertionSort(array1);
//        InsertionSort.insertionSort(array4);              // shifts: 4950 total
//
//        SelectionSort.selectionSort(array1);
//
//        BubbleSort.bubbleSort(array1);
//        BubbleSort.bubbleSortCourse(array1);

//        int[] input = [1,2,3,4,5,]
//        int[] tmp = [];
//
//        for (int i = 0; i < input.length; i++) {
//            int count = 0;
//            for (int j = 0; j < temp.length; j++) {
//                if (input[i] == input[j]) then count++
//                if (count > 1) {
//                    print(input[i])
//                }
//            }
//        }

    }
}
