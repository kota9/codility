package org.example.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    private final Stack stack = new Stack();

    @Test
    void wordMachine() {
        String S = "13 DUP 4 POP 5 DUP + DUP + -";
        assertEquals(7, stack.wordMachine(S));
    }
}
