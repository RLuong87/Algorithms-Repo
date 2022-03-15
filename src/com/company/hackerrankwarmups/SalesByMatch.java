package com.company.hackerrankwarmups;

import java.util.*;

public class SalesByMatch {

    /*

     ********************** S O L V E D *****************************

     */

    public static int sockMerchant(int n, List<Integer> ar) {

        int totalPairs = 0;

        HashMap<Integer, Integer> sockCount = new HashMap<>();

        for (int i = 0; i < n; i++) {

            if (!sockCount.containsKey(ar.get(i))) {
                sockCount.put(ar.get(i), 1);
            } else {
                sockCount.put(ar.get(i), Collections.frequency(ar, ar.get(i)));
//                sockCount.put(ar.get(i), sockCount.get(ar.get(i)) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : sockCount.entrySet()) {
            totalPairs += entry.getValue() / 2;
        }
        return totalPairs;
    }

    public static void main(String[] args) {

//        List<Integer> pairs = List.of(1, 2, 1, 2, 1, 3, 2);
        List<Integer> pairs = List.of(10, 20, 20, 10, 10, 30, 50, 10, 20);

        System.out.println(sockMerchant(pairs.size(), pairs));
//        List<Integer> pairs = new ArrayList<>() {{
//            add(10);
//            add(20);
//            add(20);
//            add(20);
//            add(10);
//        }};
//        System.out.println(sockMerchant(pairs.size(), pairs));

        HashMap<Integer, Integer> sockCount = new HashMap<>();

        for (int i = 0; i < pairs.size(); i++) {
            sockCount.put(pairs.get(i), Collections.frequency(pairs, pairs.get(i)));
        }

        int totalPairs = 0;
        for (Map.Entry<Integer, Integer> entry : sockCount.entrySet()) {
            totalPairs += entry.getValue() / 2;
        }
//        System.out.println(totalPairs);
//        System.out.println("Number of socks: " + sockCount);
    }
}
