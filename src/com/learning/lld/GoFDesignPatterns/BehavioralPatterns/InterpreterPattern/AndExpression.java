package com.learning.lld.GoFDesignPatterns.BehavioralPatterns.InterpreterPattern;

public class AndExpression implements Expression
{
    private Expression left;
    private Expression right;
    public AndExpression(Expression left, Expression right)
    {
        this.left = left;
        this.right = right;
    }


    @Override
    public boolean interpret(LibraryContext context)
    {
        return left.interpret(context) && right.interpret(context);
    }
}
