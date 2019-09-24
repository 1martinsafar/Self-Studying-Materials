package com.practice.search;

public class BinarySearch {

    public static int binarySearchIterativeCourse(int[] input, int value) {
        int start = 0;
        int end = input.length;

        while (start < end) {
            int midpoint = (start + end) / 2;
            System.out.println("midpoint = " + midpoint);
            if (input[midpoint] == value) {
                return midpoint;
            }
            else if (input[midpoint] < value) {
                start = midpoint + 1;
            }
            else {
                end = midpoint;
            }
        }

        return -1;
    }

    public static int recursiveBinarySearchCourse(int[] input, int value) {
        return recursiveBinarySearchCourse(input, 0, input.length, value);
    }

    public static int recursiveBinarySearchCourse(int[] input, int start, int end, int value) {
        if (start >= end) {
            return -1;
        }

        int midpoint = (start + end) / 2;
        System.out.println("midpoint = " + midpoint);

        if (input[midpoint] == value) {
            return midpoint;
        }
        else if (input[midpoint] < value) {
            return recursiveBinarySearchCourse(input, midpoint + 1, end, value);
        }
        else {
            return recursiveBinarySearchCourse(input, start, midpoint, value);
        }
    }

    public static int binarySearch(int[] input, int value) {
        int start = 0;
        int end = input.length; // int end = input.length -1;
        int mid;

        while (start < end) {
            mid = (start + end) / 2;

            if (input[mid] == value) {
                return mid;
            }
            if (input[mid] < value) {
                start = mid + 1;
            } else {
                end = mid; // end = mid - 1;
            }
        }

        return -1;
    }

    public static int binarySearchRecursive(int[] input, int value) {
        return binarySearchRecursive(input, value, 0, input.length);
    }

    public static int binarySearchRecursive(int[] input, int value, int start, int end) {
        if (start >= end) {
            return -1;
        }

        int mid = (start + end) / 2;
        //System.out.println("mid: " + mid + ", start: " + start + ", end: " + end);
        //System.out.println("input[" + mid + "]" + " = " + input[mid]);

        if (input[mid] == value) {
            return mid;
        }
        else if (input[mid] < value) {
            return binarySearchRecursive(input, value, mid + 1, end);
        }
        else {
            return binarySearchRecursive(input, value, start, mid );
        }
    }

    public static int binarySearchComments(int[] input, int value) {
        int start = 0;
        int end = input.length -1;
        int mid;
        int steps = 0;

        while (start < end) {
            mid = (start + end) / 2;
            System.out.println("mid: " + mid + ", start: " + start + ", end: " + end);
            steps++;

            if (input[mid] == value) {
                System.out.println("found the value, mid: " + mid + ", input[mid]: " + input[mid] + ", start: " + start + ", end: " + end);
                System.out.println("binary steps: " + steps);
                return mid;
            }
            if (input[mid] < value) {
                System.out.println("input[mid] < value, mid: " + mid + ", input[mid]: " + input[mid] + ", start: " + start + ", end: " + end);
                start = mid + 1;
            } else {
                System.out.println("input[mid] > value, mid: " + mid + ", input[mid]: " + input[mid] + ", start: " + start + ", end: " + end);
                end = mid - 1;
            }
        }

        mid = start;

        System.out.println("dropped out of while, mid: " + mid + ", input[mid]: " + input[mid] + ", start: " + start + ", end: " + end);
        System.out.println("binary steps: " + steps);
        return input[mid] == value ? mid : -1;
    }
}
