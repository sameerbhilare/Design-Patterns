package com.github.sameerbhilare.proxy.virtualproxy;

public class ImageProxy implements Service {

    private Image image;

    public ImageProxy() {
        System.out.println("Creating Proxy...");
    }

    @Override
    public void execute() {
        System.out.println("Executing Proxy...");
        if (image == null) {
            image = new Image();
        }

        image.execute();
    }

    private Image initImage() {
        // heavy / expensive operation
        return new Image();
    }
}
