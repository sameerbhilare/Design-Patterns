package com.github.sameerbhilare.iterator.generics;

public class Client {

    public static void main(String[] args) {

        // with strings
        Collection<String> collection = new Collection<>("Sameer", "Bhilare");
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
        }
        System.out.println();

        // with integers
        Collection<Integer> collection2 = new Collection<>(100, 200);
        Iterator<Integer> iterator2 = collection2.iterator();
        while (iterator2.hasNext()) {
            System.out.print(iterator2.next() + ", ");
        }

    }
}
