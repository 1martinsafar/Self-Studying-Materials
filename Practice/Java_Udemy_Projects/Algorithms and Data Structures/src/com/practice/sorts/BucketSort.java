package com.practice.sorts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {

    public static void bucketSortCourse(int[] input) {
        List<Integer>[] buckets = new List[10];

        for (int i = 0; i < buckets.length; i++) {
            // using linked lists for the buckets
            //buckets[i] = new LinkedList<Integer>();

            // using arraylists as the buckets
            buckets[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < input.length; i++) {
            buckets[hash(input[i])].add(input[i]);
        }

        for (List bucket: buckets) {
            Collections.sort(bucket);
        }

        int j = 0;
        for (int i = 0; i < buckets.length; i++) {
            for (int value : buckets[i]) {
                input[j++] = value;
            }
        }
    }

    // A very simple Bucket Sort, works with ints except for 0.
    public static void bucketSort(int[] array) {
        int[][] bucket = new int[10][10];

        // Scattering Phase
        for (int i = 0; i < array.length; i++) {
            bucket[hash(array[i])][i] = array[i];
        }

        // Sorting Phase
        for (int i = 0; i < bucket.length; i++) {
            InsertionSort.insertionSort(bucket[i]);
        }

        // Gathering Phase
        int originalIndex = 0;
        for (int i = 0; i < bucket.length; i++) {
            for (int j = 0; j < bucket[i].length; j++) {
                if (bucket[i][j] != 0) {
                    array[originalIndex++] = bucket[i][j];
                }
            }
        }
    }

    public static int hash(int x) {
        System.out.println("x / 2 = " + (x / 10));
        return x / 10;
    }
}
