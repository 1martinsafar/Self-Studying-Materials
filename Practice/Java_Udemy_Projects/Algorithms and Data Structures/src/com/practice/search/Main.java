package com.practice.search;

import com.practice.sorts.Helpers;
import com.practice.sorts.QuickSort;

public class Main {

    public static void main(String[] args) {


        int[] input = {20, 35, -15, 7, 55, 1, -22};

        QuickSort.quickSort(input, 0, input.length);
        Helpers.printArray(input);

        int[] input2 = {20, 35, -15, 7, 55, 1, -22, 77};

        QuickSort.quickSort(input2, 0, input2.length);
        Helpers.printArray(input2);

//        System.out.println(BinarySearch.binarySearchRecursive(input2, -22));
//        System.out.println(BinarySearch.binarySearchRecursive(input2, -15));
//        System.out.println(BinarySearch.binarySearchRecursive(input2, 1));
//        System.out.println(BinarySearch.binarySearchRecursive(input2, 7));
//        System.out.println(BinarySearch.binarySearchRecursive(input2, 20));
//        System.out.println(BinarySearch.binarySearchRecursive(input2, 35));
//        System.out.println(BinarySearch.binarySearchRecursive(input2, 55));
//        System.out.println(BinarySearch.binarySearchRecursive(input2, 77));
//
//        System.out.println(BinarySearch.binarySearchRecursive(input, -22));
//        System.out.println(BinarySearch.binarySearchRecursive(input, -15));
//        System.out.println(BinarySearch.binarySearchRecursive(input, 1));
//        System.out.println(BinarySearch.binarySearchRecursive(input, 7));
//        System.out.println(BinarySearch.binarySearchRecursive(input, 20));
//        System.out.println(BinarySearch.binarySearchRecursive(input, 35));
//        System.out.println(BinarySearch.binarySearchRecursive(input, 55));
//
//        System.out.println(BinarySearch.binarySearchRecursive(input, 99));
//        System.out.println(BinarySearch.binarySearchRecursive(input, -99));


//        System.out.println(BinarySearch.binarySearch(input, -22));
//        System.out.println(BinarySearch.binarySearch(input, -15));
//        System.out.println(BinarySearch.binarySearch(input, 1));
//        System.out.println(BinarySearch.binarySearch(input, 7));
//        System.out.println(BinarySearch.binarySearch(input, 20));
//        System.out.println(BinarySearch.binarySearch(input, 35));
//        System.out.println(BinarySearch.binarySearch(input, 55));
//
//        System.out.println(BinarySearch.binarySearch(input, 99));
//        System.out.println(BinarySearch.binarySearch(input, -99));
//
//        System.out.println(BinarySearch.binarySearch(input2, -22));
//        System.out.println(BinarySearch.binarySearch(input2, -15));
//        System.out.println(BinarySearch.binarySearch(input2, 1));
//        System.out.println(BinarySearch.binarySearch(input2, 7));
//        System.out.println(BinarySearch.binarySearch(input2, 20));
//        System.out.println(BinarySearch.binarySearch(input2, 35));
//        System.out.println(BinarySearch.binarySearch(input2, 55));
//
//        System.out.println(BinarySearch.binarySearch(input2, 99));
//        System.out.println(BinarySearch.binarySearch(input2, -99));


//        System.out.println(BinarySearch.binarySearchComments(input, -22));
//        System.out.println(BinarySearch.binarySearchComments(input, -15));
//        System.out.println(BinarySearch.binarySearchComments(input, 1));
//        System.out.println(BinarySearch.binarySearchComments(input, 7));
//        System.out.println(BinarySearch.binarySearchComments(input, 20));
//        System.out.println(BinarySearch.binarySearchComments(input, 35));
//        System.out.println(BinarySearch.binarySearchComments(input, 55));
//
//        System.out.println(BinarySearch.binarySearchComments(input, 99));
//        System.out.println(BinarySearch.binarySearchComments(input, -99));


//        System.out.println(LinearSearch.linearSearch(input, -22));
//        System.out.println(LinearSearch.linearSearch(input, -15));
//        System.out.println(LinearSearch.linearSearch(input, 1));
//        System.out.println(LinearSearch.linearSearch(input, 7));
//        System.out.println(LinearSearch.linearSearch(input, 20));
//        System.out.println(LinearSearch.linearSearch(input, 35));
//        System.out.println(LinearSearch.linearSearch(input, 55));
//
//        System.out.println(LinearSearch.linearSearch(input, 99));
//        System.out.println(LinearSearch.linearSearch(input, -99));


    }
}
