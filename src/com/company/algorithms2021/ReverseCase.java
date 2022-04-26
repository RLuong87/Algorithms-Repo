package com.company.algorithms2021;



public class ReverseCase {

    /*
    Edabit Challenge

    Given a string, create a function to reverse the case. All lower-cased letters should be upper-cased, and vice versa.

    Examples:
    reverseCase("Happy Birthday") ➞ "hAPPY bIRTHDAY"

    reverseCase("MANY THANKS") ➞ "many thanks"

    reverseCase("sPoNtAnEoUs") ➞ "SpOnTaNeOuS"
    */
    public static String reverseCase(String str) {
        StringBuilder revCase = new StringBuilder();

        // Use the enhanced for loop
        for (char c : str.toCharArray()) { // Convert the string to a char array
            if (Character.isUpperCase(c)) { // if the characters are uppercase
                c = Character.toLowerCase(c); // make it lowercase
            } else {
                c = Character.toUpperCase(c); // make lowercase characters uppercase
            }
            revCase.append(c); // append the two converted strings
        }
        return revCase.toString(); // return the appended strings

//        char[] chars = str.toCharArray();
//        String capStr = "";
//        String lowStr = "";
//
//        for (int i = 0; i < chars.length; i++) {
//
//            if (Character.isUpperCase(chars[i]))
//
//                capStr += chars[i];
//            else
//                lowStr += chars[i];
//        }
//        return capStr.toLowerCase() + " " + lowStr.toUpperCase();
    }

    public static void main(String[] args) {

        System.out.println(reverseCase("Happy Birthday"));
        System.out.println(reverseCase("MANY THANKS"));
        System.out.println(reverseCase("sPoNtAnEoUs"));

        String str = "Happy Birthday";

        System.out.println();
        char[] chars = str.toCharArray();
        StringBuilder capStr = new StringBuilder();
        StringBuilder lowStr = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                capStr.append(chars[i]);
            } else {
                lowStr.append(chars[i]);
            }
        }
//        System.out.println(chars);

//        System.out.println(capStr + "\n" + lowStr);

//        for (String s : newStr) {
////            if (Character.isUpperCase(s.charAt(0)))
////                capStr.append(s);
//            else
//                lowStr.append(s);
//        }
    }
}
