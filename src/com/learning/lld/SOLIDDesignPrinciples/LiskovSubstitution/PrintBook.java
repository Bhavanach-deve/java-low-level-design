package com.learning.lld.SOLIDDesignPrinciples.LiskovSubstitution;


public class PrintBook implements Readable,Borrowable
{

    @Override
    public void borrowBook(String message) {
        System.out.println("PrintBook borrowed");
    }

    @Override
    public void returnBook(String message)
    {
        System.out.println("PrintedBook returned");

    }

    @Override
    public void readBook(String message) {
        System.out.println("Reading PrintBook ");
    }
}
