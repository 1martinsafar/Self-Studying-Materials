package com.practice.sorts;

public class MergeSort {

    public static void mergeSort(int[] array, int start, int end) {

        // Splitting Phase
        if (end - start <= 1) {
            return;
        }

        int mid = (start + end) / 2;
        mergeSort(array, start, mid);
        mergeSort(array, mid, end);

        // Merging Phase
        merge(array, start, mid, end);
    }

    public static void mergeSortDesc(int[] array, int start, int end) {
        // Splitting Phase
        if (end - start <= 1) {
            return;
        }

        int mid = (start + end) / 2;
        mergeSortDesc(array, start, mid);
        mergeSortDesc(array, mid, end);

        // Merging Phase
        mergeDesc(array, start, mid, end);
    }



    public static void merge(int[] array, int start, int mid, int end) {
        // this IF is 1 optimization from the course
        if (array[mid - 1] <= array[mid]) {
            return;
        }

        int[] tmp = new int[end - start];

        int i = start;
        int j = mid;
        int tmpIndex = 0;

        while (i < mid && j < end) {
            if (array[i] <= array[j]) {
                tmp[tmpIndex++] = array[i];
                i++;
            } else {
                tmp[tmpIndex++] = array[j];
                j++;
            }
        }

        // One of the arrays is now processed, add the remaining elements of the unprocessed array to the tmp
        while (i < mid) {
            tmp[tmpIndex++] = array[i];
            i++;
        }

        while (j < end) {
            tmp[tmpIndex++] = array[j];
            j++;
        }

        // Replacing the appropriate section of our array with the tmp values
        for (int x = 0; x < tmp.length; x++) {
            array[start] = tmp[x];
            start++;
        }
    }

    public static void mergeCourse(int[] array, int start, int mid, int end) {
        if (array[mid - 1] <= array[mid]) {
            return;
        }

        int[] tmp = new int[end - start];

        int i = start;
        int j = mid;
        int tmpIndex = 0;

        while (i < mid && j < end) {
            tmp[tmpIndex++] = array[i] <= array[j] ? array[i++] : array[j++];
        }

        System.arraycopy(array, i, array, start + tmpIndex, mid - i);
        System.arraycopy(tmp, 0, array, start, tmpIndex);
    }

    public static void mergeDesc(int[] array, int start, int mid, int end) {
        System.out.println("start: " + start + ", end: " + end);
        // this IF is 1 optimization from the course
        if (array[mid - 1] >= array[mid]) {
            //System.out.println("array[mid - 1]: " + array[mid - 1] + " <= array[mid]: " + array[mid]);
            System.out.println("> a split done, returning");
            return;
        }

        int[] tmp = new int[end - start];

        int i = start;
        int j = mid;
        int tmpIndex = 0;

        while (i < mid && j < end) {
            System.out.println("array[i]: " + array[i] + ", array[j]: " + array[j]);
            if (array[i] >= array[j]) {
                System.out.println("adding: " + array[i]);
                tmp[tmpIndex++] = array[i];
                i++;
            } else {
                System.out.println("adding: " + array[j]);
                tmp[tmpIndex++] = array[j];
                j++;
            }
        }

        // One of the arrays is now processed, add the remaining elements of the unprocessed array to the tmp
        while (i < mid) {
            System.out.println("adding array[i]: " + array[i]);
            tmp[tmpIndex++] = array[i];
            i++;
        }

        while (j < end) {
            System.out.println("adding array[j]: " + array[j]);
            tmp[tmpIndex++] = array[j];
            j++;
        }

        // Replacing the appropriate section of our array with the tmp values
        for (int x = 0; x < tmp.length; x++) {
            array[start] = tmp[x];
            start++;
        }

        System.out.println("tmp:");
        Helpers.printArray(tmp);
        System.out.println("array:");
        Helpers.printArray(array);
    }

