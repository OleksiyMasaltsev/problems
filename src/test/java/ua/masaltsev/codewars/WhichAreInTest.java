package ua.masaltsev.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WhichAreInTest {

    @Test
    public void test1() {
        String[] array1 = new String[]{ "arp", "live", "strong" };
        String[] array2 = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
        String[] result = new String[] { "arp", "live", "strong" };
        assertArrayEquals(result, WhichAreIn.inArray(array1, array2));
    }

    @Test
    public void test2() {
        String[] array1 = new String[]{ "tarp", "mice", "bull" };
        String[] array2 = new String[] { "lively", "alive", "harp", "sharp", "armstrong"};
        String[] result = new String[] {};
        assertArrayEquals(result, WhichAreIn.inArray(array1, array2));
    }
}