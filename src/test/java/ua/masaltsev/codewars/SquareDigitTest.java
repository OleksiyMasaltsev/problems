package ua.masaltsev.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareDigitTest {

    @Test
    void squareDigits() {
        assertEquals(811181, new SquareDigit().squareDigits(9119));
        assertEquals(0, new SquareDigit().squareDigits(0));
    }
}