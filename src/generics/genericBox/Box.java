package generics.genericBox;

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
