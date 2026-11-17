package com.learning.lld.GoFDesignPatterns.BehavioralPatterns.InterpreterPattern;

public class BookAvailableExpression implements Expression
{
    @Override
    public boolean interpret(LibraryContext context) {
        return context.isBookAvailable();
    }
}
