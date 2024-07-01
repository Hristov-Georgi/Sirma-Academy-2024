package generics.genericArrayCreator;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Creates and returns array from given length and item value.
 * All values are equal for the given length.
 */

public class ArrayCreator {

    public static <T> T[] create(int length, T item) {

        T[] arr = (T[]) Array.newInstance(item.getClass(), length);

        Arrays.fill(arr, item);

        return arr;
    }

    public static <T> T[] create(Class<T> clazz, int length, T item) {

        T[] arr = (T[]) Array.newInstance(clazz, length);

        Arrays.fill(arr, item);

        return arr;
    }

}
