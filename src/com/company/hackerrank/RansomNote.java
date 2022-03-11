package com.company.hackerrank;

import java.util.*;

public class RansomNote {

    public static void checkMagazine(List<String> magazine, List<String> note) {

        HashMap<String, String> checkMagazine = new HashMap<>();
        List<String> notAMatch = new ArrayList<>();
        List<Integer> countOfWords = new ArrayList<>();

        for (String no : note) {
           countOfWords.add(Collections.frequency(note, no));
        }

        for (int count: countOfWords) {
            if (count > 1) {
                System.out.println("No");
            }
            break;
        }

        for (String m : magazine) {
            checkMagazine.put(m, m);
        }

        for (String n : note) {
            if (!checkMagazine.containsValue(n)) {
                notAMatch.add(n);
            }
        }
        if (!notAMatch.isEmpty()) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
        System.out.println(notAMatch);
    }

    public static void main(String[] args) {

//        String mag = "attack at dawn", rNote = "Attack at dawn";
//        String mag = "ive got a lovely bunch of coconuts", rNote = "ive got some coconuts";
//        String mag = "give me one grand today night", rNote = "give one grand today";
        String mag = "two times three is not four", rNote = "two times two is four";

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
