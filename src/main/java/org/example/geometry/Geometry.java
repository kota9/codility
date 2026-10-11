package org.example.geometry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Map2D {
    int X;
    int Y;

    Map2D(int x, int y) {
        this.X = x;
        this.Y = y;
    }
}

public class Geometry {

    public int maxPointsWithPerimeter(Map2D[] map, int perimeter) {
        if (map == null || map.length == 0) {
            return 0;
        }

        if (perimeter < 0) {
            return 0;
        }

        // Y 좌표 기준으로 정렬
        Map2D[] points = map.clone();

        Arrays.sort(points, Comparator.comparingInt((Map2D p) -> p.Y)
                .thenComparingInt(p -> p.X));

        // 서로 다른 X 좌표를 정렬
        int[] xs = Arrays.stream(map)
                .mapToInt(p -> p.X)
                .distinct()
                .toArray();

        int answer = 0;

        // 직사각형의 왼쪽 X 좌표
        for (int i = 0; i < xs.length; i++) {

            // 직사각형의 오른쪽 X 좌표
            for (int j = i; j < xs.length; j++) {

                long width = (long) xs[j] - xs[i];

                // 가로 길이만으로 둘레를 초과하는 경우
                if (2L * width > perimeter) {
                    break;
                }

                // 허용되는 최대 세로 길이
                long maxHeight = (perimeter - 2L * width) / 2L;

                // 현재 X 범위에 포함되는 좌표 수집
                List<Map2D> candidates = new ArrayList<>();

                for (Map2D point : points) {
                    if (point.X >= xs[i] && point.X <= xs[j]) {
                        candidates.add(point);
                    }
                }

                // Y 좌표 기준 슬라이딩 윈도우
                int left = 0;

                for (int right = 0;
                    right < candidates.size();
                    right++) {

                    while ((long) candidates.get(right).Y
                            - candidates.get(left).Y
                            > maxHeight) {
                        left++;
                    }

                    int count = right - left + 1;
                    answer = Math.max(answer, count);
                }
            }
        }

        return answer;
    }
}
