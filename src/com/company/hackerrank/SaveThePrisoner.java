package com.company.hackerrank;

public class SaveThePrisoner {

    public static int saveThePrisoner(int prisoners, int treats, int start) {

        int chair;

        while (true) {
            for (chair = start; chair < prisoners + 1; chair++) {
                System.out.println(chair + " " + treats);
                treats--;
                if (treats == 0) {
                    System.out.println();
                    System.out.print("Warn prisoner in chair #");
                    return chair;
                }
            }
            start = 1;
        }
    }

    public static void main(String[] args) {

//        System.out.println(saveThePrisoner(4, 6, 2)); // -> 3
//        System.out.println("___________________");
//        System.out.println(saveThePrisoner(5, 2, 1)); // -> 2
//        System.out.println("___________________");
//        System.out.println(saveThePrisoner(5, 2, 2)); // -> 3
//        System.out.println("___________________");
        System.out.println(saveThePrisoner(7, 19, 2)); // -> 6
//        System.out.println("___________________");
//        System.out.println(saveThePrisoner(3, 7, 3)); // -> 3
//        System.out.println("___________________");

    }
}
