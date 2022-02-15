package com.company;

import java.util.*;

public class SherlockAndAnagrams {

     /*
        An anagram is a permutation only applicable to strings. It's a re-arrangement of the characters.
        Two strings are called an anagrammatic pair when they have the same length and the same set of characters.
     */

    public static int sherlockAndAnagrams(String s) {

        int count = 0, length = s.length();
        String str1 = s.substring(0, 3), str2 = s.substring(1);
        String str3 = s.substring(0, 2), str4 = s.substring(2);
        String str5 = s.substring(1, 2), str6 = s.substring(2, 3);

        // if each char in a position

        if (s.charAt(0) == s.charAt(length - 1)) count++;

        if (s.contains(str1) && s.contains(str2)) count++;

        if (s.contains(str3) && s.contains(str4)) count++;

        if (s.contains(str5) && s.contains(str6)) count++;


//        System.out.println(count);
        System.out.println(str1 + ", " + str2);
        System.out.println(str3 + ", " + str4);
        System.out.println(str5 + ", " + str6);
//        System.out.println(count2);
        return count;
    }

    public static void main(String[] args) {

        System.out.println(sherlockAndAnagrams("abba"));


        String str = "abba";


        char[] c = str.toCharArray();

        String s = "";
        int length = str.length(), count = 0;


        if (str.charAt(0) == str.charAt(length - 1)) {
            count++;
        }

//        if (str.substring(0, 2) == str.substring(1)) {
//            count++;
//        }

//        System.out.println(count);
//        System.out.println(str.substring(0, str.length() - 1));
        System.out.println(str.substring(0, 1));
//        System.out.println(str.charAt(0));
        System.out.println(str.substring(1));

    }
}
