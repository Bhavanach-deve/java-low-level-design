package com.learning.lld.GoFDesignPatterns.StructuralPatterns.BridgePattern;

public class WhatsAppNotification extends Notification
{
    public WhatsAppNotification(MessageSender sender){
        super(sender);
    }


    @Override
    public void send(String recipient, String message) {
        String whatsappMessage="[WHATSAPP]"+ message;
        sender.sendMessage(recipient,whatsappMessage);
    }
}
