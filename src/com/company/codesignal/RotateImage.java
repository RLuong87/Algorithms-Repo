package com.company.codesignal;

import java.util.Arrays;

public class RotateImage {

    public static int[][] rotateImage(int[][] arr) {

        int[][] intArr = new int[arr.length][arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                intArr[j][i] = arr[i][j];
            }
        }
//        System.out.println(Arrays.deepToString(intArr));
        displayArray(intArr);
        return null;
    }

    public static void displayArray(int[][] l) {

        for (int[] arr : l) {
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {

        int[][] test = {{1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}};

        /*
        Expected output:
            [7, 4, 1]
            [8, 5, 2]
            [9, 6, 3]
         */

        displayArray(test);
        System.out.println("Returning new 2d array");
        System.out.println(Arrays.deepToString(rotateImage(test)));

//        List<List<Integer>> test = new ArrayList<>();
//        test.add(List.of(1, 2, 3));
//        test.add(List.of(4, 5, 6));
//        test.add(List.of(7, 8, 9));
//
//        for (int row = 0; row < test.get(0).size(); row++) {
//            System.out.println(test.get(row));
//            for (int col = 0; col < test.size(); col++) {
//                System.out.println(test.get(col).get(row));
//            }
//        }
//
//        for (int outer = 0; outer < test.size(); outer++) {
////            System.out.println("The outer index " + test.get(outer));
//            for (int inner = 0; inner < test.get(outer).size(); inner++) {
////                System.out.println("The inner index " + test.get(outer).get(inner));
//            }
//        }

//        System.out.println(Arrays.deepToString(rotateImage(test)));
    }
}
