package com.learning.lld.GoFDesignPatterns.BehavioralPatterns.VisitorPattern;

public class DVD implements LibraryItem
{
    private String title;
    private double replacementCost;

    public DVD(String title, double replacementCost){
        this.title = title;
        this.replacementCost = replacementCost;
    }
    public String getTitle() {
        return title;
    }
    public double getReplacementCost() {
        return replacementCost;
    }

    @Override
    public void accept(LibraryVisitor visitor) {
        visitor.visit(this);
    }
}
