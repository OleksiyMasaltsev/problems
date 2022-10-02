package ua.masaltsev.leetcode.arrays;

import org.junit.jupiter.api.Test;
import ua.masaltsev.leetcode.arrays.ArrayTwo;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTwoTest {

    @Test
    void maxProfit() {
        assertEquals(7, new ArrayTwo().maxProfit(new int[] {7, 1, 5, 3, 6, 4}));
        assertEquals(4, new ArrayTwo().maxProfit(new int[] {1, 2, 3, 4, 5}));
        assertEquals(0, new ArrayTwo().maxProfit(new int[] {7, 6, 4, 3, 1}));
    }
}