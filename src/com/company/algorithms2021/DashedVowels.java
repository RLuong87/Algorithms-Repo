package com.company.algorithms2021;

public class DashedVowels {

    /*
    Edabit Challenge

    Create a function that takes a string and returns dashes on both sides of every vowel (a e i o u).

    Examples:
    dashed("Edabit") ➞ "-E-d-a-b-i-t"

    dashed("Carpe Diem") ➞ "C-a-rp-e- D-i--e-m"

    dashed("Fight for your right to party!") ➞ "F-i-ght f-o-r y-o--u-r r-i-ght t-o- p-a-rty!"

    Notes:
    A string can contain uppercase and lowercase vowels.
    Y is not considered a vowel.
    */

    public static String dashed(String s) {

        char[] sChar = s.toCharArray();

        for (int i = 0; i < sChar.length; i++) {

        }
        return "";
    }

    public static void main(String[] args) {

        String str = "gladiator";  // your input string
        str = str.replaceAll("([aeiou])", "$1-");
        System.out.println(str);
    }
}
