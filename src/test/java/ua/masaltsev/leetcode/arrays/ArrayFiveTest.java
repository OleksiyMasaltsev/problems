package ua.masaltsev.leetcode.arrays;

import org.junit.jupiter.api.Test;
import ua.masaltsev.leetcode.arrays.ArrayFive;

import static org.junit.jupiter.api.Assertions.*;

class ArrayFiveTest {

    @Test
    void singleNumber() {
        int[] ints = {4,1,2,1,2};
        assertEquals(4, new ArrayFive().singleNumber(ints));
    }
}