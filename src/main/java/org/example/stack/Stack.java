package org.example.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stack {
    public int wordMachine(String S) {
        final int MAX = (1 << 20) -1;

        if (S == null || S.trim().isEmpty()) {
            return -1;
        }

        Deque<Integer> stack = new ArrayDeque<>();

        String[] tokens = S.trim().split("\\s+");

        for (String token : tokens) {
            switch (token) {
                case "POP":
                    if (stack.isEmpty()) {
                        return -1;
                    }

                    stack.pop();
                    break;

                case "DUP":
                    if (stack.isEmpty()) {
                        return -1;
                    }

                    stack.push(stack.peek());
                    break;

                case "+":
                    if (stack.size() < 2) {
                        return -1;
                    }

                    int first = stack.pop();
                    int second = stack.pop();

                    long sum = (long) first + second;

                    if (sum > MAX) {
                        return -1;
                    }

                    stack.push((int) sum);
                    break;

                case "-":
                    if (stack.size() < 2) {
                        return -1;
                    }

                    first = stack.pop();
                    second = stack.pop();

                    int difference = first - second;

                    if (difference < 0) {
                        return -1;
                    }

                    stack.push(difference);
                    break;

                default:
                    // 숫자 이외의 알 수 없는 명령어는 오류
                    if (!token.matches("\\d+")) {
                        return -1;
                    }

                    try {
                        int value = Integer.parseInt(token);

                        if (value < 0 || value > MAX) {
                            return -1;
                        }

                        stack.push(value);
                    } catch (NumberFormatException e) {
                        return -1;
                    }
            }
        }

        // 모든 명령 실행 후 스택이 비어 있다면 오류
        return stack.isEmpty() ? -1 : stack.pop();
    }

}
