package com.github.sameerbhilare.factorymethod.notification;

public class EmailNotification implements Notification {
    @Override
    public void send() {
        System.out.println("Email sent...");
    }
}
