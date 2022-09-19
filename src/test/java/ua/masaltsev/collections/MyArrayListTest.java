package ua.masaltsev.collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void add_Element_IsSizeIncreased() {
        String element = "element";
        MyArrayList<String> list = new MyArrayList<>();
        assertEquals(0, list.size());
        list.add(element);
        assertEquals(1, list.size());
    }

    @Test
    void add_ElementByIndex_OnRightPosition() {

    }

    @Test
    void get() {
    }

    @Test
    void remove() {
    }

    @Test
    void testRemove() {
    }

    @Test
    void size() {
    }
}