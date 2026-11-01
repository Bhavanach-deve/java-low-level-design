package com.learning.lld.GoFDesignPatterns.StructuralPatterns.BridgePattern;

public class ProviderA implements MessageSender
{

    @Override
    public void sendMessage(String recipient, String message) {
        System.out.println("Provider A sending a message to " + recipient+": "+message);
    }
}
