package org.example.codility.lesson03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TimeComplexityTest {
    private final TimeComplexity timeComplexity = new TimeComplexity();

    @Test
    void computesMinimumJumps() {
        assertEquals(3, timeComplexity.frogJmpByChatGPT(10, 85, 30));
    }

    @Test
    void findsMissingPermutationElement() {
        assertEquals(4, timeComplexity.permMissingEmelByChatGPT(new int[]{2, 3, 1, 5}));
    }

    @Test
    void computesMinimumTapeEquilibrium() {
        assertEquals(1, timeComplexity.tapeEquilibrium(new int[]{3, 1, 2, 4, 3}));
    }
}
