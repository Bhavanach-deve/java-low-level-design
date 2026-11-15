package com.learning.lld.GoFDesignPatterns.BehavioralPatterns.VisitorPattern;

public class ReplacementCostVisitor implements LibraryVisitor
{

    @Override
    public void visit(Book book) {
        System.out.println(book.getTitle()+" replacement cost: Rs. "+book.getReplacementCost());
    }

    @Override
    public void visit(Magazine magazine) {
        System.out.println(
                magazine.getTitle() + " replacement cost: Rs. "
                        + magazine.getReplacementCost()
        );
    }

    @Override
    public void visit(DVD dvd)
    {
        System.out.println(
                dvd.getTitle() + " replacement cost: Rs."
                        + dvd.getReplacementCost()
        );

    }
}
