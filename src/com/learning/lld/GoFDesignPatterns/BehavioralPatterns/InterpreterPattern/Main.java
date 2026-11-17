package com.learning.lld.GoFDesignPatterns.BehavioralPatterns.InterpreterPattern;

import java.security.spec.ECField;

public class Main
{
    public static void main(String[] args)
    {
        Expression memberActive=new MemberActiveExpression();
        Expression bookAvailable=new BookAvailableExpression();
        Expression borrowingRule=new AndExpression(memberActive,bookAvailable);
        LibraryContext context=new LibraryContext(true,true);
        boolean result=borrowingRule.interpret(context);
        System.out.println("Can borrow book: "+result);
    }
}
