package com.learning.lld.GoFDesignPatterns.StructuralPatterns.DecoratorPattern;

public class Main
{
    public static void main(String[] args)
    {
        Notification email=new EmailNotification();

        Notification loggedEmail=new LoggingDecorator(email);

        loggedEmail.send("Hola!");

    }
}
