package com.learning.lld.SOLIDDesignPrinciples.OpenClosedPrinciple.Main;

import com.learning.lld.SOLIDDesignPrinciples.OpenClosedPrinciple.NotificationService.NotifyMeService;
import com.learning.lld.SOLIDDesignPrinciples.OpenClosedPrinciple.NotificationChannel;
import com.learning.lld.SOLIDDesignPrinciples.OpenClosedPrinciple.SMSNotification;

public class Main
{
    public static void main(String[] args)
    {
        NotifyMeService n=new NotifyMeService();
        NotificationChannel in=new SMSNotification();
        n.notify(in,"Your book's deadline is due tomorrow");
    }
}
