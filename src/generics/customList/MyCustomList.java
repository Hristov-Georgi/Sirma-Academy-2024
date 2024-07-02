package generics.customList;

public class MyCustomList<T extends Comparable<T>> implements CustomList<T> {


    @Override
    public void add(T element) {

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
}
