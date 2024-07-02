package generics.customList;

import java.util.Arrays;

public class MyCustomList<E extends Comparable<E>> implements CustomList<E> {
    private static final int INITIAL_ARRAY_SIZE = 16;

    private E[] array;
    private int size = 0;
    private int capacity = INITIAL_ARRAY_SIZE;

    public MyCustomList() {
        this.array = (E[]) new Object[INITIAL_ARRAY_SIZE];
    }


    @Override
    public void add(E element) {

        if (size > this.capacity - 1) {
            increaseCapacity();
        }

        this.array[this.size] = element;
        this.size++;
    }

    @Override
    public E remove(int index) {
        E element;

        if (isIndexInBounds(index)) {
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
    public boolean contains(E element) {

        for(E e : this.array) {

            if (e.compareTo(element) == 0) {
                return true;
            }

        }

        return false;
    }

    @Override
    public void swap(int firstIndex, int secondIndex) {

        if (isIndexInBounds(firstIndex, secondIndex)) {
            E element = this.array[firstIndex];
            this.array[firstIndex] = this.array[secondIndex];
            this.array[secondIndex] = element;
        }

    }

    @Override
    public int countGreaterThan(E element) {
        int counter = 0;

        for (E e : this.array) {

            if (e.compareTo(element) > 0) {
                counter++;
            }

        }

        return counter;
    }

    @Override
    public E getMax() {
        return null;
    }

    @Override
    public E getMin() {
        return null;
    }

    private void copyArrElementsAfterRemove(int index) {

        E[] newArr = Arrays.copyOfRange(this.array, 0, index);

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

    private boolean isIndexInBounds(int index) {
        return 0 <= index && index < this.size;
    }

    private boolean isIndexInBounds(int firstIndex, int secondIndex) {
        return 0 <= firstIndex &&
                firstIndex < this.size &&
                0 <= secondIndex &&
                secondIndex < this.size;
    }

}
