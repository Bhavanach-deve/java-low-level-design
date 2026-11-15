package com.learning.lld.GoFDesignPatterns.BehavioralPatterns.VisitorPattern;

public interface LibraryItem
{
    void accept(LibraryVisitor visitor);
}
