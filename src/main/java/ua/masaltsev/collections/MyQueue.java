package ua.masaltsev.collections;

public class MyQueue<T> {

    private Object[] storage = new Object[10];
    private int lastIndex = 0;
    private int firstIndex = 0;

    public void push(T element) {
        if (lastIndex == storage.length - 1) {
            Object[] tempStorage = new Object[storage.length + 10];
            System.arraycopy(storage, 0, tempStorage, 0, storage.length);
            storage = tempStorage;
        }
        storage[lastIndex] = element;
        lastIndex++;
    }

    public Object pop() {
        return storage[firstIndex++];
    }

    public int size() {
        return lastIndex - firstIndex;
    }
}
