package com.coffeepoweredcrew.factorymethod.notification;

public class SmsNotificationCreator extends NotificationCreator{

    @Override
    public Notification createNotification() {
        return new SmsNotification();
    }
}
