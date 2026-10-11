package org.example.codility.lesson05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrefixSumsTest {
    private final PrefixSums prefixSums = new PrefixSums();

    @Test
    void countsPassingCars() {
        assertEquals(5, prefixSums.passingCarsByChatGPT(new int[]{0, 1, 0, 1, 1}));
    }
}
