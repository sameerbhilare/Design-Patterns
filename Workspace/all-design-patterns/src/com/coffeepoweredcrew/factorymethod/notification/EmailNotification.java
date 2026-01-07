package com.coffeepoweredcrew.factorymethod.notification;

public class EmailNotification implements Notification {
    @Override
    public void send() {
        System.out.println("Email sent...");
    }
}
