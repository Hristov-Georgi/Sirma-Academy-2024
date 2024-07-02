package generics.customList;

import java.util.Arrays;

public class MyCustomList<T extends Comparable<T>> implements CustomList<T> {
    private static final int INITIAL_ARRAY_SIZE = 16;

    private T[] array;
    private int size = 0;
    private int capacity = INITIAL_ARRAY_SIZE;

    public MyCustomList() {
        this.array = (T[]) new Object[INITIAL_ARRAY_SIZE];
    }


    @Override
    public void add(T element) {

        if (size > this.capacity - 1) {
            increaseCapacity();
        }

        this.array[this.size] = element;
        this.size++;
    }

    @Override
    public T remove(int index) {
        T element;

        if (0 <= index && index < size) {
            element = this.array[index];
            this.array[index] = null;
            copyArrElementsAfterRemove(index);
            this.size--;
        } else {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds.");
        }

        if (this.size < this.capacity / 2) {
            decreaseCapacity();
        }

        return element;
    }

    @Override
    public boolean contains(T element) {
        return false;
    }

    @Override
    public void swap(int firstIndex, int secondIndex) {

    }

    @Override
    public int countGreaterThan(T element) {
        return 0;
    }

    @Override
    public T getMax() {
        return null;
    }

    @Override
    public T getMin() {
        return null;
    }

    private void copyArrElementsAfterRemove(int index) {

        T[] newArr = Arrays.copyOfRange(this.array, 0, index);

        for (int i = index; i < size - 1 ; i++) {
            newArr[i] = this.array[i + 1];
        }

        this.array = newArr;

    }

    private void decreaseCapacity() {
        int newCapacity = this.capacity / 2;
        this.array = Arrays.copyOf(this.array, newCapacity);
        this.capacity = newCapacity;
    }

    private void increaseCapacity() {
        int newCapacity = this.capacity * 2;
        this.array = Arrays.copyOf(this.array, newCapacity);
        this.capacity = newCapacity;
    }

}
