package com.github.sameerbhilare.iterator.generics;

import java.util.Arrays;

public class Collection<T> {

    private T[] names;

    @SafeVarargs
    public Collection(T... names) {
        this.names = Arrays.copyOf(names, names.length);
    }

    public Iterator<T> iterator() {
        return new CollectionIterator<>();
    }

    private class CollectionIterator<T> implements Iterator<T> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public T next() {
            return (T) names[index++];
        }
    }
}
