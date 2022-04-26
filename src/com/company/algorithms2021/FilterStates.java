package com.company.algorithms2021;

import java.util.ArrayList;
import java.util.Arrays;

public class FilterStates {

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

        String[] names = {};
        for (String s : arr) {
            if (s.length() > 2 && type.equals("full")) {
                names = arr;
                break;
            }

//            if (s.length() == 2 && type.equals("abb")) {
//                return arr;
//            }
        }
        return names;
    }

    public static void main(String[] args) {

        String[] states = {"Arizona", "CA", "NY", "Nevada"};
        System.out.println(Arrays.toString(filterStateNames(states, "full")));

        ArrayList<String> full = new ArrayList<>();
        ArrayList<String> abb = new ArrayList<>();

        String type = "full", type2 = "abb";
        String[] arrStates;

        for (String state : states) {
            if (state.length() > 2) {
                full.add(state);
                arrStates = new String[]{state};
            } else {
                abb.add(state);
            }
        }
//        System.out.println(full);
//        System.out.println(abb);
    }
}
