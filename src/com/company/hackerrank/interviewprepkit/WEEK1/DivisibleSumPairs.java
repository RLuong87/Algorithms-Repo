package com.company.hackerrank.interviewprepkit.WEEK1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DivisibleSumPairs {

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here
        Map<Integer, Integer> pairCount = new HashMap<>();
        int pairs = 0;
        for (Integer i : ar) {
            int modulo = i % k;
            int com = k - modulo == k ? 0 : k - modulo;
            if (pairCount.containsKey(com)) {
                pairs += pairCount.get(com);
            }
            if (!pairCount.containsKey(modulo)) {
                pairCount.put(modulo, 1);
            } else {
                pairCount.put(modulo, pairCount.get(modulo) + 1);
            }
        }
        return pairs;
    }

    public static void main(String[] args) {

    }
}
