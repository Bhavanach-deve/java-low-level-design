package com.learning.lld.SOLIDDesignPrinciples.Notifications;

public class EmailNotification implements NotificationChannel {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Email Notification");
    }
}
