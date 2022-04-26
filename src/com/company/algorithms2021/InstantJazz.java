package com.company;

import java.util.Arrays;

public class InstantJazz {


    /*
    Edabit Challenge

    Create a function which concatenates the number 7 to the end of every chord in an array.
    Ignore all chords which already end with 7.

    Examples:
    jazzify(["G", "F", "C"]) ➞ ["G7", "F7", "C7"]

    jazzify(["Dm", "G", "E", "A"]) ➞ ["Dm7", "G7", "E7", "A7"]

    jazzify(["F7", "E7", "A7", "Ab7", "Gm7", "C7"]) ➞ ["F7", "E7", "A7", "Ab7", "Gm7", "C7"]

    jazzify([]) ➞ []

    Notes:
    Return an empty array if the given array is empty.
    You can expect all the tests to have valid chords.
    */

    public static String[] jazzify(String[] arr) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].matches(".*\\d.*")) {
                return arr;
            }
            if (!arr[i].matches(".*\\d.*")) {
                arr[i] += "7";
            } else {
                return new String[0];
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        String[] strings = {"F7", "E7", "A7", "Ab7", "Gm7", "C7"};
        System.out.println(Arrays.toString(jazzify(strings)));
        System.out.println(Arrays.toString(jazzify(new String[]{"G", "F", "C", "E", "N", "Q"})));
        System.out.println(Arrays.toString(jazzify(new String[0])));
    }
}
