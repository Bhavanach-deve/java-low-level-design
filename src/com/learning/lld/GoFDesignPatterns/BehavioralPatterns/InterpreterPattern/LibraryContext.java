package com.learning.lld.GoFDesignPatterns.BehavioralPatterns.InterpreterPattern;

public class LibraryContext
{
    private boolean memberActive;
    private boolean bookAvailable;

    public LibraryContext(boolean memberActive, boolean bookAvailable){
        this.memberActive = memberActive;
        this.bookAvailable = bookAvailable;
    }

    public boolean isMemberActive() {
        return memberActive;
    }

    public boolean isBookAvailable() {
        return bookAvailable;
    }
}
