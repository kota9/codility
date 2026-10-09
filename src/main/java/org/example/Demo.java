package org.example;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        // Demo test
        // MissingInteger
        // 배열에서 등장하지 않는 가장 작은 양의 정수(Missing Integer)
        int[] A = {1, 3, 6, 4, 1, 2};
        int[] B = {1, 2, 3};
        int[] C = {-1, -3};

        Demo demo = new Demo();
        System.out.println(demo.missingInteger(A));
        System.out.println(demo.missingInteger(B));
        System.out.println(demo.missingInteger(C));
//        System.out.println(demo.missingIntegerByChatGPT(A));
//        System.out.println(demo.missingIntegerByChatGPT(B));
//        System.out.println(demo.missingIntegerByChatGPT(C));

    }

    // 배열에서 등장하지 않는 가장 작은 양의 정수(Missing Integer)
    /**
     * This is a demo task.
     *
     * Write a function:
     *
     * class Solution { public int solution(int[] A); }
     * content_copy
     *
     * that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
     *
     * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
     *
     * Given A = [1, 2, 3], the function should return 4.
     *
     * Given A = [−1, −3], the function should return 1.
     *
     * Write an efficient algorithm for the following assumptions:
     *
     * N is an integer within the range [1..100,000];
     * each element of array A is an integer within the range [−1,000,000..1,000,000].
     * Copyright 2009–2026 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.
     */
    // 내가 푼 답안. O(NlogN)
    public int missingInteger(int[] A) {
        Arrays.sort(A);

        int min = 1;

        for (int num : A) {
            if (num == min) {
                min++;
            } else if (num > min) {
                return min;
            }
        }

        return min;
    }

    // ChatGPT가 푼 답안. O(N)
    public int missingIntegerByChatGPT(int[] A) {
        int N = A.length;

        // 각 양의 정수의 등장 여부를 기록
        boolean[] exists = new boolean[N + 1];

        // 1부터 N까지의 숫자만 확인
        for (int num : A) {
            if (num > 0 && num <= N) {
                exists[num] = true;
            }
        }

        // 등장하지 않은 가장 작은 양의 정수 탐색
        for (int i = 1; i <= N; i++) {
            if (!exists[i]) {
                return i;
            }
        }

        return N + 1;
    }
}
