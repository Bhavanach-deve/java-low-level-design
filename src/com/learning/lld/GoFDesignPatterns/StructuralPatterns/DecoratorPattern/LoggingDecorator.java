package com.learning.lld.GoFDesignPatterns.StructuralPatterns.DecoratorPattern;

public class LoggingDecorator implements Notification
{
    private Notification notification;

    public LoggingDecorator(Notification notification)
    {
        this.notification = notification;
    }

    @Override
    public void send(String message) {
        System.out.println("Log: Sending notification.... ");
        notification.send(message);
    }
}
//The decorator implements the same interface as the original object, and it contains another object of that interface.