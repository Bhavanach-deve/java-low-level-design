package com.learning.lld.GoFDesignPatterns.BehavioralPatterns.VisitorPattern;

public class Magazine implements LibraryItem
{
    private String title;
    private double replacementCost;

    public Magazine(String title, double replacementCost){
        this.title = title;
        this.replacementCost = replacementCost;
    }
    public String getTitle() {
        return title;
    }
    public double getReplacementCost() {
        return replacementCost;
    }


    public void accept(LibraryVisitor visitor)
    {
        visitor.visit(this);
    }
}
