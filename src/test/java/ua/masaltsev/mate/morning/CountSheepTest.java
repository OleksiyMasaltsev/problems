package ua.masaltsev.mate.morning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountSheepTest {

    @Test
    void countSheep() {
        assertEquals("1 sheep...2 sheep...", CountSheep.countSheep(2));
    }
}