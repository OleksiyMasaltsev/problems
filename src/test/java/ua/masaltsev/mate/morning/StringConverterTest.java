package ua.masaltsev.mate.morning;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class StringConverterTest {

    @Test
    void stringify() {
        Random random = new Random();
        int size = 1 + random.nextInt(50);
        int expected = StringConverter.stringify(size).length();
        assertEquals(expected, size);
    }
}