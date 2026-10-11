package org.example.codility.lesson05;

public class PrefixSums {
    // passingCars
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

    public int passingCarsByChatGPT(int[] A) {
        int eastCars = 0;
        long pairCount = 0L;

        for (int num : A) {
            if (num == 0) {
                eastCars++;
            } else {
                pairCount += eastCars;
            }

            if (pairCount > 1_000_000_000L) {
                return -1;
            }
        }

        return (int) pairCount;
    }

}
