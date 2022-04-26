package com.company.algorithms2021;

public class SevenBoom {

    /*
    https://edabit.com/challenge/CKqfEowjmSTw2jsso

    Create a function that takes an array of numbers and return "Boom!" if the digit 7 appears in the array.
    Otherwise, return "there is no 7 in the array".

    Examples:
    sevenBoom([1, 2, 3, 4, 5, 6, 7]) ➞ "Boom!"
    // 7 contains the number seven.

    sevenBoom([8, 6, 33, 100]) ➞ "there is no 7 in the array"
    // None of the items contain 7 within them.

    sevenBoom([2, 55, 60, 97, 86]) ➞ "Boom!"
    // 97 contains the number seven.
     */

    public static String sevenBoom(int[] arr) {

        for (int num : arr) {
            String str = String.valueOf(num);

            if (str.contains("7")) {
                return "BOOM!";
            }
        }
        return "there is no 7 in the array";
    }

    public static void main(String[] args) {

        int[] numbers = {2, 55, 60, 97, 86};
        System.out.println(sevenBoom(numbers));
        String[] strArr = new String[numbers.length];

        String boom = "";

        for (int i = 0; i < numbers.length; i++) {
            String str = String.valueOf(numbers[i]);
            strArr[i] = str;
            if (strArr[i].contains("7")) {
                boom += "Boom!";
            } else {
                boom += "there is no 7 in the array";
            }
        }
//            System.out.println(boom);

    }
}
