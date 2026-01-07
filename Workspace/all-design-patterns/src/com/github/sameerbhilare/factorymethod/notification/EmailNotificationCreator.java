package com.github.sameerbhilare.factorymethod.notification;

public class EmailNotificationCreator extends NotificationCreator{

    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
