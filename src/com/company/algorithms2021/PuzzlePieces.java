package com.company;

import java.util.ArrayList;
import java.util.List;

public class PuzzlePieces {

    /*
    Edabit Challenge

    Write a function that takes two arrays and adds the first element in the first array with the first element in the second array,
    the second element in the first array with the second element in the second array, etc., etc.
    Return true if all element combinations add up to the same number. Otherwise, return false.

    Examples
    puzzlePieces([1, 2, 3, 4], [4, 3, 2, 1]) ➞ true
    1 + 4 = 5;  2 + 3 = 5;  3 + 2 = 5;  4 + 1 = 5
    Both arrays sum to [5, 5, 5, 5]

    puzzlePieces([1, 8, 5, 0, -1, 7], [0, -7, -4, 1, 2, -6]) ➞ true

    puzzlePieces([1, 2], [-1, -1]) ➞ false

    puzzlePieces([9, 8, 7], [7, 8, 9, 10]) ➞ false
    */

    public static boolean puzzlePieces(int[][] n) {

        for (int i = 0; i < n.length; i++) {

        }
        return true;
    }

    public static void main(String[] args) {

        List<Integer> numArray = new ArrayList<>();
        int[][] numbers = {{1, 2, 3, 4}, {4, 3, 2, 1}};
        boolean sum = true;
        int[] num1 = new int[0];
        int[] num2 = new int[0];
        int[] numTotal = new int[0];

        for (int i = 0; i < numbers.length; i++) {
            num1 = numbers[0];
            num2 = numbers[1];
//            System.out.println(Arrays.toString(num1));
//            System.out.println(Arrays.toString(num2));
//            System.out.println((Arrays.toString(num1) + Arrays.toString(num2)));
        }
//        System.out.println(Arrays.toString(num1) + " " + Arrays.toString(num2));
        for (int i = 0; i < num1.length; i++) {

            numArray.add(num1[i] + num2[i]);
        }
        System.out.println(numArray);

        for (Integer integer : numArray) {
            System.out.println(integer);
        }
    }
}
