package com.learning.lld.GoFDesignPatterns.StructuralPatterns.BridgePattern;

public class Main
{
    public static void main(String[] args)
    {
        MessageSender providerA=new ProviderA();
        MessageSender providerB=new ProviderB();

        Notification email=new EmailNotification(providerA);

        Notification whatsapp=new WhatsAppNotification(providerB);

        email.send("bhavanach@gmail.com","Your profile has been registered!");

        whatsapp.send("9297785461","Your profile has been registered!");

    }
}
//The key achievement: we combined an email notification with Provider A and a WhatsApp notification with Provider B without creating a separate class for each combination.
//EmailNotification inherits from Notification.

//WhatsAppNotification inherits from Notification.

//Notification has a MessageSender.

//ProviderA and ProviderB implement MessageSender.

//The two inheritance relationships are independent of the provider implementation hierarchy. That's what allows both sides to change independently.