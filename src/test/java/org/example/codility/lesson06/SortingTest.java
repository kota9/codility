package org.example.codility.lesson06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SortingTest {
    private final Sorting sorting = new Sorting();

    @Test
    void countsDistinctValues() {
        assertEquals(3, sorting.distinct(new int[]{2, 1, 1, 2, 3, 1}));
    }
}
