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
            ensureCapacity();
        }

        this.array[this.size] = element;
        this.size++;
    }

    @Override
    public T remove(int index) {
        return null;
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

    private void ensureCapacity() {
        this.capacity *= 2;
        this.array = Arrays.copyOf(this.array, this.capacity);
    }

}
