package com.learning.lld.GoFDesignPatterns.BehavioralPatterns.VisitorPattern;

public interface LibraryVisitor
{
    void visit(Book book);
    void visit(Magazine magazine);
    void visit(DVD dvd);
}
