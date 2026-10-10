package org.example;

public class TimeComplexity {
    public static void main(String[] args) {
        TimeComplexity timeComplexity = new TimeComplexity();

        // frogJmp
        /*int X = 10;
        int Y = 85;
        int D = 30;

        System.out.println(timeComplexity.frogJmp(X, Y, D));
        System.out.println(timeComplexity.frogJmpByChatGPT(X, Y, D));*/

        // permMissingEmem
        int[] A = {2, 3, 1, 5};
        System.out.println(timeComplexity.permMissingElem(A));
        System.out.println(timeComplexity.permMissingEmelByChatGPT(A));

    }

    // frogJmp
    public int frogJmp(int X, int Y, int D) {
        int count = 0;

        while (X < Y) {
            X += D;
            count++;
        }

        return count;
    }

    public int frogJmpByChatGPT(int X, int Y, int D) {
        int distance = Y - X;

        return (distance + D - 1) / D;
    }

    // permMissingEmem
    public int permMissingElem(int[] A) {
        int N = A.length;
        boolean[] exists = new boolean[N+2];

        for (int num : A) {
            exists[num] = true;
        }

        for (int i=1; i <= N+1; i++) {
            if (exists[i]==false) {
                return i;
            }
        }

        return -1;
    }

    public int permMissingEmelByChatGPT(int[] A) {
        long N = A.length;

        long expectedSum = (N + 1) * (N + 2) / 2;
        long actualSum = 0;

        for (int num : A) {
            actualSum += num;
        }

        return (int) (expectedSum - actualSum);
    }

}
