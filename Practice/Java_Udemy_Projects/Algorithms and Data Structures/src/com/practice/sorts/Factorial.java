package com.practice.sorts;

public class Factorial {

    public static int factorialRecursive(int n) {
        if (n < 0) {
            System.out.println("Invalid input: " + n);
            return -1;
        }

        if (n == 0) {
            return 1;
        }

        return n * factorialRecursive(n - 1);
    }

    public static int factorialIterative(int n) {
        if (n < 0) {
            System.out.println("Invalid input: " + n);
            return -1;
        }

        if (n == 0) {
            return 1;
        }

        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
