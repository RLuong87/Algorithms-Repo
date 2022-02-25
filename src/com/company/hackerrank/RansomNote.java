package com.company.hackerrank;

import java.util.*;

public class RansomNote {

    public static void checkMagazine(List<String> magazine, List<String> note) {

        HashMap<String, String> checkMagazine = new HashMap<>();


    }

    public static void main(String[] args) {

        HashMap<Integer, String> checkMagazine = new HashMap<>();
//        HashMap<Integer, String> ransomNote = new HashMap<>();

        String mag = "attack at dawn", rNote = "Attack at dawn";

        List<String> magazine = new ArrayList<>(Arrays.asList(mag.split(" ")));
        List<String> noteR = new ArrayList<>(Arrays.asList(rNote.split(" ")));

        for (int i = 0; i < magazine.size(); i++) {
            checkMagazine.put(i, magazine.get(i));
        }

        for (String notes : checkMagazine.values()) {

            for (String s : noteR) {

                if (notes.equals(s)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }

//        for (int i = 0; i < noteR.size(); i++) {
//            ransomNote.put(i, noteR.get(i));
//        }

        System.out.println(checkMagazine);
//        System.out.println(ransomNote);
    }
}
