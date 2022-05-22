package com.company.hackerrank.hackerrankwarmups;

public class RepeatedString {

    public static long repeatedString(String s, long n) {

        long count = 0, index = 0;

        StringBuilder str = new StringBuilder();

        while (s.length() < n) {
            str.append(s);
            if (str.charAt((int) index) == 'a') {
                count++;
            }
//            System.out.println(str);
            if (n < s.length()) {
                return count;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(repeatedString("abcac", 10));
//        System.out.println(repeatedString("aba", 10));
//        System.out.println(repeatedString("a", 1_000_000_000_000L));
    }
}
