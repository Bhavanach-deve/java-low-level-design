package com.learning.lld.SOLIDDesignPrinciples.LiskovSubstitution;

public interface Borrowable
{
    void borrowBook(String message);
    void returnBook(String message);
}
