package org.example.codility.lesson04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MissingIntegerTest {
    private final MissingInteger missingInteger = new MissingInteger();

    @Test
    void findsSmallestMissingPositiveInteger() {
        assertEquals(5, missingInteger.missingInteger(new int[]{1, 3, 6, 4, 1, 2}));
        assertEquals(4, missingInteger.missingIntegerByChatGPT(new int[]{1, 2, 3}));
        assertEquals(1, missingInteger.missingIntegerByChatGPT(new int[]{-1, -3}));
    }
}
