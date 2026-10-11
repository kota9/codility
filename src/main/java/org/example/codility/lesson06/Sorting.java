package org.example.codility.lesson06;

import java.util.HashSet;

public class Sorting {
    public int distinct(int[] A) {
        HashSet<Integer> hs = new HashSet<>();

        for (int num : A) {
            hs.add(num);
        }

        return hs.size();
    }
}
