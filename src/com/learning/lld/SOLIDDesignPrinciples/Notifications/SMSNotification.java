package com.learning.lld.SOLIDDesignPrinciples.Notifications;

public class SMSNotification implements NotificationChannel
{
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS Notification");
    }
}
