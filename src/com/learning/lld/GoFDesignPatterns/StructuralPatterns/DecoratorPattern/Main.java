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
//The decorator implements the same interface as the original object, and it contains another object of that interface.
//
//This allows us to wrap an EmailNotification today and another Notification implementation tomorrow.