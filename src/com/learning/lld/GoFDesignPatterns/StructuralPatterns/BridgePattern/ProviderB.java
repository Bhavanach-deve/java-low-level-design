package com.learning.lld.GoFDesignPatterns.StructuralPatterns.BridgePattern;

public class ProviderB implements MessageSender
{
    @Override
    public void sendMessage(String recipient, String message) {
        System.out.println("Provider B sending a message to " + recipient+": "+message);
    }
}
