package com.learning.lld.GoFDesignPatterns.StructuralPatterns.BridgePattern;

public abstract class Notification
{
    protected final MessageSender sender;

    public Notification(MessageSender sender)
    {
        this.sender = sender;
    }
    public abstract void send(String recipient, String message);
}
