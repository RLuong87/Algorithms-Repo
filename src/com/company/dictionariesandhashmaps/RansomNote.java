package com.company.dictionariesandhashmaps;

import java.util.*;

public class RansomNote {

    public static void checkMagazine(List<String> magazine, List<String> note) {

        Map<String, Integer> countOfWords = new HashMap<>();

        for (String m : magazine) {
            if (!countOfWords.containsKey(m)) {
                countOfWords.put(m, 0);
            }
            countOfWords.put(m, countOfWords.get(m) + 1);
        }
        System.out.println(countOfWords);

        for (String n : note) {

            if (countOfWords.containsKey(n)) {
                countOfWords.put(n, countOfWords.get(n) - 1);
                System.out.println("Yes");
                return;
            }
            if (countOfWords.get(n) <= 0) {
                System.out.println("No");
                return;
            }
        }
        System.out.println(countOfWords);
    }

    public static void checkMagazineV2(List<String> magazine, List<String> note) {

        Stack<String> rNote = new Stack<>();
        rNote.addAll(note);

        Map<String, String> checkMagazine = new HashMap<>();

        for (String m : magazine) {
            checkMagazine.put(m, m);
        }

        System.out.println(rNote);
        System.out.println(checkMagazine);

    }

    public static void main(String[] args) {

//        String mag = "attack at dawn", rNote = "Attack at dawn";
//        String mag = "ive got a lovely bunch of coconuts", rNote = "ive got some coconuts";
//        String mag = "give me one grand today night", rNote = "give one grand today";
        String mag = "two times three is not four", rNote = "two times two is four";
        List<String> magazine = new ArrayList<>(Arrays.asList(mag.split(" ")));
        List<String> note = new ArrayList<>(Arrays.asList(rNote.split(" ")));


        checkMagazine(magazine, note);
//        checkMagazineV2(magazine, note);


        HashMap<Integer, String> checkMagazine = new HashMap<>();
//        HashMap<Integer, String> ransomNote = new HashMap<>();


        for (int i = 0; i < magazine.size(); i++) {
            checkMagazine.put(i, magazine.get(i));
        }

        boolean check = false;

        for (String s : note) {

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
