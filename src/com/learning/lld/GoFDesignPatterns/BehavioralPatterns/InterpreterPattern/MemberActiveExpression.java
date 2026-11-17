package com.learning.lld.GoFDesignPatterns.BehavioralPatterns.InterpreterPattern;

public class MemberActiveExpression implements Expression
{

    @Override
    public boolean interpret(LibraryContext context) {
        return context.isMemberActive();
    }
}
