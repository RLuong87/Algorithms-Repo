package com.company.hackerrank;

import java.util.*;

public class RansomNote {

    public static void checkMagazine(List<String> magazine, List<String> note) {

        HashMap<String, String> checkMagazine = new HashMap<>();
        HashMap<String, String> checkNote = new HashMap<>();

        for (String m : magazine) {

            for (String n : note) {
                checkMagazine.put(m, m);
                checkNote.put(n, n);
            }
        }
        StringBuilder yes = new StringBuilder();

        for (String cn : checkNote.values()) {

//            for (Map.Entry<String, String> cm : checkMagazine.entrySet()) {
            for (String cm : checkNote.values()) {

                if (cn.equals(cm)) {
                    yes.append("Yes");
                } else {
                    yes.append("No");
                }
            }
        }
        System.out.println(checkMagazine);
        System.out.println(checkNote);
    }

    public static void main(String[] args) {

        String mag = "attack at dawn", rNote = "Attack at dawn";
//        String mag = "give me one grand today night", rNote = "give one grand today";

        List<String> magazine = new ArrayList<>(Arrays.asList(mag.split(" ")));
        List<String> noteR = new ArrayList<>(Arrays.asList(rNote.split(" ")));
        checkMagazine(magazine, noteR);

        HashMap<Integer, String> checkMagazine = new HashMap<>();
//        HashMap<Integer, String> ransomNote = new HashMap<>();


        for (int i = 0; i < magazine.size(); i++) {
            checkMagazine.put(i, magazine.get(i));
        }

        boolean check = false;

        for (String s : noteR) {

            for (String notes : checkMagazine.values()) {

                if (s.equals(notes)) {
                    check = true;
//                    System.out.println("Yes");
                } else {
                    check = true;
//                    System.out.println("No");
                }
            }
        }

//        for (int i = 0; i < noteR.size(); i++) {
//            ransomNote.put(i, noteR.get(i));
//        }

//        System.out.println(checkMagazine);
//        System.out.println(ransomNote);
    }
}
