package generics.jarOfT;

import java.util.ArrayDeque;

/**
 * Store a collection of elements.
 * @param <E>
 */

public class Jar<E> {

    private ArrayDeque<E> jar;

    public Jar() {
        this.jar = new ArrayDeque<>();
    }

    /**
     * Add element on top of the collection.
     */
    public void add(E element){
        this.jar.push(element);
    }

    /**
     * Removes the topmost element from the collection and returns removed element.
     */
    public E remove(){
        return this.jar.pop();
    }

}
