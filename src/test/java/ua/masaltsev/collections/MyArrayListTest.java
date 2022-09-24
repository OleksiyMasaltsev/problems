package ua.masaltsev.collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {

    /*@BeforeEach
    void setUp() {
    }*/

    @Test
    void add_Element_IsSizeIncreased() {
        String element = "element";
        MyArrayList<String> list = new MyArrayList<>();
        assertEquals(0, list.size());
        list.add(element);
        assertEquals(1, list.size());
    }

    @Test
    void addSevenElements_IsCapacityIncreased() {
        MyArrayList<String> list = new MyArrayList<>();
        for (int i = 1; i <= 7; i++) {
            list.add(String.valueOf(i));
        }
        assertEquals(7, list.size());
    }

    @Test
    void add_ElementByIndex_OnRightPosition() {
        MyArrayList<String> list = new MyArrayList<>();
        for (int i = 1; i <= 7; i++) {
            list.add(String.valueOf(i));
        }
        assertEquals(7, list.size());
        list.add(3, "insert");
        list.add(5, "element");
        assertEquals("insert", list.get(3));
        assertEquals(9, list.size());
    }

    @Test
    void get() {
        MyArrayList<String> list = new MyArrayList<>();
        for (int i = 1; i <= 7; i++) {
            list.add(String.valueOf(i));
        }
        assertEquals("6", list.get(5));
    }

    @Test
    void removeByIndex_ElementReturned_OrderChecked() {
        MyArrayList<String> list = new MyArrayList<>();
        for (int i = 1; i <= 7; i++) {
            list.add(String.valueOf(i));
        }
        assertEquals("5", list.remove(4));
        assertEquals("6", list.get(4));
    }

    @Test
    void removeByElement_ElementReturned_OrderChecked() {
        MyArrayList<String> list = new MyArrayList<>();
        for (int i = 1; i <= 7; i++) {
            list.add(String.valueOf(i));
        }
        assertTrue(list.remove("5"));
        assertEquals("6", list.get(4));
    }

    /*@Test
    void size() {
    }*/
}