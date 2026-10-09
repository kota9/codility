package org.example;

public class TimeComplexity {
    public static void main(String[] args) {
        // FrogJmp
        int X = 10;
        int Y = 85;
        int D = 30;

        TimeComplexity timeComplexity = new TimeComplexity();
        System.out.println(timeComplexity.frogJmp(X, Y, D));
        System.out.println(timeComplexity.frogJmpByChatGPT(X, Y, D));
    }

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

}
