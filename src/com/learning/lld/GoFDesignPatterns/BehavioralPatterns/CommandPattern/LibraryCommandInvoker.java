package com.learning.lld.GoFDesignPatterns.BehavioralPatterns.CommandPattern;

public class LibraryCommandInvoker
{
    public void executeCommand(LibraryCommand command)
    {
        command.execute();
    }
}
