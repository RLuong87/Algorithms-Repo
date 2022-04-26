package com.company;

import java.util.ArrayList;

public class FilterStateNames {

    /*
    Create a function that filters out an array of state names into two categories based on the second parameter.

    Abbreviations abb
    Full names full

    Examples:
    filterStateNames(["Arizona", "CA", "NY", "Nevada"], "abb")
    ➞ ["CA", "NY"]

    filterStateNames(["Arizona", "CA", "NY", "Nevada"], "full")
    ➞ ["Arizona", "Nevada"]

    filterStateNames(["MT", "NJ", "TX", "ID", "IL"], "abb")
    ➞ ["MT", "NJ", "TX", "ID", "IL"]

    filterStateNames(["MT", "NJ", "TX", "ID", "IL"], "full")
    ➞ []

    Notes:
    State abbreviations will always be in uppercase.
     */

    public static String[] filterStateNames(String[] arr, String type) {


        return null;

    }

    public static void main(String[] args) {

        ArrayList<String> full = new ArrayList<>();
        ArrayList<String> abb = new ArrayList<>();

        String[] states = {"Arizona", "CA", "NY", "Nevada"};
        String type = "full", type2 = "abb";
        String[] arrStates;

        for (String state : states) {
            if (type.length() < state.length()) {
                full.add(state);
                arrStates = new String[]{state};
            } else if (state.length() < type2.length()) {
                abb.add(state);
            }
        }
        System.out.println(full);
        System.out.println(abb);
    }
}
