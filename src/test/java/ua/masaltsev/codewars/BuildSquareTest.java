package ua.masaltsev.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuildSquareTest {

    @Test
    void generateShape() {
        assertEquals("+++\n+++\n+++", BuildSquare.generateShape(3));
        assertEquals("+++++\n+++++\n+++++\n+++++\n+++++", BuildSquare.generateShape(5));
        assertEquals("++++++++\n++++++++\n++++++++\n++++++++\n++++++++\n++++++++\n++++++++\n++++++++", BuildSquare.generateShape(8));
    }
}