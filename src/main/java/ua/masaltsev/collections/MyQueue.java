package ua.masaltsev.collections;

public class MyQueue<T> {

    private Object[] storage = new Object[5];
    private int lastIndex = 0;
    private int firstIndex = 0;
    private int popCounter = 0;

    public void push(T element) {
        if (lastIndex == storage.length) {
            increaseLength();
        }
        storage[lastIndex] = element;
        lastIndex++;
    }

    @SuppressWarnings("unchecked")
    public T pop() {
        if (firstIndex != lastIndex) {
            T element = (T) storage[firstIndex++];
            popCounter++;
            if (popCounter == 5) {
                decreaseLength();
            }
            return element;
        } else {
            return null;
        }
    }

    public int size() {
        return lastIndex - firstIndex;
    }

    private void increaseLength() {
        Object[] tempStorage = new Object[storage.length + 5];
        copyStorage(tempStorage);
//        System.out.println("size after increase " + storage.length);

    }

    private void decreaseLength() {
        Object[] tempStorage = new Object[storage.length - 5];
        copyStorage(tempStorage);
        popCounter = 0;
//        System.out.println("size after decrease " + storage.length);

    }

    private void copyStorage(Object[] tempStorage) {
        System.arraycopy(storage, firstIndex, tempStorage, 0, size());
        storage = tempStorage;
        lastIndex = size();
        firstIndex = 0;
    }
}
