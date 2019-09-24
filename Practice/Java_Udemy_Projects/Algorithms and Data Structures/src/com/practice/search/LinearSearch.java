package com.practice.search;

public class LinearSearch {

    public static int linearSearch(int[] input, int value) {
        int steps = 0;

        for (int i = 0; i < input.length; i++) {
            steps++;
            if (input[i] == value) {
                System.out.println("linear steps: " + steps);
                return i;
            }
        }

        System.out.println("linear steps: " + steps);
        return -1;
    }
}
