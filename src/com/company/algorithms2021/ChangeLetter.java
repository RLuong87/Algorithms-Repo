package com.company.algorithms2021;

public class ChangeLetter {

    /*
    Edabit Challenge

    Write a function that changes every letter to the next letter:

            "a" becomes "b"
            "b" becomes "c"
            "d" becomes "e"
    and so on ...
    Examples
    move("hello") ➞ "ifmmp"

    move("bye") ➞ "czf"

    move("welcome") ➞ "xfmdpnf"
    */

    public static String move(String word) {

        char[] chars = word.toCharArray(); // Convert the string into a char array
        StringBuilder str = new StringBuilder(); // Use String builder to concatenate the new string
        int num = 1; // Initialize a variable and set it to 1
        // Based off the ASCII chart, we can add or subtract a number to a character,
        // and it'll return any character that is before or after the original character

        for (int i = 0; i < chars.length; i++) { // Loop through the chars array
            chars[i] += num; // add 1 to each character
        }
        for (char aChar : chars) { // For each loop through the new char array
            str.append(aChar); // append the results with String builder
        }
        return str.toString(); // Return the new string and using the to string method from the String builder class
    }

    public static void main(String[] args) {

        System.out.println(ChangeLetter.move("hello"));
        System.out.println(ChangeLetter.move("bye"));
        System.out.println(ChangeLetter.move("welcome"));
    }
}
