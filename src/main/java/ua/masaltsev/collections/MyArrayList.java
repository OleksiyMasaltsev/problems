package ua.masaltsev.collections;

public class MyArrayList<T> {
    private Object[] storage = new Object[5];
    private int tail = 0;

    public void add(T element) {
        ensureCapacity();
        storage[tail] = element;
        tail++;
    }

    private void ensureCapacity() {
        if (tail == storage.length) {
            increaseCapacity();
        }
    }

    private void increaseCapacity() {
        Object[] tempArray = new Object[storage.length + 5];
        System.arraycopy(storage, 0, tempArray, 0, size());
        storage = tempArray;
//        tail = size();
    }

    public void add(int index, T element) {
        ensureCapacity();
        Object[] tempStorage = new Object[storage.length];
        System.arraycopy(storage, 0, tempStorage, 0, index - 1);
        tempStorage[index] = element;
        System.arraycopy(storage, index - 1, tempStorage, index + 1, size() - index + 1);
        storage = tempStorage;
        tail++;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        return (T) storage[index];
    }

    public T remove(int index) {
        T element = this.get(index);
        Object[] tempStorage = new Object[storage.length];
        System.arraycopy(storage, 0, tempStorage, 0, index);
        System.arraycopy(storage, index + 1, tempStorage, index, size() - index + 1);
        storage = tempStorage;
        tail--;
        return element;
    }

    public boolean remove(T element) {
        for (int i = 0; i < storage.length; i++) {
            if (storage[i].equals(element)) {
                this.remove(i);
                return true;
            }
        }
        return false;
    }

    public int size() {
        return tail;
    }
}
