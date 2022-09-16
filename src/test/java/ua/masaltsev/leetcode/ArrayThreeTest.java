package ua.masaltsev.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayThreeTest {

    @Test
    void rotate() {
        int[] ints = {1,2,3,4,5,6,7};
        int[] intsCopy = new int[ints.length];
        System.arraycopy(ints, 0, intsCopy, 0, ints.length);
        new ArrayThree().rotate(ints, 3);
        assertArrayEquals(intsCopy, ints);
    }
}