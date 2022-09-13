package ua.masaltsev.collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueTest {

    private MyQueue<String> myQueue;

    @BeforeEach
    void setUp() {
        myQueue = new MyQueue<>();

        String s1 = "one";
        String s2 = "two";
        String s3 = "three";
        String s4 = "four";

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
        assertEquals("six", myQueue.pop());
    }

    @Test
    void size() {
        assertEquals(4, myQueue.size());
    }

    @Test
    void capacityTest() {
        for (int i = 0; i < 30; i++) {
            myQueue.push("dummy");
        }

        for (int i = 0; i < 20; i++) {
            myQueue.pop();
        }

        for (int i = 0; i < 5; i++) {
            myQueue.push("dummy");
        }

        assertEquals(19, myQueue.size());
    }

    @Test
    public void emptyQueue() {
        MyQueue<String> myQueueEmpty = new MyQueue<>();

        myQueueEmpty.push("abc");
        myQueueEmpty.push("abc");
        myQueueEmpty.push("abc");
        myQueueEmpty.push("abc");
        myQueueEmpty.push("abc");

        myQueueEmpty.pop();
        myQueueEmpty.pop();
        myQueueEmpty.pop();
        myQueueEmpty.pop();
        myQueueEmpty.pop();
        myQueueEmpty.pop();
        myQueueEmpty.pop();
        myQueueEmpty.pop();
        myQueueEmpty.pop();
        myQueueEmpty.pop();
        myQueueEmpty.pop();
        myQueueEmpty.pop();
        myQueueEmpty.pop();
        myQueueEmpty.pop();
        myQueueEmpty.pop();

    }
}