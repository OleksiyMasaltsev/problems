package ua.masaltsev.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ArrayFourTest {

    @Test
    void containsDuplicate1() {
        int[] array = {1, 2, 3, 1};
        assertTrue(new ArrayFour().containsDuplicate(array));
    }

    @Test
    void containsDuplicate2() {
        int[] array = {1, 2, 3, 4};
        assertFalse(new ArrayFour().containsDuplicate(array));
    }

    @Test
    void containsDuplicate3() {
        int[] array = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        assertTrue(new ArrayFour().containsDuplicate(array));
    }
}