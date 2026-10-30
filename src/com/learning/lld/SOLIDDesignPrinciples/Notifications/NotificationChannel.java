package com.learning.lld.SOLIDDesignPrinciples.Notifications;

public interface NotificationChannel
{
    void sendNotification(String message);
}
//Open for extension: We should be able to add new behavior or features.
//Closed for modification: We should avoid repeatedly changing existing, working code every time a new requirement arrives.