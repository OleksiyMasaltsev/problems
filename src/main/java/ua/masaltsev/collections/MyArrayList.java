package ua.masaltsev.collections;

public class MyArrayList<T> {
    private Object[] storage = new Object[10];
    private int tail = 0;

    public void add(T element) {
        if (tail == storage.length - 1) {
            increaseCapacity();
        }
        storage[tail] = element;
        tail++;
    }

    private void increaseCapacity() {
        Object[] tempArray = new Object[storage.length + 10];
        System.arraycopy(storage, 0, tempArray, 0, size());
        storage = tempArray;
        tail = size();
    }

    public void add(int index, T element) {}

    public T get(int index) {
        return null;
    }

    public T remove(int index) {
        return null;
    }

    public boolean remove(T element) {
        return false;
    }

    public int size() {
        return tail;
    }
}
