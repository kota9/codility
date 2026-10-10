package org.example;

import java.util.HashSet;

public class Sorting {
    public static void main(String[] args) {
        Sorting sorting = new Sorting();

        // distinct
        int[] A = {2, 1, 1, 2, 3, 1};
        System.out.println(sorting.distinct(A));


    }

    public int distinct(int[] A) {
        HashSet<Integer> hs = new HashSet<>();

        for (int num : A) {
            hs.add(num);
        }

        return hs.size();
    }
}
