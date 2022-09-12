package ua.masaltsev.collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueTest {

    private MyQueue<String> myQueue;

    private String s1 = "one";
    private String s2 = "two";
    private String s3 = "three";
    private String s4 = "four";

    @BeforeEach
    void setUp() {
        myQueue = new MyQueue<>();
        myQueue.push(s1);
        myQueue.push(s2);
        myQueue.push(s3);
        myQueue.push(s4);
    }

//    @Test
//    void push() {
//    }

    @Test
    void pop() {
        assertEquals("one", myQueue.pop());
        assertEquals("two", myQueue.pop());
        myQueue.push("five");
        myQueue.push("six");
        assertEquals("three", myQueue.pop());
        assertEquals("four", myQueue.pop());
        assertEquals("five", myQueue.pop());
    }

    @Test
    void size() {
        assertEquals(4, myQueue.size());
    }
}