package com.company.hackerrank;

public class MinimumSwaps {


    static int minimumSwaps(int[] arr) {

        int swapCount = 0, index = 0;

        while (index < arr.length) {
            if (arr[index] != index + 1) {

                while (arr[index] != index + 1) {
                    int comp = 0;
                    comp = arr[arr[index] - 1];
                    arr[arr[index] - 1] = arr[index];
                    arr[index] = comp;
                    swapCount++;
                }
            }
            index++;
        }
        return swapCount;
    }

    static int countMinSwaps(int[] arr) {

        int swapCount = 0;

        for (int i = 0; i < arr.length - 1; i++) {

            int comp, minPos = i;

            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[minPos]) {
                    minPos = j;
                }
            }

            if (minPos != i) {
                comp = arr[minPos];
                arr[minPos] = arr[i];
                arr[i] = comp;
                swapCount++;
            }
        }
        return swapCount;
    }

    public static void main(String[] args) {

//        System.out.println(minimumSwaps(new int[]{4, 3, 1, 2})); // --> 3
//        System.out.println(minimumSwaps(new int[]{2, 3, 4, 1, 5})); // --> 3
//        System.out.println(minimumSwaps(new int[]{1, 3, 5, 2, 4, 6, 7})); // --> 3
        System.out.println(minimumSwaps(new int[]{2, 31, 1, 38, 29, 5, 44, 6, 12, 18, 39, 9, 48, 49, 13, 11, 7, 27, 14, 33, 50, 21, 46,
                23, 15, 26, 8, 47, 40, 3, 32, 22, 34, 42, 16, 41, 24, 10, 4, 28, 36, 30, 37, 35, 20, 17, 45, 43, 25, 19})); // --> 46

        System.out.println(countMinSwaps(new int[]{2, 31, 1, 38, 29, 5, 44, 6, 12, 18, 39, 9, 48, 49, 13, 11, 7, 27, 14, 33, 50, 21, 46,
                23, 15, 26, 8, 47, 40, 3, 32, 22, 34, 42, 16, 41, 24, 10, 4, 28, 36, 30, 37, 35, 20, 17, 45, 43, 25, 19})); // --> 46

        int[] intArray = {4, 3, 1, 2};
        int count = 0, comp = 0, temp = 0;
        boolean isSorted = true;

        for (int i = 0; i < intArray.length; i++) {

            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] > intArray[j]) {
                    comp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = comp;
                    count++;
//                    if (intArray[i] < intArray[i + 1] && isSorted) {
//                        isSorted = false;
//                    }
                }
            }
//            System.out.println(comp + " " + intArray[i]);
        }
//        System.out.println(count);

        for (int j : intArray) {
//            System.out.println(j);
        }
    }

}
