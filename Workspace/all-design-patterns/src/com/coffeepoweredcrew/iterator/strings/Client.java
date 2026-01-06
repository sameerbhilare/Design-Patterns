package com.coffeepoweredcrew.iterator.strings;

public class Client {

    public static void main(String[] args) {

        Collection<String> collection = new NameCollection("Sameer", "Bhilare");

        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
