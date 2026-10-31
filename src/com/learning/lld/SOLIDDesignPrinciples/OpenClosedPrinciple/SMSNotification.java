package com.learning.lld.SOLIDDesignPrinciples.OpenClosedPrinciple;

public class SMSNotification implements NotificationChannel
{
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS Notification: "+message);
    }
}
