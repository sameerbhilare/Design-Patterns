package com.coffeepoweredcrew.factorymethod.notification;

public class EmailNotificationCreator extends NotificationCreator{

    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
