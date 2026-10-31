package com.learning.lld.SOLIDDesignPrinciples.OpenClosedPrinciple;

public class EmailNotification implements NotificationChannel {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Email Notification: "+message);
    }
}
