package com.coffeepoweredcrew.iterator.strings;

public class NameCollection implements Collection<String> {

    private String[] names;

    public NameCollection(String... names) {
        this.names = names;
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
