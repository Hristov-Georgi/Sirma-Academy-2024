package com.sirmaacademy.professionalprogram.generics.customlist;

public interface CustomList<E> {

    void add(E element);

    E remove(int index);

    boolean contains(E element);

    void swap(int firstIndex, int secondIndex);

    int countGreaterThan(E element);

    public E getMax();

    public E getMin();

    void printAllElements();
}
