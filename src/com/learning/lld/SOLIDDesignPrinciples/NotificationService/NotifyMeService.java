package com.learning.lld.SOLIDDesignPrinciples.NotificationService;

import com.learning.lld.SOLIDDesignPrinciples.Notifications.NotificationChannel;

public class NotifyMeService
{
    public void notify(NotificationChannel notification, String message){
        notification.sendNotification(message);
    }
}
