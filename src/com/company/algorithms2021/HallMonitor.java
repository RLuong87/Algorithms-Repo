package com.company.algorithms2021;

public class HallMonitor {

    /*
    A floor plan is arranged as follows:
    Four rooms, which all lead into the hallway.
    It's impossible to move between rooms without first going into the hallway.
    Create a function which validates whether the path between rooms is possible. The hallway will be given as the letter "H".

    Examples:
    possiblePath([1, "H", 2, "H", 3, "H", 4]) ➞ true
    possiblePath(["H", 3, "H"]) ➞ true
    possiblePath([1, 2, "H", 3]) ➞ false
    */

    public static boolean possiblePath(Object[] t) {

        for (int i = 0; i < t.length - 1; i++) {

            if (t[i] instanceof Integer && t[i + 1] instanceof Integer) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

//        Object[] floorPlan = {1, "H", 2, "H", 3, "H", 4};
//        Object[] floorPlan = {"H", 3, "H"};
        Object[] floorPlan = {1, 2, "H", 3};

        System.out.println(possiblePath(floorPlan));

        for (int i = 0; i < floorPlan.length; i++) {

            if (floorPlan[0] instanceof Integer && floorPlan[1] instanceof Integer) {
//                System.out.println("false");
            } else {
//                System.out.println("true");
            }
        }
    }
}
