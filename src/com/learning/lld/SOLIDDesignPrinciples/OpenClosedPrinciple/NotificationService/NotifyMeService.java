package com.learning.lld.SOLIDDesignPrinciples.OpenClosedPrinciple.NotificationService;

import com.learning.lld.SOLIDDesignPrinciples.OpenClosedPrinciple.NotificationChannel;

public class NotifyMeService
{
    public void notify(NotificationChannel notification, String message){
        notification.sendNotification(message);
    }
}
