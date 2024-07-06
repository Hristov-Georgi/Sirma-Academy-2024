package com.sirmaacademy.professionalprogram.generics.genericscale;

/**
 * Represents a scale, accepts two parameters.
 */

public class Scale<T extends Comparable<T>> {

    private T left;
    private T right;

    public Scale(T left, T right) {
        this.left = left;
        this.right = right;
    }

    /**
     * Compares the two class variables and returns the bigger one or null if they are equal.
     */

    public T getHeavier() {

        if (this.left.compareTo(this.right) > 0) {
            return left;
        } else if (this.left.compareTo(this.right) < 0) {
            return right;
        } else {
            return null;
        }

    }

}
