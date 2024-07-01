package generics.genericBox;

import java.util.ArrayList;
import java.util.List;

public class Box<T>{

    private List<T> storage;

    public Box() {
        this.storage = new ArrayList<>();
    }

    public List<T> getStorage() {
        return storage;
    }

    public void setStorage(T item) {
        this.storage.add(item);
    }

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
