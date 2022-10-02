package ua.masaltsev.leetcode.arrays;

import org.junit.jupiter.api.Test;
import ua.masaltsev.leetcode.arrays.ArrayThree;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ArrayThreeTest {

    @Test
    void rotate1() {
        int[] ints =    {1, 2, 3, 4, 5, 6, 7};
        int[] result =  {5, 6, 7, 1, 2, 3, 4};
        new ArrayThree().rotate(ints, 3);
        assertArrayEquals(result, ints);
    }

    @Test
    void rotate2() {
        int[] ints =    {3, 8, 15, 1, 0, 10};
        int[] result =  {0, 10, 3, 8, 15, 1};
        new ArrayThree().rotate(ints, 2);
        assertArrayEquals(result, ints);
    }
}