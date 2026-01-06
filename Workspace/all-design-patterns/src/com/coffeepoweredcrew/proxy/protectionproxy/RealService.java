package com.coffeepoweredcrew.proxy.protectionproxy;

public class RealService implements Service {

    @Override
    public void execute() {
        System.out.println("Executing sensitive operation.");
    }
}
