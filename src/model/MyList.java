package model;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyList<E> {
    private int side = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object element[];

    public MyList() {
        element = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa() {
        int newSide = element.length * 2;
        element = Arrays.copyOf(element,newSide);
    }

    public void add(E e) {
        if (side == element.length) {
            ensureCapa();
        }
        element[side++] = e;
    }

    public E get(int i) {
        if (i >= side || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) element[i];
    }
}
