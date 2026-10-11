package org.example;

import java.util.Arrays;
import java.util.HashMap;

public class CountingElements {
    public static void main(String[] args) {
        CountingElements countingElements = new CountingElements();

        // frogRiverOne
        int X = 5;
        int[] A = {1, 3, 1, 4, 2, 3, 5, 4};
        System.out.println(countingElements.frogRiverOne(X, A));
        System.out.println(countingElements.frogRiverOneByChatGPT(X, A));

        // maxCounters
//        int N = 5;
//        int[] A = {3, 4, 4, 6, 1, 4, 4};
//        int N = 3;
//        int[] A = {1, 4, 2, 2, 4, 3};
//        System.out.println(Arrays.toString(countingElements.maxCountersByChatGPT(N, A)));
    }

    // forgRiverOne
    public int frogRiverOne(int X, int[] A) {
        // 현재 나뭇잎이 놓여있는 곳을 체크하는 배열
        boolean[] exists = new boolean[X+1];

        // A배열 순회
        for (int i=0; i<A.length; i++) {
            exists[A[i]] = true;

            // 나뭇잎이 다 놓여져 있는지 체크
            boolean flag = true;
            for (int j=1; j<exists.length; j++) {
                // false인 값이 있다면 break
                if (exists[j]==false) {
                    flag = false;
                    break;
                }
            }

            // 모두 놓여 있다면 해당 시간(초)을 리턴
            if (flag==true) {
                return i;
            }
        }

        // 불가능하면 -1을 리턴
        return -1;
    }

    public int frogRiverOneByChatGPT(int X, int[] A) {
        boolean[] covered = new boolean[X + 1];
        int count = 0;

        for (int i = 0; i < A.length; i++) {
            int position = A[i];

            // 해당 위치에 처음 나뭇잎이 떨어진 경우
            if (!covered[position]) {
                covered[position] = true;
                count++;

                // 1부터 X까지 모든 위치가 덮인 경우
                if (count == X) {
                    return i;
                }
            }

        }
        return -1;
    }





    // maxCounters. No solve
    public int[] maxCounters(int N, int[] A) {
        // maxCounter 값은 별도로 저장. N+1
        int maxCounterCnt = 0;
        int lastMaxCounterPosition = 0;
        for (int i=0; i<A.length; i++) {
            if (A[i]==(N+1)) {
                maxCounterCnt++;
                lastMaxCounterPosition = i;
            }
        }

        // 마지막 맥스카운터 전까지 최대값 구하기
        int maxVal = Integer.MIN_VALUE;

        // A배열에 있는 값을 해시맵에 저장
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i=0; i<lastMaxCounterPosition; i++) {
            int nowVal = hm.getOrDefault(A[i], 0) + 1;
            hm.put(A[i], nowVal);
            maxVal = Math.max(maxVal, nowVal);
        }

        // 마지막 맥스 카운터 이후 개별 카운터 업데이트
        int[] counter = new int[N];
        for (int i=0; i<N; i++) {
            counter[i] = maxVal;
        }

        // maxCounter 마지막 값 뒤부터 카운터 계산.
        // 마지막에 일괄 업데이트
        for (int i=lastMaxCounterPosition+1; i<A.length; i++) {
            int key = A[i]-1;
            counter[key]++;
        }

        return counter;
    }

    public int[] maxCountersByChatGPT(int N, int[] A) {
        int[] counter = new int[N];

        int maxCounter = 0;
        int base = 0;

        for (int num : A) {
            if (num == N+1) {
                // 모든 카운터의 기준값만 갱신
                base = maxCounter;
            } else {
                int index = num - 1;

                // 기준값보다 낮은 카운터는 먼저 보정
                if (counter[index] < base) {
                    counter[index] = base;
                }

                // 해당 카운터 증가
                counter[index]++;

                // 현재 최댓값 갱신
                maxCounter = Math.max(maxCounter, counter[index]);
            }
        }

        // 아직 기준값이 반영되지 않은 카운터 보정
        for (int i = 0; i < N; i++) {
            if (counter[i] < base) {
                counter[i] = base;
            }
        }

        return counter;
    }

}
