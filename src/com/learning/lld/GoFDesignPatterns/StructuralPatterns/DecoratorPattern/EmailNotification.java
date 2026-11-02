package com.learning.lld.GoFDesignPatterns.StructuralPatterns.DecoratorPattern;

public class EmailNotification implements Notification
{
    @Override
    public void send(String message)
    {
        System.out.println("Email: "+message);
    }
}
