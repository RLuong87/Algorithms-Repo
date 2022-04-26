package com.company;

public class RecursionReverseString {

    public static String reverse(String str) {

        String[] rev = str.split("");
        StringBuilder emp = new StringBuilder(); // W/ StringBuilder
//        String emp = ""; // W/out StringBuilder

        for (int i = rev.length - 1; i >= 0; i--) {
            emp.append(rev[i]);
//            emp += rev[i]; // W/out append method
        }
        // return emp;
        return emp.toString();

        // Recursion reverse a string (not working)
//        if (null == str || (str.length() <= 1)) {
//            return str;
//        }
//
//        return reverse(str.substring(1) + str.charAt(0));
    }

    public static void main(String[] args) {
        reverse("hello");
    }
}
