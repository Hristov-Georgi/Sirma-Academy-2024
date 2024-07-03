package generics.customList;

import java.util.Arrays;

public class MyCustomList<E extends Comparable<E>> implements CustomList<E> {
    private static final int INITIAL_ARRAY_SIZE = 16;

    private E[] array;
    private int size = 0;
    private int capacity = INITIAL_ARRAY_SIZE;

    public MyCustomList() {
        this.array = (E[]) new Comparable[INITIAL_ARRAY_SIZE];
    }


    @Override
    public void add(E element) {

        if (size == this.capacity) {
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
            copyArrElementsAfterRemove(index);
            this.array[this.size - 1] = null;
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

        for(int i = 0; i < this.size; i++) {

            if (this.array[i].compareTo(element) == 0) {
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

        for (int i = 0; i < this.size; i++) {

            if (this.array[i].compareTo(element) > 0) {
                counter++;
            }

        }

        return counter;
    }

    @Override
    public E getMax() {

        if (this.size > 0) {
            E maxElement = this.array[0];

            for (int i = 1; i < this.size; i++) {

                if (this.array[i].compareTo(maxElement) > 0) {
                    maxElement = this.array[i];
                }

            }
            return maxElement;

        }

        throw new NullPointerException("Cannot get maximum element of empty list collection.");

    }

    @Override
    public E getMin() {

        if (this.size > 0) {
            E minElement = this.array[0];

            for (int i = 1; i < this.size; i++) {

                if (this.array[i].compareTo(minElement) < 0) {
                    minElement = this.array[i];
                }

            }
            return minElement;

        }

        throw new NullPointerException("Cannot get minimum element of empty list collection.");

    }

    @Override
    public void printAllElements() {

        for (int i = 0; i < this.size; i++) {
            System.out.println(this.array[i]);
        }

    }

    private void copyArrElementsAfterRemove(int index) {

        for (int i = index; i < size - 1 ; i++) {
            this.array[i] = this.array[i + 1];
        }

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
