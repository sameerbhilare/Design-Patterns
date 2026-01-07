package com.github.sameerbhilare.factorymethod.notification;

public class Client {

    public static void main(String[] args) {

        NotificationCreator emailNotificationCreator = new EmailNotificationCreator();
        emailNotificationCreator.notifyUser();

        NotificationCreator smsNotificationCreator = new SmsNotificationCreator();
        smsNotificationCreator.notifyUser();
    }
}
