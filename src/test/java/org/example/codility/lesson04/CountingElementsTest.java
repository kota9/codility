package org.example.codility.lesson04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class CountingElementsTest {
    private final CountingElements countingElements = new CountingElements();

    @Test
    void findsEarliestRiverCrossing() {
        assertEquals(6, countingElements.frogRiverOneByChatGPT(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4}));
    }

    @Test
    void appliesMaxCounterOperations() {
        assertArrayEquals(
                new int[]{3, 2, 2, 4, 2},
                countingElements.maxCountersByChatGPT(5, new int[]{3, 4, 4, 6, 1, 4, 4})
        );
    }
}
