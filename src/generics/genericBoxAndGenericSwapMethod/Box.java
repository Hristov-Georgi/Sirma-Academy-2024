package generics.genericBoxAndGenericSwapMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Stores any type of data.
 */

public class Box<T>{

    private List<T> storage;

    public Box() {
        this.storage = new ArrayList<>();
    }

    /**
     * Return collection of stored data.
     */
    public List<T> getStorage() {
        return storage;
    }

    /**
     * Add item(data) to the collection.
     */
    public void setStorage(T item) {
        this.storage.add(item);
    }

    /**
     * Swap two elements at given indexes.
     */

    public void swap(int[] indexes) {
        int firstIndex = indexes[0];
        int secondIndex = indexes[1];

        if (validateIndexes(firstIndex, secondIndex)) {

            T firstObject = this.storage.get(firstIndex);
            this.storage.set(firstIndex, this.storage.get(secondIndex));
            this.storage.set(secondIndex, firstObject);

        }

    }

    /**
     * Checks if indexes are in bounds and if they are equal.
     * Return true if they are in bounds and not equal, otherwise returns false.
     */

    private boolean validateIndexes(int firstIndex, int secondIndex) {

        if (firstIndex < 0 || firstIndex >= this.storage.size()) {
            return false;
        } else if (secondIndex < 0 || secondIndex >= this.storage.size()) {
            return false;
        } else return firstIndex != secondIndex;

    }

    /**
     * Return StringBuilder with all stored data in required format for printing.
     */
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        for (T t : this.storage) {
            sb.append(t.getClass().getName())
                    .append(": ")
                    .append(t)
                    .append(System.lineSeparator());
        }

        return sb.toString();

    }

}
