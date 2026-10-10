package org.example;

public class PrefixSums {
    public static void main(String[] args) {
        PrefixSums prefixSums = new PrefixSums();

        int[] A = {0, 1, 0, 1, 1};
        System.out.println(prefixSums.passingCars(A));
    }

    public int passingCars(int[] A) {
        int exceedVal = 1000000000;
        int no1Sum = 0;

        for (int num : A) {
            no1Sum += num;
        }

        long pairSum = 0L;
        for (int i=0; i<A.length; i++) {
            if (A[i]==0) {
                pairSum += no1Sum;
            } else {
                no1Sum--;
            }
        }

        if (pairSum > exceedVal) {
            pairSum = -1;
        }

        return (int) pairSum;
    }
}