    public static void mergeDescCourse(int[] array, int start, int mid, int end) {
        if (array[mid - 1] >= array[mid]) {
            return;
        }

        int[] tmp = new int[end - start];

        int i = start;
        int j = mid;
        int tmpIndex = 0;

        while (i < mid && j < end) {
            tmp[tmpIndex++] = array[i] >= array[j] ? array[i++] : array[j++];
        }

        System.arraycopy(array, i, array, start + tmpIndex, mid - i);
        System.arraycopy(tmp, 0, array, start, tmpIndex);
    }




    // starts:      0 0 1 3 3 5
    // ends:        7 3 3 7 5 7
    // mids:        3 1 2 5 4 6

    // #1   20 35 -15 7 55 1 -22    yes

    // #2   20 35 -15               yes
    // #3   20                      yes
    // #4   35 -15                  yes
    // #5   35                      yes
    // #6   -15                     yes

    // #7   7 55 1 -22              yes
    // #8   7 55                    yes
    // #9   7                       yes
    // #10  55                      yes
    // #11  1 -22                   yes
    // #12  1                       yes
    // #13  -22                     yes

    // => Splitting phase CORRECT!

    public static void mergeSortComments(int[] array, int start, int end) {

        // Splitting Phase

        if (end - start <= 1) {
//            System.out.println(">>> STOPPING");
//            System.out.println("start: " + start);
//            System.out.println("end: " + end);
//            System.out.println("mid: " + ((start + end) / 2));
//
//            System.out.println("=> " + array[start]);
//            System.out.println("=============================");
            return;
        }

        int mid = (start + end) / 2;
//        System.out.println("start: " + start);
//        System.out.println("end: " + end);
//        System.out.println("mid: " + mid);

//        System.out.println("=============================");
//        System.out.println("current values:");
//        for (int i = start; i < end; i++) {
//            System.out.println(array[i]);
//        }
//        System.out.println("=============================");


//        System.out.println("next split: " + start + " - " + mid + " | " + (mid) + " - " + end + "\n");
        mergeSortComments(array, start, mid);
        mergeSortComments(array, mid, end);



        // Merging Phase

        System.out.println("\n========= MERGE START =========");

        System.out.println("current values:");
        for (int i = start; i < end; i++) {
            System.out.println(array[i]);
        }

        int length = end - start;
        System.out.println("length: " + length);

        int[] tmp = new int[length];

        int i = start;
        int j = mid;
        int tmpIndex = 0;

        System.out.println("i: " + i + ", mid: " + mid);
        System.out.println("j: " + j + ", end: " + end);
        while (i < mid && j < end) {
            if (array[i] <= array[j]) {
                System.out.println("adding: " + array[i]);
                tmp[tmpIndex] = array[i];
                tmpIndex++;
                i++;
            } else {
                System.out.println("adding: " + array[j]);
                tmp[tmpIndex] = array[j];
                tmpIndex++;
                j++;
            }
        }

        System.out.println("End of one array, i: " + i + ", j: " + j);

        if (i < mid) {
            System.out.println("#1 i < j");
            while (i < mid) {
                System.out.println("adding: " + array[i]);
                tmp[tmpIndex] = array[i];
                tmpIndex++;
                i++;
            }
        } else {
            System.out.println("#2 j < i");
            while (j < end) {
                System.out.println("adding: " + array[j]);
                tmp[tmpIndex] = array[j];
                tmpIndex++;
                j++;
            }
        }

        System.out.println("tmp values:");
        for (i = 0; i < tmp.length; i++) {
            System.out.println(tmp[i]);
        }
        System.out.println("=============================");

        System.out.println("start: " + start);
        System.out.println("end: " + end);

        for (int x = 0; x < tmp.length; x++) {
            System.out.println("x: " + x);
            array[start] = tmp[x];
            start++;
        }

        System.out.println("Replaced the array part with tmp");
        System.out.println("Whole array now:");
        Helpers.printArray(array);

        System.out.println("========= MERGE completed ========= ");

    }
}
