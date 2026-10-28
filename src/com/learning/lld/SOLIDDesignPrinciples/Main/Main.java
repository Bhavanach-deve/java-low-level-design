package com.learning.lld.SOLIDDesignPrinciples.Main;

import com.learning.lld.SOLIDDesignPrinciples.NotificationService.NotifyMeService;
import com.learning.lld.SOLIDDesignPrinciples.Notifications.NotificationChannel;
import com.learning.lld.SOLIDDesignPrinciples.Notifications.SMSNotification;

public class Main
{
    public static void main(String[] args)
    {
        NotifyMeService n=new NotifyMeService();
        NotificationChannel in=new SMSNotification();
        n.notify(in,"Your book's deadline is due tomorrow");
    }
}
