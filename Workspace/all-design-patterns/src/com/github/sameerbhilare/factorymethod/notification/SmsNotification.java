package com.github.sameerbhilare.factorymethod.notification;

public class SmsNotification implements Notification {
    @Override
    public void send() {
        System.out.println("SMS sent...");
    }
}
