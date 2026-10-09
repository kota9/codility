package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Demo test
        // 배열에서 등장하지 않는 가장 작은 양의 정수(Missing Integer)
        int[] A = {1, 3, 6, 4, 1, 2};
        int[] B = {1, 2, 3};
        int[] C = {-1, -3};

        Demo demo = new Demo();
        System.out.println(demo.solution(A));
        System.out.println(demo.solution(B));
        System.out.println(demo.solution(C));
//        System.out.println(demo.solutionByChatGPT(A));
//        System.out.println(demo.solutionByChatGPT(B));
//        System.out.println(demo.solutionByChatGPT(C));

    }
}
