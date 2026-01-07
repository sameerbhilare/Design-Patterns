package com.github.sameerbhilare.proxy.virtualproxy;

public class Client {

    public static void main(String[] args) {

        Service image = new ImageProxy();
        image.execute();
    }
}
