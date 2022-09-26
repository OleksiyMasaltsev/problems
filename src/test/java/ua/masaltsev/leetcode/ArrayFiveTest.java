package ua.masaltsev.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayFiveTest {

    @Test
    void singleNumber() {
        int[] ints = {4,1,2,1,2};
        assertEquals(4, new ArrayFive().singleNumber(ints));
    }
}