package com.company;

public class StringSplit {

        /*
        https://edabit.com/challenge/jfRHGwHMZcnzZm9JL

        Write a function that takes a string, breaks it up and returns it with vowels first, consonants second.
        For any character that's not a vowel (like special characters or spaces), treat them like consonants.

        Examples:
        split("abcde") ➞ "aebcd"

        split("Hello!") ➞ "eoHll!"

        split("What's the time?") ➞ "aeieWht's th tm?"

        Notes:
        Vowels are a, e, i, o, u.
        Define a separate isVowel() function for easier to read code (recommendation).
         */

    public static String split(String str) {

        StringBuilder vowelStr = new StringBuilder();
        StringBuilder newStr = new StringBuilder();

        for (char c : str.toCharArray()) {

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelStr.append(c);
            } else {
                newStr.append(c);
            }
        }
        vowelStr.append(newStr);

        return vowelStr.toString();
    }

    public static void main(String[] args) {

        System.out.println(split("What's the time?"));
        System.out.println(split("abcde"));
        System.out.println(split("Hello"));



        StringBuilder vowelStr = new StringBuilder();
        StringBuilder newStr = new StringBuilder();
//        String s = "What's the time?";
        String s = "abcde";

        for (char c : s.toCharArray()) {

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelStr.append(c);
            } else {
                newStr.append(c);
            }
        }
        vowelStr.append(newStr);
//        System.out.println(vowelStr);
    }
}
