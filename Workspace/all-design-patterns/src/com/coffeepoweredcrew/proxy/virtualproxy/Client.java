package com.coffeepoweredcrew.proxy.virtualproxy;

public class Client {

    public static void main(String[] args) {

        Service image = new ImageProxy();
        image.execute();
    }
}
