package com.company;


public class DoubleLetters {

    /*
    Edabit Challenge https://edabit.com/challenge/EaWY5d2pYBckrkAnS

    Create a function that takes a word and returns true if the word has two consecutive identical letters.

    Examples:
    doubleLetters("loop") ➞ true

    doubleLetters("yummy") ➞ true

    doubleLetters("orange") ➞ false

    doubleLetters("munchkin") ➞ false
    */

    public static boolean doubleLetters(String word) {

        for (int i = 0; i < word.length() - 1; i++) {

            if (word.charAt(i) == word.charAt(i + 1)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(doubleLetters("loop"));
        System.out.println(doubleLetters("yummy"));
        System.out.println(doubleLetters("orange"));
        System.out.println(doubleLetters("munchkin"));
    }
}
