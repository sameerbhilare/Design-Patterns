package com.github.sameerbhilare.proxy.virtualproxy;

// Real Object (Heavy / Expensive)
public class Image implements Service {

    public Image() {
        System.out.println("Loading real image from disk...");
    }

    @Override
    public void execute() {
        System.out.println("Displaying real image.");
    }
}
