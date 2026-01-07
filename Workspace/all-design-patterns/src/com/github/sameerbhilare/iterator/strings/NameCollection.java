package com.github.sameerbhilare.iterator.strings;

import java.util.Arrays;

public class NameCollection implements Collection<String> {

    private String[] names;

    public NameCollection(String... names) {
        this.names = Arrays.copyOf(names, names.length);
    }

    @Override
    public Iterator<String> iterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator<String> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public String next() {
            return names[index++];
        }
    }
}
