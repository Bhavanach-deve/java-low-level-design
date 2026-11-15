package com.learning.lld.GoFDesignPatterns.BehavioralPatterns.VisitorPattern;

public class Book implements LibraryItem
{
    private String title;
    private double replacementCost;

    public Book(String name, double replacementCost)
    {
        this.title = name;
        this.replacementCost = replacementCost;
    }
    public String getTitle()
    {
        return title;
    }
    public double  getReplacementCost()
    {
        return replacementCost;
    }

    @Override
    public void accept(LibraryVisitor visitor)
    {
        visitor.visit(this);
    }
}
