package com.learning.lld.GoFDesignPatterns.BehavioralPatterns.MediatorPattern;

public interface LibraryMediator
{
    void notify(Object sender,String event);
}
//The interface defines the communication contract.