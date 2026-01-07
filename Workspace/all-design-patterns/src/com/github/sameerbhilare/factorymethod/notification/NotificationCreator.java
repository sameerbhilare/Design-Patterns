package com.github.sameerbhilare.factorymethod.notification;

public abstract class NotificationCreator {

    public abstract Notification createNotification();

    public void notifyUser() {
        Notification notification = createNotification();
        notification.send();
    }

}
