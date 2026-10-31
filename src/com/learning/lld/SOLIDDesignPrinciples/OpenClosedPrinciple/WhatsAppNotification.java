package com.learning.lld.SOLIDDesignPrinciples.OpenClosedPrinciple;

public class WhatsAppNotification implements NotificationChannel {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending WhatsApp Notification: "+message);
    }
}
