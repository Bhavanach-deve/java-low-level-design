package com.learning.lld.GoFDesignPatterns.StructuralPatterns.BridgePattern;

public class EmailNotification extends Notification {

    public EmailNotification(MessageSender sender) {
        super(sender);
    }

    @Override
    public void send(String recipient, String message)
    {
        String emailMessage="[EMAIL]"+ message;
        sender.sendMessage(recipient,emailMessage);

    }
}
