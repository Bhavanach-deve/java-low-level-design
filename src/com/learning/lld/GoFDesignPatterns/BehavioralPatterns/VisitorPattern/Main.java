package com.learning.lld.GoFDesignPatterns.BehavioralPatterns.VisitorPattern;

public class Main
{
    public static void main(String[] args)
    {
        LibraryItem[]items={new Book("Java Basics",500),new Magazine("Tech Monthly",150),new DVD("Java Tutorials",300)};
        LibraryVisitor visitor=new ReplacementCostVisitor();
        for(LibraryItem item:items)
        {
            item.accept(visitor);
        }


    }
}
